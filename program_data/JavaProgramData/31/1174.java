public class student
{
	public String str = new String(new char[50]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student head;
		student temp;
		student end;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = end = temp = (student) malloc(LEN);
		temp.str = new Scanner(System.in).nextLine();
		while (temp.str.charAt(0) != 'e')
		{
			temp.next = head;
			head = temp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			temp = (student) malloc(LEN);
			temp.str = new Scanner(System.in).nextLine();
		}
		end.next = null;
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		while (p != null)
		{
			System.out.println(p.str);
			p = p.next;
		}
	}
	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}
}
