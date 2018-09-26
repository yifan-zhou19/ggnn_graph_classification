public class st
{
	public String id = new String(new char[10000]);
	public st next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		st head = null;
		st p = null;
		st q = null;
		char end;
		while (true)
		{
			p = new st();
			if (p != null)
			{
				p.id = new Scanner(System.in).nextLine();
				p.next = q;
				if (p.id.charAt(0) == 'e')
				{
					break;
				}
				else
				{
				q = p;
				}

			}
		}

		p = p.next;
		while (true)
		{
			System.out.println(p.id);
			if (p.next == null)
			{
				break;
			}
			p = p.next;


		}

	}
}
