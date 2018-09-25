package <missing>;

public class GlobalMembers
{
	public static int max = 0;
	public static int n = 0;
	public static int[] a = new int[30];
	public static int line = 0;
	public static int[] f = new int[30];
	public static int[] b = new int[30];
	public static void Main()
	{
		int k;
		int i;
		int n = 0;

		void missile(int i,int k);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (line < a[i])
			{
				line = a[i];
			}
		}
		missile(0, k);
		System.out.printf("%d",max);
	}
	public static void missile(int i,int k)
	{
		int j;
		for (j = 0;j < 2;j++)
		{
			if (j == 0 && i != k - 1)
			{
				missile(i + 1, k);
			}
			else
			{
				if (a[i] <= line != 0 || i == k - 1)
				{
					if (a[i] <= line)
					{
					b[i] = line;
					line = a[i];
					n++;
					f[i] = 1;
					}
					if (i == k - 1)
					{
						if (max < n)
						{
							max = n;
						}
						System.out.print("\n");
					}
					else
					{
						missile(i + 1, k);
					}
					if (f[i] == 1)
					{
					n--;
					line = b[i];
					f[i] = 0;
					}
				}
			}
		}
	}
}

