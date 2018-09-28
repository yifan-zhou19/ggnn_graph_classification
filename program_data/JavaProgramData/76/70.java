package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int[] a = new int[50001];
		 int[] b = new int[50001];
		 int[] g = new int[50001];
		 int n;
		 int i;
		 int e;
		 int f;
		 int j;
		 int t;
		 int m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
		 }

		 for (i = 0;i <= n;i++)
		 {
			   for (j = 1;j < n - i;j++)
			   {
				if (a[j] > a[j + 1])
				{
				   e = a[j];
				a[j] = a[j + 1];
				a[j + 1] = e;
				f = b[j];
				b[j] = b[j + 1];
				b[j + 1] = f;
				}
			   }
		 }
		m = b[1];
		for (i = 2;i <= n;i++)
		{
		 if (b[i] > m)
		 {
			 m = b[i];
		 }
		}
		 t = 1;
		 for (i = a[1];i <= m - 1;i++)
		 {
			 g[i] = 0;
			for (j = 1;j <= n;j++)
			{
				if ((i >= a[j]) && (i < b[j]))
				{
					g[i] = 1;
				}

			}
			t = t * g[i];
		 }

	   if (t == 0)
	   {
		   System.out.print("no");
	   }
		else
		{
			System.out.printf("%d %d",a[1],m);
		}




	 return 0;
	 }
}

