package <missing>;

public class GlobalMembers
{
	public static void scan(int[] n, int[] a, int[] b)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[1] = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < n[0];i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
		}

		for (i = 0;i < n[1];i++)
		{
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 b[i] = Integer.parseInt(tempVar4);
		 }
		}
	}



	public static void sort(int[] a, int[] b, int m, int n)
	{
		int i;
		int j;
		int t;

		for (i = 1;i < m;i++)
		{
		   for (j = 0;j < m - i;j++)
		   {
			   if (a[j] > a[j + 1])
			   {
				   t = a[j];
			   a[j] = a[j + 1];
			   a[j + 1] = t;
			   }
		   }
		}

			   for (i = 1;i < n;i++)
			   {
		   for (j = 0;j < n - i;j++)
		   {
			   if (b[j] > b[j + 1])
			   {
				   t = b[j];
			   b[j] = b[j + 1];
			   b[j + 1] = t;
			   }
		   }
			   }
	}

	public static void com(int[] a, int[] b, int[] ab, int m, int n)
	{
		int i;

		for (i = 0;i < m;i++)
		{
			ab[i] = a[i];
		}

		for (i = 0;i < n;i++)
		{
			ab[m + i] = b[i];
		}
	}

	public static void prt(int[] ab, int m, int n)
	{
		int i;
		for (i = 0;i < m + n - 1;i++)
		{
			System.out.printf("%d ",ab[i]);
		}

		System.out.printf("%d",ab[m + n - 1]);

	}


	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int[] n = new int[2];
		int[] ab = new int[202];

			scan(n, a, b);
		sort(a, b, n[0], n[1]);
		com(a, b, ab, n[0], n[1]);
		prt(ab, n[0], n[1]);

		return 0;
	}







}

