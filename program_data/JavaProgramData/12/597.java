package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[16];
	 int i;
	 int j;
	 int s;
	 int k;
	 int l;

	for (l = 1;l < 3000;l++)
	{
	   s = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[0] = Integer.parseInt(tempVar);
	   }
	   if (a[0] == -1)
	   {
		   break;
	   }
	   for (k = 1;k <= 16;k++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[k] = Integer.parseInt(tempVar2);
		 }
		 if (a[k] == 0)
		 {
			 break;
		 }
	   }
	   for (i = 0;i < k - 1;i++)
	   {
		 for (j = i + 1;j < k;j++)
		 {
		 if (a[i] == a[j] * 2 || a[j] == a[i] * 2)
		 {
			 s = s + 1;
		 }
		 }
	   }
	   System.out.printf("%d\n",s);

	}
	 return 0;
	}


}

