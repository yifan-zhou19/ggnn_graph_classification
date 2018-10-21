package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int a;
		int b;
		int c;
		int j;
		int k;
		int v;
		int[] sum = new int[100000];
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int[][] A = new int[100000][1];
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				A[i][0] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				A[i][1] = Integer.parseInt(tempVar4);
			}
			sum[i] = A[i][0] + A[i][1];
		}
		for (j = 1;j <= n;j++)
		{
			if (sum[j] > max1)
			{
				max1 = sum[j];
			a = j;
			}
		}
		for (k = 1;k <= n;k++)
		{

				if (sum[k] > max2 && k != a)
				{
					max2 = sum[k];
				b = k;
				}

		}
		for (v = 1;v <= n;v++)
		{
			if (sum[v] < max2)
			{
				if (sum[v] > max3)
				{
					max3 = sum[v];
				c = v;
				}
			}
		}
		System.out.printf("%d %d\n",a,max1);
		System.out.printf("%d %d\n",b,max2);
		System.out.printf("%d %d",c,max3);

		  return 0;
	}




}

