package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[40000];
	public static void fun(int n,int j,int k)
	{
		 int i;
		 for (i = j;i <= Math.sqrt(n);i++)
		 {
								 if (n % i == 0)
								 {
											j = i;
											a[k]++;
											fun(n / i, j, k);
								 }
		 }

	}

	public static int Main()
	{
	  int n;
	  int[] m = new int[40000];
	  int i;
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
			  m[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (i = 1;i <= n;i++)
	  {
		  fun(m[i], 2, i);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  System.out.printf("%d\n",a[i] + 1);
	  }


	  return 0;
	}

}

