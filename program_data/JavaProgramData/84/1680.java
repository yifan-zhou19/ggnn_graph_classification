package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int i;
		int max;
		int second;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
		}
		if (a[1] > a[2])
		{
				max = a[1];
			second = a[2];
		}
		else
		{
			max = a[2];
		}
			second = a[1];
		if (n <= 2)
		{
				System.out.printf("%d\n",max);
			System.out.printf("%d\n",second);
		}
		else
		{
			for (i = 3;i <= n;i++)
			{
				if (a[i] > max)
				{
					second = max;
				max = a[i];
				}
				else if (max > a[i] && second < a[i])
				{
					second = a[i];
				}
			}
			System.out.printf("%d\n",max);
			System.out.printf("%d\n",second);
		}
		return 0;
	}
}

