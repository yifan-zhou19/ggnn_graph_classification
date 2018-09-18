package <missing>;

public class GlobalMembers
{
	public static void peidui()
	{
		 int k;
		 k = m - 1;
		 if ((a[i][m] >= 'a' && a[i][m] <= 'z') || (a[i][m] >= 'A' && a[i][m] <= 'Z'))
		 {
			a[i][m] = ' ';
			m = m + 1;
			peidui();
		 }
		 if (a[i][m] == '(')
		 {
			m = m + 1;
			peidui();
		 }
		 if (a[i][m] == ')' && a[i][k] == '(')
		 {
			a[i][m] = ' ';
			a[i][k] = ' ';
			m = m + 1;
			peidui();
		 }
	}
	public static int m;
	public static int i;
	public static char[][] a = new char[100][110];
	public static int Main()
	{
	   char c;
	   char h;
	   int j;
	   int k;
	   int[] t = new int[100];
	   int p;
	   int n = 0;
	   while ((a[n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	   {
		  n = n + 1;
	   }
	   for (i = 0;i < n;i++)
	   {
	   for (j = 0;j < 110;j++)
	   {
		  if (a[i][j] != '\0')
		  {
		  t[i] = t[i] + 1;
		  }
		  if (a[i][j] == '\0')
		  {
		  break;
		  }
	   }
	   }
		  for (i = 0;i < n;i++)
		  {
			 for (j = 0;j < t[i];j++)
			 {
			 System.out.print(a[i][j]);
			 }
			 System.out.print("\n");
			 for (m = 0;m < t[i];m++)
			 {
			   if (a[i][m] == '(')
			   {
			   m = m + 1;
			   peidui();
			   m = m - 1;
			   }
			   if ((a[i][m] >= 'a' && a[i][m] <= 'z') || (a[i][m] >= 'A' && a[i][m] <= 'Z'))
			   {
			   a[i][m] = ' ';
			   }
			 }
			 for (m = 0;m < t[i];m++)
			 {
				if (a[i][m] == '(')
				{
				a[i][m] = '$';
				}
				if (a[i][m] == ')')
				{
				a[i][m] = '?';
				}
			 }
			 for (m = 0;m < t[i];m++)
			 {
			 System.out.print(a[i][m]);
			 }
			 System.out.print("\n");
		  }
			 return 0;
	}
}

