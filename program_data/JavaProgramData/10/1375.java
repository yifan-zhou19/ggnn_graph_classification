package <missing>;

public class GlobalMembers
{
	public static int max(int[] a, int k, int n, int z)
	{
		int b = 0;
		int c;
		int m = a[n];
		int t;
		if (n == k - 1)
		{
			if (a[n] <= z)
			{
				t = 1;
			}
			else
			{
				t = 0;
			}
		}
		else
		{
			if (a[n] <= z)
			{
				c = max(a, k, n + 1, z);
				z = a[n];
				b = 1 + max(a, k, n + 1, z);
				if (b > c)
				{
					t = b;
				}
				else
				{
					t = c;
				}
			}
		   else
		   {
			 t = max(a, k, n + 1, z);
		   }
		}
			return (t);
	}
	public static void Main()
	{
		int k;
		int[] a = new int[25];
		int i;
		int t;
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
		}
		t = max(a, k, 0, 999999);
		System.out.printf("%d\n",t);
	}
}

