package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[100][100];
	 int n;
	 int b;
	 int c;
	 int d = 0;
	 int x1;
	 int x2;
	 int y1;
	 int y2;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (b = 0;b < n;b++)
	 {
		 for (c = 0;c < n;c++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[b][c] = Integer.parseInt(tempVar2);
			 }
			 if (a[b][c] == 0 && d == 0)
			 {
				 x1 = b;
				 y1 = c;
				 d = 1;
			 }
			 else if (a[b][c] == 0 && d == 1)
			 {
				 x2 = b;
				 y2 = c;
			 }
		 }
	 }
	m = (x2 - x1 - 1) * (y2 - y1 - 1);
	System.out.printf("%d",(x2 - x1 - 1) * (y2 - y1 - 1));
	return 0;
	}
}

