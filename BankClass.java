import java.sql.*;
import java.util.*;
public class BankClass {

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/bank";
		String uname="root";
		String pass="dspn@123";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Scanner sc=new Scanner(System.in);
		
		int choice;
		do {
		System.out.println("\n--Menu--");
		System.out.println("1.Fetch data");
		System.out.println("2.Insert data");
		System.out.println("3.Update data");
		System.out.println("4.Delete data");
		System.out.println("5.Exit");
		
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				System.out.print("To fetch data");
				String query1="Select id,name from employee Limit ?";
				PreparedStatement pst1=con.prepareStatement(query1);
				pst1.setInt(1,4);
				ResultSet rs=pst1.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt("id")+" "+ rs.getString("name"));
				}
				pst1.close();
				break;
				
			case 2:
				System.out.print("To insert data");
				String query2="Insert into employee (id,name) value (?,?)";
				PreparedStatement pst2=con.prepareStatement(query2);
				
				System.out.println("enter id:");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter name:");
				String name=sc.nextLine();
				
				pst2.setInt(1, id);
				pst2.setString(2, name);
				int rows=pst2.executeUpdate();
				
				if(rows>0)
				{
					System.out.println("Employee added successfully!");
				}
				pst2.close();
				break;
				
			case 3:
				System.out.println("To update data");
				String query3="update employee set name=? where id=?";
				PreparedStatement pst3=con.prepareStatement(query3);
				
				System.out.print("Enter id to update");
				int id3=sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter new name:");
				String name3=sc.nextLine();
				
				pst3.setString(1, name3);
				pst3.setInt(2, id3);
				
				int rows3=pst3.executeUpdate();
				
				if(rows3>0)
				{
					System.out.print("Employee updated");
				}
				else
				{
					System.out.println("Cannot update employee");
				}
				pst3.close();
				break;
				
				
			case 4:
				System.out.println("To delete data");
				String query4="Delete from employee where id=?";
				PreparedStatement pst4=con.prepareStatement(query4);
				
				sc.nextLine();
				System.out.println("Enter id to delete");
				int id4=sc.nextInt();
				
				pst4.setInt(1,id4);
				int rows4=pst4.executeUpdate();
				
				if(rows4>0)
				{
					System.out.println("Employee deleted sucessfully");
				}
				else
				{
					System.out.println("Employee cannot be deleted");
				}
				pst4.close();
				break;
				
			
			case 5:
				System.out.print("Exit");
				break;
			default:
				System.out.println("Enter valid data");
				
		
		}
		} while (choice!=5);
				
		
		
		sc.close();
		con.close();
	}

}
