public class student
{
	public String s = new String(new char[200]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static student creat()
	{
		String k = new String(new char[200]);
		student p;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p = (student)malloc(LEN);
		while (true)
		{
			k = new Scanner(System.in).nextLine();
			if (!(strcmp(k,"end")))
			{
			break;
			}
			else
			{
				if (n == 0)
				{
					head.next = null;
					n = 1;
				}
				else
				{
				p.next = head;
				}
				head = p;
				p.s = k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p = (student)malloc(LEN);
			}
		}
		p = null;
		return (head);
	}
	public static void print(student p)
	{
		if (p != null)
		{
			System.out.println(p.s);
			print(p.next);
		}
	}
	public static int Main()
	{
		student head;
		head = creat();
		print(head);
		return 0;
	}

}
