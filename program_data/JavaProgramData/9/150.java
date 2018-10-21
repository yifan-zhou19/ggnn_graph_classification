package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   int i;
	   int e;
	   int k;
	   char[][] id = new char[100][10];
	   String p = new String(new char[10]);
	   int n;
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
			  id[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	   }
	   for (k = 1;k <= n;k++)
	   {
		 for (i = n - 1;i > k - 1;i--)
		 {
			if (a[i] > a[i - 1] && a[i] >= 60)
			{
			   e = a[i];
			   a[i] = a[i - 1];
			   a[i - 1] = e;
			   p = id[i];
			   id[i] = id[i - 1];
			   id[i - 1] = p;
			}
		 }
	   }
	   for (i = 0;i < n;i++)
	   {
		  System.out.printf("%s\n",id[i]);
	   }
	 return 0;
	}

}

