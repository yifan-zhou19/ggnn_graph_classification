package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int k;
		int l;
		int n;
		char[] c = {' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] cc = {' ', '\0', '\0', '\0'};
		while (!(feof(stdin)))
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cc = tempVar2.charAt(0);
			}
			l = c.length() - 1;
			m = 0;
			for (i = 0;i <= l;i++)
			{
				if (c[i] > c[m])
				{
					m = i;
				}
			}
			for (i = 0;i <= m;i++)
			{
				System.out.print(c[i]);
			}
			System.out.printf("%s",cc);
			for (i = m + 1;i <= l;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
		}
		return 7;
	}
}

