package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (;k > 0;k--)
		{
					 sum = 0;
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 m = Integer.parseInt(tempVar2);
					 }
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 n = Integer.parseInt(tempVar3);
					 }
					 for (i = 0;i < m;i++)
					 {
					 for (j = 0;j < n;j++)
					 {
					 String tempVar4 = ConsoleInput.scanfRead();
					 if (tempVar4 != null)
					 {
						 a[i][j] = Integer.parseInt(tempVar4);
					 }
					 }
					 }
					 for (p = a[0];p < a[0] + n;p++)
					 {
					 sum += *p;
					 }
					 for (p = p + 99;p < a[0] + (m - 1) * 100 + n;p = p + 100)
					 {
					 sum += *p;
					 }
					 for (p = p - 101;p > a[0] + (m - 1) * 100 - 1;p--)
					 {
					 sum += *p;
					 }
					 for (p = p - 99;p > a[0];p = p - 100)
					 {
					 sum += *p;
					 }
					 System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

