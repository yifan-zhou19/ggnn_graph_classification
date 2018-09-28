package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int dian1;
		  int dian2;
		  int i;
		  int j;
		  int n = 0;
		  int k;
		  int l;
		  int c;
		  int d;
		  for (i = 0;i < 5;i++)
		  {
		  for (j = 0;j < 5;j++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
		  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  dian1 = a[i][0];
						  c = i;
						  d = 0;
		  for (j = 0;j < 5;j++)
		  {
					 if (dian1 < a[i][j])
					 {
					 dian1 = a[i][j];
					 c = i;
					 d = j;
					 }
					 if (j == 4)
					 {
							 dian2 = a[0][d];
							 for (k = 0;k < 5;k++)
							 {
											 if (a[k][d] < dian2)
											 {
											 dian2 = a[k][d];
											 }
							 }
											 if (dian1 == dian2)
											 {
											 System.out.printf("%d %d %d",c + 1,d + 1,a[c][d]);
											 n++;
											 }
					 }
		  }
		  }
		  if (n == 0)
		  {
		  System.out.print("not found");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

