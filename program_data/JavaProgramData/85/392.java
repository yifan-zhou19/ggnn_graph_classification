package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 char[][] a = new char[100][20];
		 int i;
		 int j;
		 int n;
		 int[] len = new int[100];
		 int[] s = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
			 s[i] = 0;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = tempVar2.charAt(0);
			 }
			 len[i] = String.valueOf(a[i]).length();
			 if (((a[i][0] >= 'A') && (a[i][0] <= 'Z')) || ((a[i][0] >= 'a') && (a[i][0] <= 'z')) || (a[i][0] == '_'))
			 {
				 s[i] = 1;
				 for (j = 1;j < len[i];j++)
				 {
					 if (((a[i][j] >= 'A') && (a[i][j] <= 'Z')) || ((a[i][j] >= 'a') && (a[i][j] <= 'z')) || (a[i][j] == '_') || ((a[i][j] >= '0') && (a[i][j] <= '9')))
					 {
						 s[i]++;
					 }
				 }
			 }
		 }
		 for (i = 1;i <= n;i++)
		 {
			 if (s[i] == len[i])
			 {
				 System.out.print("yes\n");
			 }
			 if (s[i] != len[i])
			 {
				 System.out.print("no\n");
			 }
		 }

	}

}

