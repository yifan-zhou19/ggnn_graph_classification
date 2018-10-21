package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] a = new int[20];
		  int[] b = new int[20];
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.out.print("\n");
		  for (i = 1;i <= n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  System.out.print("\n");
		  }
		  b[1] = 1,b[2] = 1;
		  for (j = 3;j <= 20;j++)
		  {
		  b[j] = b[j - 1] + b[j - 2];
		  }
		   for (i = 1;i <= n;i++)
		   {
		   System.out.printf("%d\n",b[a[i]]);
		   System.out.print("\n");
		   }
			System.in.read();
			System.in.read();
	}

}

