package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int m;
	 int s;
	 int k;
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
			 m = Integer.parseInt(tempVar2);
		 }
		 if (m == 0)
		 {
			 s = 60;
			 System.out.printf("%d\n",s);
			 continue;
		 }
			int[] a = new int[m];
		for (k = 0;k < m;k++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[k] = Integer.parseInt(tempVar3);
		   }
		}
		for (k = 0;k < m;k++)
		{
			 if (a[k] + 3 * k <= 60 && a[k] + 3 * (k + 1) >= 60)
			 {
			  s = a[k];
			  System.out.printf("%d\n",s);
			  break;
			 }
		}
		if (a[0] > 60)
		{
		   s = 60;
		   System.out.printf("%d\n",s);
		   continue;
		}
	   if (a[m - 1] + 3 * m < 60)
	   {
		   s = 60 - 3 * m;
		   System.out.printf("%d\n",s);
		  continue;
	   }
	for (k = 0;k < m;k++)
	{
	   if (a[k] + 3 * (k + 1) < 60 && a[k + 1] + 3 * (k + 1)>60)
	   {
			s = 60 - 3 * (k + 1);
			System.out.printf("%d\n",s);
		   continue;
	   }
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			  free(a);
	 }
	 return 0;
	}

}

