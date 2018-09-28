package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] m = new int[20];
	   int a;
	   int j;
	   int i;
	   int b;
	   int c;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i < n + 1;i++)
	   {
		   a = 1;
		   b = 1;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (m[i]) = Integer.parseInt(tempVar2);
		   }
		   if (m[i] > 2)
		   {
			   for (j = 3;j < m[i] + 1;j++)
			   {
				  c = b;
				  b = a;
				  a = b + c;

			   }
			   System.out.printf("%d\n",a);
		   }
		   else
		   {
			   a = 1;
			   System.out.printf("%d\n",a);

		   }

	   }


	   return 0;

	}


}

