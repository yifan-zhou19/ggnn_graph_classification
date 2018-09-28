package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int k;
		int c;
		int u = 0;
		int g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{

							  String tempVar2 = ConsoleInput.scanfRead();
							  if (tempVar2 != null)
							  {
								  a[i] = Integer.parseInt(tempVar2);
							  }
							  String tempVar3 = ConsoleInput.scanfRead(" ");
							  if (tempVar3 != null)
							  {
								  b[i] = Integer.parseInt(tempVar3);
							  }
							  if (a[i] == 0 && b[i] == 0)
							  {
							  break;
							  }
							  g++;
		}
		for (j = 0;j <= n - 1;j++)
		{
						 k = 0,c = 0;
						 for (i = 1;i <= g;i++)
						 {
										  if (j == a[i])
										  {
										  k++;
										  }
						 }
						 for (i = 1;i <= g;i++)
						 {
										  if (j == b[i])
										  {
										  c++;
										  }
						 }
						 if (k == 0 && c == (n - 1)) //hungry~~~ToT.....
						 {
							 System.out.printf("%d",j);
						 u++;
						 }
		}
		if (u == 0)
		{
		System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

