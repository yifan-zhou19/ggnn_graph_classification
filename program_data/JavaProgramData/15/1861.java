package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int e;
	 int f;
	 int x;
	 int y;
	 int p;
	 int[][] s = new int[1000][1000];
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
				 s[i][j] = Integer.parseInt(tempVar2);
			 }
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = 0;j < n;j++)
		 {
			 if (s[i][j] == 0)
			 {
				 e = i;
				 f = j;
				 break;
			 }
		 }
	if (j < n)
	{
				break;
	}
	 }
	 for (i = n - 1;i >= 0;i--)
	 {
		for (j = n - 1;j >= 0;j--)
		{
			 if (s[i][j] == 0)
			 {
				 x = i;
				 y = j;
				 break;
			 }
		}
	if (j >= 0)
	{
				break;
	}
	 }
	p = (x - e-1) * (y - f - 1);
	System.out.printf("%d",p);
		return 0;
	}


}

