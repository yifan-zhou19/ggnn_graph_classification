package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int t = 1;
		int s = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= m - 1;i++)
		{
			t = t * m;
		}
		for (i = 0;i <= m - 2;i++)
		{
			s = s * (m - 1);
		}
		if (s > k)
		{
			n = t - k * (m - 1);
			System.out.printf("%d",n);
		}
		else
		{
			n = 2 * t - k * (m - 1);
			System.out.printf("%d",n);
		}
	}

}

