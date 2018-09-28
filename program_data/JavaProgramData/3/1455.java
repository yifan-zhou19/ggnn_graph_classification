package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] A = new int[1000];
	   int n;
	   int k;
	   int b = 0;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   for (int i = 0;i < n;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (A[i]) = Integer.parseInt(tempVar3);
		   }
			  A[i] = A[i];
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		   int m = i;
		   for (int j = i;i + j < n;j++)
		   {
			   if ((A[i] + A[i + j]) == k)
			   {
				   b = 1;
			   }
		   }
	   }
		if (b == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	return 0;
	}
}

