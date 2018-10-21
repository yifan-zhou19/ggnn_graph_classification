package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[1000][2];
		int[] c = new int[1000];
		int i;
		int j;
		int k = 0;
		int sum = 0;
		int max;
		int min;
		char b;
		for (i = 0;i < 1000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			sum++;
			if (b != ',')
			{
				break;
			}
		}
		for (i = 0;i < sum;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				b = tempVar4.charAt(0);
			}
		}
		min = a[0][0];
		max = a[0][1];
		for (i = 0;i < sum;i++)
		{
			if (a[i][0] < min)
			{
				min = a[i][0];
			}
			if (a[i][1] > max)
			{
				max = a[i][1];
			}
		}
		for (i = min;i < max - 1;i++)
		{
			for (j = 0;j < sum;j++)
			{
				if ((a[j][0] < i || a[j][0] == i) && (a[j][1]> i + 1 || a[j][1] == i + 1))
				{
					c[k]++;
				}
			}
			k++;
		}
		max = c[0];
		for (i = 0;i < k;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%d %d",sum,max);
		return 0;
	}
}

