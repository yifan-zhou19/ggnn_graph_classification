package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int t;
	   int k;
	   int h;
	   int[] b = new int[3000];
	   char[][] a = new char[3000][256];
	   char[][] pd = new char[3000][256];
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
		   for (k = 0;k < b[t];k++)
		   {
			   if (a[t][k] == 'A')
			   {
				pd[t][k] = 'T';
			   }
			   else if (a[t][k] == 'T')
			   {
				pd[t][k] = 'A';
			   }
			   else if (a[t][k] == 'C')
			   {
				pd[t][k] = 'G';
			   }
			   else
			   {
				pd[t][k] = 'C';
			   }
			   pd[t][b[t]] = '\0';
		   }
	   }
	   for (h = 0;h < n;h++)
	   {
		System.out.printf("%s\n",pd[h]);
	   }
	return 0;
	}

}

