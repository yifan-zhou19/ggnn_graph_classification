package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int m;
		int n;
		int j;
		int k;
		void f(int a[],int m);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < n;k++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[k] = Integer.parseInt(tempVar4);
			}
		}
		f(a, m);
		System.out.print(" ");
		f(b, n);
		return 0;
	}
	public static void f(int[] a, int m)
	{
		int i;
		int l;
		int s;
		for (i = 1;i < m;i++)
		{
			for (l = 0;l < m - i;l++)
			{
				   if (a[l] > a[l + 1])
				   {
					s = a[l];
					a[l] = a[l + 1];
					a[l + 1] = s;
				   }
			}
		}

		  System.out.printf("%d",a[0]);
		  for (l = 1;l < m;l++)
		  {
			  System.out.printf(" %d",a[l]);
		  }
	}

}

