package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	  int[] a = new int[100000];
	  int i;

		  a[1] = 1;

		  a[2] = 1;

	  if (n > 2)
	  {
		  for (i = 3;i <= n;i++)
		  {
			  a[i] = a[i - 1] + a[i - 2];

		  }
	  }

	  return a[n];
	}


	public static int Main()
	{
	  int[] a = new int[10000];
	  int[] s = new int[10000];
	  int x;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (x = 0;x < k;x++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[x] = Integer.parseInt(tempVar2);
		 }

		 s[x] = f(a[x]);

		 System.out.printf("%d\n",s[x]);
	  }

	return 0;
	}

}

