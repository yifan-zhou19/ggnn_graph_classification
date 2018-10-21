package <missing>;

public class GlobalMembers
{
	public static int[] P = new int[250];
	public static void prime(int n)
	{
		int i;
		for (i = 1;P[i] * P[i] <= n;i++)
		{
			if (n % P[i] == 0)
			{
			   return;
			}
		}
		P[0]++;
		P[P[0]] = n;
	}
	public static int p(int n)
	{
		int i;
		for (i = 1;P[i] * P[i] <= n;i++)
		{
			if (n % P[i] == 0)
			{
			   return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		P[0] = 1;
		P[1] = 2;
		for (i = 3;i < 250;i++)
		{
			prime(i);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= n;j += 2)
		{
			for (i = 3;i <= j / 2;i++)
			{
				if (p(i) != 0 && p(j - i) != 0)
				{
				   System.out.printf("%d=%d+%d\n",j,i,j - i);
				   break;
				}
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}

}

