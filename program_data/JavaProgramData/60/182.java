package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3,k = 0;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (i <= j)
			{
				a[k] = i;
				k++;
			}

		}

		for (i = 0,j = 0;i < k;i++)
		{
		if (a[i + 1] - a[i] == 2)
		{
			System.out.printf("%d %d\n",a[i],a[i + 1]);
			j++;
		}
		}
	if (j == 0)
	{
			System.out.print("empty");
	}
	}
}

