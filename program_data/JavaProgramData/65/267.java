package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n = 0;
	   int A = 0;
	   int B = 0;
	   int[] a = new int[200];
	   int[] b = new int[200];
	   int i = 0;
	   int j = 0;
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
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	   }
	   for (j = 0;j < n;j++)
	   {
		   if ((a[j] == 0 && b[j] == 1) || (a[j] == 1 && b[j] == 2) || (a[j] == 2 && b[j] == 0))
		   {
			  A++;
		   }
		   else if ((b[j] == 0 && a[j] == 1) || (b[j] == 1 && a[j] == 2) || (b[j] == 2 && a[j] == 0))
		   {
			  B++;
		   }
	   }
	   if (A > B)
	   {
		  System.out.printf("%c",'A');
	   }
	   else if (A < B)
	   {
		  System.out.printf("%c",'B');
	   }
	   else
	   {
		  System.out.printf("%c%c%c",'T','i','e');
	   }
	   return 0;
	}
}

