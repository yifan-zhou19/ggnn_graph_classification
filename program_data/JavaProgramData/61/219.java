package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int i;
		  int j;
		  int n;
		  int[] f = new int[30];
		  f[0] = 1;
		  f[1] = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
						  for (j = 2;j < 30;j++)
						  {
							  f[j] = 0;
						  }
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a = Integer.parseInt(tempVar2);
						  }
						  if (a <= 2)
						  {
							  System.out.print("1\n");
						  }
						  else
						  {
							  for (j = 2;j < a;j++)
							  {
											  f[j] = f[j - 1] + f[j - 2];
							  }
							  System.out.printf("%d\n",f[a - 1]);
						  }
		  }
	}

}

