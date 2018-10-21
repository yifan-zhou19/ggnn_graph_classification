public class student
{
	public String inf = new String(new char[100]);
	public student next;
	public student last;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student end;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.inf = new Scanner(System.in).nextLine();
		head = null;
		while (true)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
				p1.last = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.inf = new Scanner(System.in).nextLine();
			if ((p1.inf).charAt(0) == 'e')
			{
				break;
			}
		}
		head.last = null;
		p2.next = null;
		end = p2;
		return (head);
	}
	public static int Main()
	{
		student head;
		student p1;
		student p2;
		head = creat();
		p1 = end;
		while (p1 != null)
		{
			p2 = p1;
			System.out.println(p1.inf);
			p1 = p2.last;
		}
	}


}
