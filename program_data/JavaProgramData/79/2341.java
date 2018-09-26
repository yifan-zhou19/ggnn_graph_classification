package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int N = 0;
		  int[] n = new int[100];
		  int[] m = new int[100];
		  int[] x = new int[100];
		  for (i = 0;;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n[i] = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  m[i] = Integer.parseInt(tempVar2);
			  }
			  N = N + 1;
			  if (n[i] == 0)
			  {
				  break;
			  }
		  }
		  for (i = 0;i <= N - 2;i++)
		  {
			  for (j = 1;j <= n[i] - 1;j++)
			  {
				  x[i] = (x[i] + m[i]) % (j + 1);
			  }
			  System.out.printf("%d\n",x[i] + 1);
		  }
	}

}

