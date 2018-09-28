package <missing>;

public class GlobalMembers
{
	public static int s(int x,int y)
	{
	   int t;
	   t = x % y;
	   return t;
	}

	public static int Main()
	{
		  int i = 0;
		  int j = 0;
		  int k = 0;
		  int n = 0;
		  int m = 0;
		  int x = 0;
		  int y = 0;
		  int z = 0;
		  int p = 0;
		  int q = 0;
		  int[] a = new int[300];
		  int[] b = new int[300];
		  int[] c = new int[300];

	  for (p = 0;p < 100;p++)
	  {
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 int n = 0;
		 int m = 0;
		 int x = 0;
		 int y = 0;
		 int z = 0;
		 int p = 0;
		 int q = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(a,0,300 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(b,0,300 * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(c,0,300 * (Integer.SIZE / Byte.SIZE));

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 if (n == 0 && m == 0)
		 {
		 break;
		 }

		 else
		 {


		 for (i = 0;i < n;i++)
		 {
			a[i] = i + 1;
			b[i] = a[i];
			c[i] = a[i];
		 }


	   for (j = n;j > 1;j--)
	   {
		   k = 0;
		   if (j >= m)
		   {
			  k = m - 1;
			  a[k] = 0;

		   }
		   else
		   {
				k = s(m, j) - 1;
				a[k] = 0;
		   }

		  for (x = k + 1,y = 0;x < j;x++,y++)
		  {
				   a[y] = c[x];
		  }

		  for (x = 0,z = y;x < k;x++,z++)
		  {
				a[z] = c[x];
		  }

		  for (i = 0;i < j;i++)
		  {
		  c[i] = a[i];
		  }

	   }

	  for (i = 0;i < n;i++)
	  {
	   if (b[i] == a[0])
	   {
	   System.out.printf("%d\n",i + 1);
	   }
	  }
		 }
	  }


	}

}

