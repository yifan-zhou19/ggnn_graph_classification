package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[13]; //mei gei yue de tian shu//
		int[] b = new int[201]; //nian fen//
		int[] c = new int[201]; //diyigeyuefen   di er ge//
		int[] d = new int[201];
		int[] sum = new int[201];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 1;l <= n;l++)
		{
			sum[l] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			if (((b[i] % 4 == 0) && (b[i] % 100 != 0)) || (b[i] % 400 == 0))
			{
				 a[1] = 31,a[2] = 29,a[3] = 31,a[4] = 30,a[5] = 31,a[6] = 30,a[7] = 31,a[8] = 31,a[9] = 30,a[10] = 31,a[11] = 30,a[12] = 31;
			}
			else
			{
				 a[1] = 31,a[2] = 28,a[3] = 31,a[4] = 30,a[5] = 31,a[6] = 30,a[7] = 31,a[8] = 31,a[9] = 30,a[10] = 31,a[11] = 30,a[12] = 31;
			}
			if (c[i] > d[i])
			{
				for (j = d[i];j < c[i];j++)
				{
					sum[i] = sum[i] + a[j];
				}
			}
			else
			{
				for (j = c[i];j < d[i];j++)
				{
					sum[i] = sum[i] + a[j];
				}
			}

		}
		for (k = 1;k <= n;k++)
		{
			if (sum[k] % 7 == 0)
			{
				System.out.print("YES\n");
			}

			else
			{
				System.out.print("NO\n");
			}
		}



	}


}

