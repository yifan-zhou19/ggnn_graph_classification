public class stu
{
		public String text = new String(new char[100]);
		public stu prev;
}

package <missing>;

public class GlobalMembers
{
	public static stu create()
	{
		stu p1;
		stu p2;
		stu start;
		p1 = new stu();
		p1.text = new Scanner(System.in).nextLine();
		if (p1.text.equals("end"))
		{
			p1 = null;
			start = null;
			return start; //?????
		}
		else
		{
			p1.prev = null;
			start = p1;
			p2 = p1;
			do
			{
				p1 = new stu();
				start = p2;
				p1.text = new Scanner(System.in).nextLine();
				if (strcmp(p1.text,"end") == 0)
				{
					p1 = null;
					break;
				}
				else
				{
					p1.prev = p2;
					p2 = p1;
				}
			} while (1 != 0);
			return start; //?????
		}
	}
	public static int Main()
	{
		stu p;
		p = create();
		while (p != null)
		{
			 System.out.printf("%s\n", p.text);
			 p = p.prev;
		}
		return 0;
	}
}
