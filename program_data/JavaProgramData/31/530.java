public class q
{
	public String a = new String(new char[100]);
	public q last;
}

package <missing>;

public class GlobalMembers
{
	public static q c()
	{
		q p1;
		q p2;
		q end;
		int t = 1;
		while (0 == 0)
		{
			p1 = new q();
			p1.a = new Scanner(System.in).nextLine();
			if (t == 1)
			{
				p1.last = null;
				p2 = p1;
				t = 0;
			}
			else
			{
				if (p1.a.charAt(0) != 'e')
				{
					p1.last = p2;
					p2 = p1;
				}
				else
				{
					end = p2;
					break;
				}
			}
		}
		return end;
	}
	public static int Main()
	{
		q p1;
		p1 = c();
		while (p1 != null)
		{
			System.out.println(p1.a);
			p1 = p1.last;
		}
	}

}
