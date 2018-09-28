package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int max = 0;
		int[] c = new int[100];
		int i;
		int j = 0;
		int[] sum = new int[100];
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 1)
			{
				if (i == 0 || (i > 0 && c[i - 1] == 1))
				{
					sum[j]++;
				}
				else
				{
					j++;
					sum[j]++;
				}
			}
		}
		for (i = 0;i <= j;i++)
		{
			if (max < sum[i])
			{
				max = sum[i];
			}
		}
		System.out.printf("%d",max);



	}
}

