package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int c = 0;
		int t;
		int[] a = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		t = a[n - 1];
		if (t == k)
		{
			a[n - 1] += 1; //???????k????????
		}
		for (i = 0;i < (n - c - 1);i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < (n - 1);j++)
				{
					a[j] = a[j + 1];
				}
				c += 1;
				i -= 1;
			}
		}
		if (t != k)
		{
			 for (j = 0;j < (n - c - 1);j++)
			 {
			System.out.printf("%d ",a[j]);
			 }
		 System.out.printf("%d",a[j]);
		}
		else if ((t == k) && (n > 1))
		{
			for (j = 0;j < (n - c - 2);j++)
			{
		   System.out.printf("%d ",a[j]);
			}
		System.out.printf("%d",a[j]);
		}
	}
}

