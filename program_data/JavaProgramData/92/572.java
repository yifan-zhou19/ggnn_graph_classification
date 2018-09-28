package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i;
		int j;
		int k;
		int l;
		int n;
		int t;
		int s;
		int p;
		int m;
		int count = 0;
		int y;
		int sum;
		for (i = 0;;i++)
		{
		   sum = 0;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   if (n == 0)
		   {
				break;
		   }
		   count++;
		   for (j = 0;j <= n - 1;j++)
		   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[j] = Integer.parseInt(tempVar2);
			  }
		   }
		   for (k = 0;k <= n - 1;k++)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[k] = Integer.parseInt(tempVar3);
			  }
		   }
		   for (j = 0;j <= n - 1;j++)
		   {
			  t = a[j];
			  s = b[j];
			  for (k = j + 1;k <= n - 1;k++)
			  {
				 if (a[k] < t)
				 {
					a[j] = a[k];
					a[k] = t;
					t = a[j];
				 }
				 if (b[k] < s)
				 {
					b[j] = b[k];
					b[k] = s;
					s = b[j];
				 }
			  }
		   }
		   for (j = 0;j < n;j++)
		   {
			   if (b[j] < a[j])
			   {
				   sum = sum + 200;
				   continue;
			   }
				else if (b[n - 1] < a[n - 1])
				{
				   sum = sum + 200;
				   for (k = n - 1;k > j;k--)
				   {
					   a[k] = a[k - 1];
					   b[k] = b[k - 1];
				   }
				   continue;
				}
			else
			{
				if (b[n - 1] > a[j])
				{
					sum = sum - 200;
				}
				for (k = n - 1;k > j;k--)
				{
					 b[k] = b[k - 1];
				}
			}
		   }
		 c[i] = sum;
		}
		for (i = 0;i <= count - 1;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

