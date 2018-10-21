package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		 int i;
		 int j;
		 int t;
		 for (i = 0;i < n - 1;i++)
		 {
		  for (j = i + 1;j < n;j++)
		  {
		   if (a[i] < a[j])
		   {
						t = a[i];
						a[i] = a[j];
						a[j] = t;

		   }
		  }
		 } //for(i=0;i<n;i++)printf("%d ",a[i]);printf("\n");

	}
	public static int most(int[] a, int[] b, int n)
	{
		int i;
		int j;
		int v = 0;
		int m = 0;
		int k;
		int f;
		int p;
		int l = n - 1;
		for (i = 0;i < n;i++)
		{
		   if (b[i] > a[i])
		   {
			   v++;
		   }
		   else if (b[i] <= a[i])
		   {
				for (j = l;j >= i;j--)
				{
				  if (b[j] <= a[j])
				  {
					 l = j;
					 break;
				  }
				}
				p = b[l];
				for (k = l;k >= i + 1;k--)
				{
				   b[k] = b[k - 1];
				}
				b[i] = p;
				if (b[i] == a[i])
				{
					m++;
				}
		   }
		}
				f = n - v - m;
		return (200 * (v - f));
	}
	public static int Main()
	{
		  int n = 1;
		  int[] a = new int[1000];
		  int[] b = new int[1000];
		  int j;
		  int i;
		  int k;
		  for (;n != 0;)
		  {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n = Integer.parseInt(tempVar);
			   }
			   for (j = 0;j < n;j++)
			   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[j] = Integer.parseInt(tempVar2);
				}
			   }
			   for (j = 0;j < n;j++)
			   {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			   }
			   paixu(a, n);
			   paixu(b, n);
			   k = most(a, b, n);
			   if (n != 0)
			   {
			   System.out.printf("%ld\n",k);
			   }
		  }

	}

}

