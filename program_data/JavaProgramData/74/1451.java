package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k = 2;
		int t = 0;
		int u;
		int s = 0;
		int r = 1;
		int b = 1;
		int flag = 1;

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
			for (k;k < i;k++)
			{
				if (i % k == 0)
				{
					t++;
				}
			}
			if (t == 0)
			{
				r = i;
				while (r != 0)
				{
					u = r % 10;
					s = s * 10 + u;
					r = r / 10;
				}
				if (s == i && b != 1)
				{
					System.out.printf(",%d",i);
					flag = 0;
				}
				if (s == i && b == 1)
				{
					System.out.printf("%d",i);
					b++;
					flag = 0;
				}
			}
			k = 2;
			t = 0;
			s = 0;
		}
		if (flag == 1)
		{
			System.out.print("no");
		}
		return 0;
	}

}

