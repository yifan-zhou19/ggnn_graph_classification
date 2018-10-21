package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] c = new int[100000];
		int i;
		int e;
		int j;
		int t;
		int flag = 0;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (e = 2;e < i;e++)
			{
				if (i % e == 0)
				{
					c[i] = -1;
					break;
				}
			}
			if (c[i] == 0)
			{
				a = String.format("%d", i);
				t = a.length();
				for (j = 0;j < t;j++)
				{
					if (a.charAt(j) != a.charAt(t - j - 1))
					{
						c[i] = 1;
						break;
					}
				}
			}
		}
		for (i = m;i <= n;i++)
		{
			if (c[i] == 0 && flag == 0)
			{
				System.out.printf("%d", i);
				flag = 1;
			}
			else if (c[i] == 0 && flag == 1)
			{
				System.out.printf(",%d", i);
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
		return 0;
	}
}

