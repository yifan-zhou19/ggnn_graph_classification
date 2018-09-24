package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[100];
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		  for (i = 0;i <= n - 1;i++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		  }
		for (i = 0;i <= (n - 1) / 2;i++)
		{
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (i != n - 1)
			{
				System.out.printf("%d ",a[i]);
			}
		else
		{
			System.out.printf("%d",a[i]);
		}
		}
	}
}

