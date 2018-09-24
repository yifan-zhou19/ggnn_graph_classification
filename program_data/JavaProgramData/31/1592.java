public class student
{
	public String str = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static final String end = "end";

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.str = new Scanner(System.in).nextLine();
		head = null_Renamed;
		while (strcmp(p1.str,end) != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.str = new Scanner(System.in).nextLine();
		}
		p2.next = null_Renamed;
		return (head);
	}

	public static void Main()
	{
		student p1;
		student p2;
		student p3;
		student head;
		head = creat();
		p1 = head;
		p2 = p1.next;
		p3 = p2.next;
		while (p3 != null_Renamed)
		{
			p2.next = p1;
			p1 = p2;
			p2 = p3;
			p3 = p2.next;
		}
		p2.next = p1;
		head.next = null_Renamed;
		do
		{
			System.out.printf("%s\n",p2.str);
			p2 = p2.next;
		} while (p2 != null_Renamed);
	}

}
