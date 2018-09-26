package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int a[]);
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int x = 0;
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
		for (i = n - 1;i >= 0;i--)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (a[i] == a[j])
				{
					x = x + 1;
				}
			}
			if (x > 0)
			{
				a[i] = 0;
			}
			x = 0;
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (a[i] != 0)
			{
			 System.out.printf(",%d",a[i]);
			}
		}
	}
}

