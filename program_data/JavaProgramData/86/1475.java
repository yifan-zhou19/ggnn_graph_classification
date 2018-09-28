package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int n;
	int m;
	int s;
	int ans;
	int a;
	int b;
	int c;
	int d;
	int[] h = new int[30];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
					 s = 0;
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 m = Integer.parseInt(tempVar2);
					 }
					 for (j = 0;j < m;j++)
					 {
					 String tempVar3 = ConsoleInput.scanfRead();
					 if (tempVar3 != null)
					 {
						 h[j] = Integer.parseInt(tempVar3);
					 }
					 }
					 for (j = 0;j < m;j++)
					 {
						 s = 0;
					 k = h[j];
					 if ((k + 3 * j) >= 57)
					 {
						 if ((k + 3 * j - 57) < 3)
						 {
						 s = 3 - (k + 3 * j - 57);
					 break;
						 }
					 else
					 {
					 break;
					 }
					 }
					 }
					ans = 60 - 3 * j - s;
					System.out.printf("%d\n",ans);
	}

	}
}

