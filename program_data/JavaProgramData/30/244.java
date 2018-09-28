package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum = 0;
		int p;
		int pp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			pp = i / 10;
			p = i - 10 * pp;
			if (i % 7 != 0 && pp != 7 && p != 7)
			{
				sum = i * i + sum;
			}
		}
		System.out.printf("%d",sum);
	}

}

