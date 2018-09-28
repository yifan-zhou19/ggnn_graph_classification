package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int m = 0;
		int n = 0;
		char c;
		for (i = 1;i > 0;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (a > m)
			{
				n = m;
				m = a;
			}
			else if (a > n && a < m)
			{
				n = a;
			}
			if (c == '\n')
			{
				break;
			}
		}
		if (n != 0)
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.print("No");
		}

		return 0;
	}
}

