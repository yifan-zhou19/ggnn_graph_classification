package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int d;
		int i;
		int j;
		int max;
		int sum;
		int[] a = new int[50001];
		int[] b = new int[50001];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i;j <= n;j++)
			{
				if (a[i] > a[j])
				{
					c = a[i];
					d = b[i];
					a[i] = a[j];
					b[i] = b[j];
					a[j] = c;
					b[j] = d;
				}
			}
		}
		sum = 0;
		max = b[1];
		for (i = 1;i <= n;i++)
		{
			if (a[i] > max)
			{
				sum = sum + 1;
				break;
			}
			else
			{
				if (b[i] > max)
				{
					max = b[i];
				}
			}
		}
		if (sum != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[1],max);
		}
		return 0;

	}

}

