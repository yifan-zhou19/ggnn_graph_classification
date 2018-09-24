package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int num1 = 0;
	  int num2 = 0;
	  int[] a = new int[200];
	  int[] b = new int[200];
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		   if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
		   {
				   num1 += 1;
		   }
		   else if ((b[i] == 0 && a[i] == 1) || (b[i] == 1 && a[i] == 2) || (b[i] == 2 && a[i] == 0))
		   {
			   num2 += 1;
		   }
	   }
	   if (num1 > num2)
	   {
		   System.out.print("A");
	   }
	   if (num2 > num1)
	   {
		   System.out.print("B");
	   }
	   if (num1 == num2)
	   {
		   System.out.print("Tie");
	   }

		return 0;
	}
}

