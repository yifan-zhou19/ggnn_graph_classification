package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char j;
		char i;
		int m;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (j = 'A';j <= 'Z';j++)
		{
			m = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == j)
				{
					m++;
				}
			}
			if (m != 0)
			{
				System.out.printf("%c=%d\n",j,m);
				p = 1;
			}
			else
			{
				p = 0;
			}
		}
		for (j = 'a';j <= 'z';j++)
		{
			m = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == j)
				{
					m++;
				}
			}
			if (m != 0)
			{
				System.out.printf("%c=%d\n",j,m);
				if (p == 0)
				{
					p = 1;
				}
			}
			if (m == 0)
			{
				if (p == 1)
				{
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

