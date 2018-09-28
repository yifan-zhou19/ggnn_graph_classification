package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[100];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[n][20];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
			 for (i = 0;i < n;i++)
			 {
				 s[i] = 0;
				 for (j = 0;a[i][j] != '\0';j++)
				 {
					 if (j == 0)
					 {
						 if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] == '_'))
						 {
							 s[i] = 1;
						 }
						 else
						 {
							 s[i] = 0;
							 break;
						 }
					 }
					 else if ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] == '_') || (a[i][j] >= '0' && a[i][j] <= '9'))
					 {
						 s[i] = 1;
					 }
					 else
					 {
						 s[i] = 0;
						 break;
					 }
				 }
				 if (s[i] == 0)
				 {
					 System.out.print("no\n");
				 }
				 else
				 {
					 System.out.print("yes\n");
				 }
			 }

			 return 0;
	}
}

