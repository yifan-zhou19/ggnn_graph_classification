package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
	  int[] b = new int[21];
	  b[1] = 1;
	  b[2] = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	 for (j = 3;j <= 20;j++)
	 {
	   b[j] = b[j - 1] + b[j - 2];
	 }

	 for (i = 1;i <= n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
	if (i == 1)
	{
		 System.out.printf("%d",b[a]);
	}
	   else
	   {
	System.out.printf("\n%d",b[a]);
	   }
	 }
	System.in.read();
	System.in.read();
	}

}

