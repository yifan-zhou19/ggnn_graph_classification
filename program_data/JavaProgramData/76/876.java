package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int l;
		int min;
		int max;
		int d = 1;
		int[] a = new int[50001];
		int[] b = new int[50001];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		  for (k = 1;k <= n;k++)
		  {
			for (j = 0;j < n - k;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					l = b[j];
					a[j] = a[j + 1];
					b[j] = b[j + 1];
					a[j + 1] = m;
					b[j + 1] = l;
				}
			}
		  }
		  min = a[0],max = b[0];
		for (i = 0;i < n - 1;i++)
		{
			if (max < a[i + 1])
			{
				System.out.print("no");
			  d = 0;
			break;
			}
		else if (max < b[i + 1])
		{
			max = b[i + 1];
		}
		}
		if (d == 1)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

