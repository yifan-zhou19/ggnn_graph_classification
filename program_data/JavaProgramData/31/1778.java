public class student
{
		public student pre;
		public String s = new String(new char[100]);
		public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p1.s = new Scanner(System.in).nextLine();
		p1.pre = null;
		p1.next = null;

		p2 = p1;
		while (strcmp(p1.s,"end"))
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p1.s = new Scanner(System.in).nextLine();
		p1.pre = p2;
		p2.next = p1;
		p1.next = null;
		p2 = p1;
		}
		return (p1.pre);
	}

	public static void print(student end)
	{
		while (end != null)
		{
		System.out.println(end.s);
		end = end.pre;
		}
	}




	public static void Main()
	{
		student end;
		end = creat();
		print(end);
	}
}
