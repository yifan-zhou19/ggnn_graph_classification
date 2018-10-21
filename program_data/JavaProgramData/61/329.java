package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int[] a = new int[20];
		  int j;
		  int[] f = new int[21];
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
				  a[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  f[1] = 1;
		  f[2] = 1;
		  for (j = 3;j <= 20;j++)
		  {
			  f[j] = f[j - 1] + f[j - 2];
		  }
		  for (i = 0;i < n;i++)
		  {
		  System.out.printf("%d\n",f[a[i]]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

