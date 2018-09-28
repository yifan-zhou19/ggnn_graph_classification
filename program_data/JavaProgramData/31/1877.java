public class student
{
	public String data = new String(new char[500]);
	public student former;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student create()
	{
		student tail;
		student p1;
		student p2;
		n = 0;
		p1 = p2 = new student();
		p1.data = new Scanner(System.in).nextLine();
		tail = null;
		while (strcmp(p1.data,"end") != 0)
		{
			n = n + 1;
			if (n == 1)
			{
				tail = p1;
				p1.former = null;
			}
			else
			{
				tail = p1;
				p1.former = p2;
				p2 = p1;
			}
			p1 = new student();
			p1.data = new Scanner(System.in).nextLine();
		}


		return (tail);
	}
	public static int Main()
	{

		student p;
		student start;
		p = create();
		start = p;
		if (p != null)
		{
			do
			{
				System.out.println(start.data);
				start = start.former;
			} while (start != null);
		}
	}


}
