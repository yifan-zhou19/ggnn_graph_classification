package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int j;
		int[] b = new int[100];
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
			   a = Integer.parseInt(tempVar2);
		   }
		   for (j = 0;j < 100;j++)
		   {
			   if (j == 0 || j == 1)
			   {
				   b[j] = 1;
			   }
			   else
			   {
				   b[j] = b[j - 1] + b[j - 2];
			   }
		   }
		   System.out.printf("%d\n",b[a - 1]);
	   }
	  return 0;
	}
}

