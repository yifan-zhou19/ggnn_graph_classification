public class a
{
	public char[][] s = new char[6][100];
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static a head = new a();
	public static int tot = 0;

	public static void init()
	{
		int i;
		a p;
		head.next = null;
		while (true)
		{
			p = new a();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.s[0] = tempVar.charAt(0);
			}
			if (!strcmp(p.s[0],"end"))
			{
				break;
			}
			for (i = 1;i < 6;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p.s[i] = tempVar2.charAt(0);
				}
			}
			p.next = head.next;
			head.next = p;
		}
	}

	public static void print()
	{
		a p = head.next;
		int i;
		while (p != null)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%s ",p.s[i]);
			}
			System.out.println(p.s[i]);
			p = p.next;
		}
	}

	public static int Main()
	{
		init();
		print();
		return 0;
	}

}

