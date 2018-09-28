package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			 int a;
			 int b;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
			 int[][] c = new int[a][b];
			 int j;
			 int k;
			 for (j = 0;j < a;j++)
			 {
				   for (k = 0;k < b;k++)
				   {
						  String tempVar4 = ConsoleInput.scanfRead();
						  if (tempVar4 != null)
						  {
							  c[j][k] = Integer.parseInt(tempVar4);
						  }
				   }
			 }
			 int s = 0;
			 for (k = 0;k < b;k++)
			 {
				   s += c[0][k];
			 }
			 for (j = 1;j < a;j++)
			 {
				   s += c[j][b - 1];
			 }
			 for (k = 0;k < b - 1;k++)
			 {
				   s += c[a - 1][k];
			 }
			 for (j = 1;j < a - 1;j++)
			 {
				   s += c[j][0];
			 }
			 System.out.printf("%d\n",s);
		}
		return 0;
	}

}

