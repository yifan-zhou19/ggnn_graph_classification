package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int m;
		  int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		  int[] a = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }

		  for (j = 2;j < 20;j++)
		  {
		  f[j] = f[j - 2] + f[j - 1];
		  }
		  System.out.printf("%d\n",f[m - 1]);
		  }
		  System.in.read();
		  System.in.read();
	}
}

