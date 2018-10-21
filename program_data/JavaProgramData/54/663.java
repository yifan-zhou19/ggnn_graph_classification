package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int sum(int x)
	{
		int i = 0;
		int c;
		int num;
		int j;
		int[] a = new int[100];
		if (x == 1)
		{
			for (i = 1;;i++)
			{
				num = 0;
				a[1] = i * n + k;
				for (j = 1;j < n;j++)
				{
				   if (a[j] % (n - 1) != 0)
				   {
					num++;
				   }
				   a[j + 1] = a[j] * n / (n - 1) + k;
				}
					 if (num == 0)
					 {
				   c = i * n + k;
				   break;
					 }
			}
		}
		else
		{
			c = sum(x - 1) * n / (n - 1) + k;
		}
		return c;
	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",sum(n));
	}
}

