public class student
{
	public String num = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		student head;
		student p1;
		student p2;
		student p;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student) malloc(LEN);
		p1.num = new Scanner(System.in).nextLine();
		head = null;
		while (strcmp(p1.num,"end") != 0)
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
			p1 = (student) malloc(LEN);
			p1.num = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		for (i = 0;i < n;i++)
		{
			p = head;
			while (p.next != null)
			{
				p1 = p;
				p = p.next;
			}
			System.out.printf("%s\n",p.num);
			p1.next = null;
		}
	}
}
