package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int s = 0;
	 int e;
	 int z = 0;
	 int[] a = new int[100];
	 int[] c = new int[100];
	 int[] x = new int[100];
	 char[][] b = new char[100][10];
	 char[][] d = new char[100][10];
	 char[][] y = new char[100][10];
	 char[][] f = new char[100][10];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b[i] = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (a[i] >= 60)
	  {
			   c[s] = a[i];
		d[s] = b[i];
		s++;
	  }
	  else
	  {
			 x[z] = a[i];
		y[z] = b[i];
		z++;
	  }
	 }
	 for (i = 0;i < s;i++)
	 {
	  for (j = 1;j < s - i;j++)
	  {
	   if (c[j - 1] < c[j])
	   {
	   e = c[j];
	   c[j] = c[j - 1];
	   c[j - 1] = e;
	   f[j] = d[j];
			 d[j] = d[j - 1];
	   d[j - 1] = f[j];
	   }
	  }
	 }
	 for (i = 0;i < s;i++)
	 {
			System.out.printf("%s\n",d[i]);
	 }
	 for (i = 0;i < z;i++)
	 {
			System.out.printf("%s\n",y[i]);
	 }
	 return 0;
	}
}

