package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] s = new int[20];
	   int i;
	   int j;
	   int a;
	   int b;
	   int c;
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
			   (s[i]) = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   if (s[i] <= 2)
		   {
			   System.out.print("1\n");
		   }
		   if (s[i] > 2)
		   {
				   a = 1;
				   b = 1;
				   for (j = 3;j <= s[i];j++)
				   {
					   c = a + b;
					   a = b;
					   b = c;
				   }
				  System.out.printf("%d\n",c);
		   }
	   }
		return 0;

	}

}

