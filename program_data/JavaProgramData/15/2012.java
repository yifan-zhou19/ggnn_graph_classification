package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int[][] a = new int[100][100];
	 int m1;
	 int n1;
	 int m2;
	 int n2;
	 int t = 0;
	 int S;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar2);
			 }
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 if (a[i][j] == a[i][j + 1] && a[i][j] == a[i + 1][j] && a[i][j] == 0)
			 {
				 m1 = i;
				 n1 = j;
				 t = 1;
				 break;
			 }
			 if (t != 0)
			 {
				 break;
			 }
		 }
	 }
	 t = 0;
	for (j = 0;j < n;j++)
	{
		 for (i = 0;i < n;i++)
		 {
			 if (a[i][j] == a[i][j - 1] && a[i][j] == a[i - 1][j] && a[i][j] == 0)
			 {
				 m2 = i;
				 n2 = j;
				 t = 1;
				 break;
			 }
			 if (t != 0)
			 {
				 break;
			 }
		 }
	}
	S = (m2 - m1 - 1) * (n2 - n1 - 1);
	System.out.printf("%d",S);
	return 0;
	}

}

