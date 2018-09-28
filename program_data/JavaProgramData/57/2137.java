package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] a = new char[50][32];
	 int n;
	 int i;
	 int t;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	 a[i] = new Scanner(System.in).nextLine();
	 }
	 for (i = 0;i < n;i++)
	 {
	   t = String.valueOf(a[i]).length();
	   if (t > 2)
	   {
		if (a[i][t - 1] == 'r' && a[i][t - 2] == 'e')
		{
		a[i][t - 2] = '\0';
		}
		else
		{
		 if (a[i][t - 1] == 'y' && a[i][t - 2] == 'l')
		 {
		 a[i][t - 2] = '\0';
		 }
		 else
		 {
		  if (t > 3)
		  {
		   if (a[i][t - 1] == 'g' && a[i][t - 2] == 'n' && a[i][t - 3] == 'i')
		   {
		   a[i][t - 3] = '\0';
		   }
		  }
		 }
		}
	   }
	 }
	 for (i = 0;i < n;i++)
	 {
	 System.out.println(a[i]);
	 }
	}
}

