package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int z;
		int[] s = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		z = 1;
		s[0] = 2;
		x = 0;
		if (n >= 5)
		{
			for (i = 3;i <= n;i++)
			{
			x = 0;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
					x += 1;
				}
				else if (i % j != 0)
				{
					x += 0;
				}
			}
			if (x == 0)
			{
				s[z] = i;
				z++;
			}
			}

		for (i = 0;i < z - 1;i++)
		{
			if (s[i] + 2 == s[i + 1])
			{
				System.out.printf("%d %d\n",s[i],s[i + 1]);
			}
		}
		}
		else if (n < 5)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

