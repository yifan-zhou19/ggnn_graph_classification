package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int m;
		char[][] a = new char[20][25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 m = 0;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = tempVar2.charAt(0);
						 }
						 p = String.valueOf(a[i]).length();
						 k = a[i][0];
						 if (k == 95 || (k >= 65 && k <= 90) || (k >= 97 && k <= 122))
						 {
								 for (j = 1;j <= p - 1;j++)
								 {
												   k = a[i][j];
												   if (k <= 47 || (k >= 58 && k <= 64) || (k >= 91 && k <= 94) || k == 96 || k >= 123)
												   {
															System.out.print("no\n");
															m = 1;
															break;
												   }
								 }
						 }
						 else
						 {
							 System.out.print("no\n");
							 m = 1;
						 }
						 if (m == 0)
						 {
							 System.out.print("yes\n");
						 }
		}
		return 0;
	}

}

