package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[200];
	 int[] b = new int[200];
	 int h = 0;
	 int k = 0;
	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	   if (a[i] == 0 && b[i] == 1)
	   {
		   h++;
	   }
	   if (a[i] == 0 && b[i] == 2)
	   {
		   k++;
	   }
	   if (a[i] == 1 && b[i] == 2)
	   {
		   h++;
	   }
	   if (a[i] == 1 && b[i] == 0)
	   {
		   k++;
	   }
	   if (a[i] == 2 && b[i] == 0)
	   {
		   h++;
	   }
	   if (a[i] == 2 && b[i] == 1)
	   {
		   k++;
	   }

	 }

	   if (h > k)
	   {
		   System.out.print("A\n");
	   }
	   if (h < k)
	   {
		   System.out.print("B\n");
	   }
	   if (h == k)
	   {
		   System.out.print("Tie\n");
	   }


	return 0;
	}

}

