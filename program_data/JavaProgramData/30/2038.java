package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int S;
		int f;
		int k;
		int r;
		S = 0;
		f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			if (i % 7 == 0 || (i - 7) % 10 == 0 || i / 10 == 7)
			{
			S += i * i;
			}
		}
		for (k = 0;k < n + 1;k++)
		{
		f += k * k;
		}
		r = f - S;
		System.out.printf("%d",r);
		return 0;
	}
}

