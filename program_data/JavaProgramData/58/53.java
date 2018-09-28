package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int m = 0;
	   int[] b = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   char[][] a = new char[100][100];
	   for (i = 0;i < n;i++)
	   {
		  a[i] = new Scanner(System.in).nextLine();
		  b[i] = String.valueOf(a[i]).length();
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;a[i][j] != '\0';j++)
		   {
				if ((a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122) || (a[i][j] == '_'))
				{
					m++;
				}
		   }
		   if ((m == b[i]) && ((a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 97 && a[i][0] <= 122) || (a[i][0] == '_')))
		   {
				System.out.print("1\n");
		   }
		   else
		   {
				System.out.print("0\n");
		   }
		   m = 0;
	   }
	}
}

