package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[301];
		int i;
		int j;
		int l;
		float av = 0F;
		float[] b = new float[301];
		float k;
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
			av += a[i];
		}
		av = av / n;
		for (i = 1;i <= n;i++)
		{
			if (a[i] > av)
			{
				b[i] = a[i] - av;
			}
			else
			{
				b[i] = av - a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= (n - i);j++)
			{
				if (b[j] < b[j + 1])
				{
				k = b[j];
				b[j] = b[j + 1];
				b[j + 1] = k;
									l = a[j];
									a[j] = a[j + 1];
									a[j + 1] = l;
				}
			}
		}

		k = b[1];
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;i++)
		{
			if (b[i] == k)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		System.out.print("\n");
	}
}

