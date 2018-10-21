package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int w;
	   int i;
	   int n;

	   int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   w = Integer.parseInt(tempVar);
	   }
	   n = a[0];
	   if (w == 7)
	   {
	   System.out.print("1\n");
	   }
	   if (w == 4)
	   {
	   System.out.print("2\n");
	   }
	   for (i = 1;i < 11;i++)
	   {
		  n += a[i];

		   if ((((n - 1) % 7 + w) % 7) == 6)
		   {




		  System.out.printf("%d\n",i + 2);
		   }

	   }

	}


}

