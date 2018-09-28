package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[30][30];
		int n;
		int j;
		int k;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
		  a[i] = new Scanner(System.in).nextLine();
		  k = String.valueOf(a[i]).length();
		  t = 0;
		for (j = 0;j <= k;j++)
		{
		 if (a[i][0] >= '0' && a[i][0] <= '9')
		 {
			 break;
		 }
		 if (a[i][j] <= '9' && a[i][j] >= '0')
		 {
			 t++;
		 }
		 if (a[i][j] <= 'z' && a[i][j] >= 'a')
		 {
			 t++;
		 }
		 if (a[i][j] <= 'Z' && a[i][j] >= 'A')
		 {
			 t++;
		 }
		 if (a[i][j] == '_')
		 {
			 t++;
		 }
		}
		 if (t == k)
		 {
			 System.out.print("yes\n");
		 }
		 else
		 {
			 System.out.print("no\n");
		 }
		}
	}
}

