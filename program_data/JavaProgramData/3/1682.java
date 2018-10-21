package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int k;
	   int e;
	   int[] s = new int[1000];
	   int i = 0;
	   int j = 0;
	   int p = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }

	   for (i = 0;i < n;i++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(s[i]) = Integer.parseInt(tempVar3);
		}
	   }
	   for (j = 0;j < n - 1;j++)
	   {
		 i = 1;
		   for (i = 1;i < n - j;i++)
		   {
			   e = s[j] + s[i + j];
			   if (e == k)
			   {
				  p = 1;

			   }

		   }
	   }
	   if (p == 0)
	   {
		   System.out.print("no");

	   }
	   if (p == 1)
	   {
		   System.out.print("yes");
	   }

	 return 0;

	}
}

