package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] a = new int[500];
		int[] b = new int[500];
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
		}
	for (i = 0;i < n;i++)
	{
		if ((a[i]) % 2 == 1)
		{
					  b[j] = a[i];
					  j++;
		}
	}
		int k = j;
		int m;
		int t;
		for (m = 0;m < k;m++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[m] = Integer.parseInt(tempVar3);
		}
		}
		for (m = k - 1;m > 0;m--)
		{
					for (t = 0;t < m;t++)
					{
					int tmp = b[t];
					if (tmp > b[t + 1])
					{
					b[t] = b[t + 1];
					b[t + 1] = tmp;
					}
					}
		}
		for (m = 0;m < k;m++)
		{
					 if (m == 0)
					 {
					 System.out.printf("%d",b[0]);
					 }
					 else
					 {
					 System.out.printf(",%d",b[m]);
					 }
		}
					 return 0;
	}
}

