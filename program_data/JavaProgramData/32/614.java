package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int i;
		 int j;
		 int[] l = new int[20];
		 int[] s = new int[20];
		 char[][] a = new char[20][100];
		 char[][] b = new char[20][100];
		 char[][] c = new char[20][100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = tempVar3.charAt(0);
			 }
			 l[i] = String.valueOf(a[i]).length();
			 s[i] = String.valueOf(b[i]).length();
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = l[i] - 1;j >= 0;j--)
			 {
					 if (s[i] > 0)
					 {
						 if (a[i][j] >= b[i][s[i] - 1])
						 {
							  c[i][j] = a[i][j] - b[i][s[i] - 1] + 48;
							  s[i] = s[i] - 1;
						 }
						 else
						 {
							  c[i][j] = 10 + a[i][j] - b[i][s[i] - 1] + 48;
							  a[i][j - 1] = a[i][j - 1] - 1;
							  s[i] = s[i] - 1;
						 }
					 }
					 else
					 {
					 c[i][j] = a[i][j];
					 }


			 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 for (j = 0;j < l[i];j++)
			 {
				 System.out.printf("%c",c[i][j]);
			 }
			 System.out.print("\n");
		 }
	}

}

