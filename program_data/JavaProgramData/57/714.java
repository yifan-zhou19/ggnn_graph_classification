package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		String a = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		m = a.length();
		if (a.charAt(m - 1) == 'g' && a.charAt(m - 2) == 'n' && a.charAt(m - 3) == 'i')
		{
			for (j = 0;j < m - 3;j++)
			{
			System.out.printf("%c",a.charAt(j));
		if (j == m - 4)
		{
		System.out.print("\n");
		}
			}
		}
		else
		{
			for (j = 0;j < m - 2;j++)
			{
			System.out.printf("%c",a.charAt(j));
		if (j == m - 3)
		{
		System.out.print("\n");
		}
			}
		}
		}
	}
}

