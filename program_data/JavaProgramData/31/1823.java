public class stu
{
	public String a = new String(new char[100]);
	public stu prev;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu end;
		stu p1;
		stu p2;
		stu head;
		int m;
		int n;
		int j;
		p1 = new stu();
		end = p1;
		p2 = p1;
		p1.a = new Scanner(System.in).nextLine();
		p1.next = null;
		scanf("\n");
		for (;;)
		{
			p1 = new stu();
			p1.a = new Scanner(System.in).nextLine();
			scanf("\n");
			if (strcmp(p1.a,"end") == 0)
			{
				head = p2;
				break;
			}
			else
			{
				p1.next = p2;
				p2 = p1;
			}
		}
		for (;head != 0;head = head.next)
		{
			System.out.println(head.a);
		}
	}

}
