package <missing>;

public class GlobalMembers
{
	public static int sushu(int m)
	{
	int s;
	int i;
	int h = 1;
	s = (int)Math.sqrt(m);
	for (i = 1;i <= s;i++)
	{
		if (m % i == 0 && i != 1)
		{
			h = 0;
		   break;
		}
	}
	return (h);

	}
	public static int Main()
	{
		int i;
		int n;
		int j;
		int g = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2,j = 0;i <= n;i++)
		{
			if (sushu(i) == 1)
			{
				a[j] = i;
				j++;
			}

		}

		for (i = 0;i < j - 1;i++)
		{
			if ((a[i + 1] - a[i]) == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			   g = 1;
			}

		}
		if (g == 0)
		{
			System.out.print("empty");
		}

	return 0;
	}





}

