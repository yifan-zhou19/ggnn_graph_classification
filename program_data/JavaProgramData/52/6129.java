package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int q;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < n - m;k++)
		{
			q = a[0];
			 for (i = 0;i < n - 1;i++)
			 {
				 a[i] = a[i + 1];
			 }
			 a[n - 1] = q;
		}


		for (i = 0;i < n - 1;i++)
		{
			 System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}

}

