package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int[] a = new int[6];
	   int[] b = new int[6];
	   a[0] = 100;
	   a[1] = 50;
	   a[2] = 20;
	   a[3] = 10;
	   a[4] = 5;
	   a[5] = 1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < 6;i++)
	   {
		 m = n;
		 b[i] = n / a[i];
		 n = n % a[i];
	   };
	  for (i = 0;i < 6;i++)
	  {
		  System.out.printf("%d\n",b[i]);
	  }

	}
}

