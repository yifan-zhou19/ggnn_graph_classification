package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[][] Main_a = new int[30][30];
int[][] b = new int[400][2];
	public static void Main(String[] args)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//  static int a[30][30],b[400][2];
	  int i;
	  int j;
	  int k = 0;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  for (i = 1;i <= m;i++)
	  {
		 for (j = 1;j <= n;j++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				Main_a[i][j] = Integer.parseInt(tempVar3);
			}
		 }
	  }
	  for (i = 1;i <= m;i++)
	  {
		 for (j = 1;j <= n;j++)
		 {
			if (Main_a[i][j] >= Main_a[i][j - 1] != 0 && Main_a[i][j] >= Main_a[i][j + 1] != 0 && Main_a[i][j] >= Main_a[i - 1][j] != 0 && Main_a[i][j] >= Main_a[i + 1][j])
			{
				b[k][0] = i - 1;
				b[k][1] = j - 1;
				k++;
			}
		 }
	  }
	  for (i = 0;i < k;i++)
	  {
		 System.out.printf("%d %d\n",b[i][0],b[i][1]);
	  }
	}
}

