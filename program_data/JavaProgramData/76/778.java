package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int[] s = new int[10001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (j = a + 1;j <= b - 1;j++)
			{
				s[j] = 1;
			}
			if (s[a] == 0)
			{
				s[a] = 2;
			}
			else
			{
				s[a] = 1;
			}
			if (s[b] == 0)
			{
				s[b] = 2;
			}
			else
			{
				s[b] = 1;
			}
		}
		for (i = 1;i < 10001;i++)
		{
			if (s[i] != 0)
			{
				c = i;
				break;
			}
		}
		for (i = 10000;i >= 1;i--)
		{
			if (s[i] != 0)
			{
				d = i;
				break;
			}
		}
		for (i = c + 1;i <= d - 1;i++)
		{
			if ((s[i] == 0) || (s[i] == 2))
			{
				System.out.print("no\n");
				break;
			}

		}
		if (i == d)
		{
			System.out.printf("%d %d\n",c,d);
		}
		return 0;
	}
}

