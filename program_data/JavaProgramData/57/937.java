package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] b = new int[51];
	   int t;
	   int k;
	   int m;
	   char[][] a = new char[51][33];
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
		   a[i] = tempVar2.charAt(0);
	   }
	   b[i] = String.valueOf(a[i]).length();
	   }
	   for (t = 0;t < n;t++)
	   {
		k = b[t];
		if (a[t][k - 1] == 'r' || a[t][k - 1] == 'y')
		{
		 a[t][k - 2] = '\0';
		}
		else
		{
		  a[t][k - 3] = '\0';
		}
	   }
	   for (m = 0;m < n;m++)
	   {
		System.out.printf("%s\n",a[m]);
	   }
	return 0;
	}

}

