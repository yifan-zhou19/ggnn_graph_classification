package <missing>;

public class GlobalMembers
{
	public static void f(int[] x, int i, int n)
	{
		 int k;
		 int j;
		 k = x[n - 1];
		 for (j = n - 1;j > i;j--)
		 {
			 x[j] = x[j - 1];
		 }
		 x[i] = k;
	}
	public static int Main()
	{
	   int n;
	   int i;
	   int k;
	   int l;
	   int prize;
	   int t;
	   int j;
	   int m;
	   int c;
	   int w;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (;n != 0;)
	   {
		  int p = 0;
		  int w = 0;
		  int s = 0;
		  c = 0;
		  int h = 0;
		  int d = 0;
		  int[] a = new int[1001];
		  int[] b = new int[1001];
		  for (i = 0;i <= n - 1;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  for (l = n - 2;l >= 0;l--)
		  {
			 for (i = 0;i <= l;i++)
			 {
				if (a[i] < a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
				if (b[i] < b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			 }
		  }
		  for (i = 0;i <= n - 1;i++)
		  {
			 if (a[i] > b[i])
			 {
				 w++;
			 }
			 else if (a[i] < b[i])
			 {
				 f(a, i, n);
				 s++;
			 }
				  else
				  {
					for (j = i + 1;j <= n - 1;j++)
					{
					  if ((a[j] <= b[j]) && (a[j] != a[i]))
					  {
						  f(a, i, n);
						  s++;
						  break;
					  }
					}
				  }
		  }
		  prize = (w - s) * 200;
		  System.out.printf("%d\n",prize);
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  n = Integer.parseInt(tempVar4);
		  }
	   }
	   System.in.read();
	   System.in.read();
	}

}

