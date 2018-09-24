package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] b = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		  int m;
		  int n;
		  int i;

		  for (i = 2;i < 20;i++)
		  {
		  b[i] = b[i - 1] + b[i - 2];
		  }
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
				  m = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",b[m - 1]);
		  }
		  System.in.read();
		  System.in.read();
	}

}

