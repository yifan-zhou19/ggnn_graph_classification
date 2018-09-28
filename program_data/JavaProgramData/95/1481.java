package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int k;
	   int s = 0;
	   char[][] a = new char[2][80];
	   a[0] = new Scanner(System.in).nextLine();
	   a[1] = new Scanner(System.in).nextLine();
	   for (i = 0;i < 2;i++)
	   {
	   for (j = 0;;j++)
	   {
		if ((a[i][j] >= 'A') && (a[i][j] <= 'Z'))
		{
		a[i][j] = a[i][j] - 'A'+'a';
		}
		if (a[i][j] == 0)
		{
			break;
		}
	   }
	   }

	   if (strcmp(a[0],a[1]) == 0)
	   {
		   System.out.print("=");
	   }
	   if (strcmp(a[0],a[1]) > 0)
	   {
		   System.out.print(">");
	   }
	   if (strcmp(a[0],a[1]) < 0)
	   {
		   System.out.print("<");
	   }



	}
}
