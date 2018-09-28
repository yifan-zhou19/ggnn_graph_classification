package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j;
		int k;
		int temp;
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0,k = 0;j < N;j++)
		{
			if (a[j] % 2 == 1)
			{
				b[k] = a[j];
				k++;
			}
		}
		for (m = 1,temp = 0;m < k - 1;m++)
		{
			for (n = 0;n < k - m;n++)
			{
				if (b[n] > b[n + 1])
				{
					temp = b[n + 1];
					b[n + 1] = b[n];
					b[n] = temp;
				}
			}
		}
		for (s = 0;s < k;s++)
		{
			if (s == 0)
			{
				System.out.printf("%d",b[s]);
			}
			else
			{
				System.out.printf(",%d",b[s]);
			}
		}
		return 0;
	}




}

