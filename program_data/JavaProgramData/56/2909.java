package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int b;
		int i = 0;
		int j;
		int t;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		while (b > 0 && i <= 4)
		{
			a[i] = b % 10;
			b = b / 10;
			i++;
			n++;
		}
		for (j = 0;j < n;j++)
		{
			for (;i < n - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
				for (i = 0;i < n;i++)
				{
					System.out.printf("%d",a[i]);
				}
	}


}

