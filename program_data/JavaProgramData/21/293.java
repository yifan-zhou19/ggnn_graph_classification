package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int sum = 0;
		int i;
		int j;
		int k;
		int t;
		int x;
		int temp;
		int emo;
		int[] b = new int[300];
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
			sum = sum + a[i];
		}

		for (j = 0;j < n;j++)
		{
			b[j] = n * a[j] - sum;
		}

		for (k = 0;k < n;k++)
		{
			for (t = 0;t < n - k - 1;t++)
			{
			   if (Math.abs(b[t]) < Math.abs(b[t + 1]))
			   {
				   emo = b[t];
				   b[t] = b[t + 1];
				   b[t + 1] = emo;
				   temp = a[t];
				   a[t] = a[t + 1];
				   a[t + 1] = temp;
			   }
			}
		}

		System.out.printf("%d",a[0]);
		for (x = 1;x < n;x++)
		{
			if (Math.abs(b[x]) == Math.abs(b[0]))
			{
				System.out.printf(",%d",a[x]);
			}
		}
	}

}

