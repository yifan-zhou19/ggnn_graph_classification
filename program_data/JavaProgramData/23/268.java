package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int p = 0;
		char[][] a = new char[50][50];
	   for (i = 0;i < 50;i++)
	   {
	   for (j = 0;j < 50;j++)
	   {
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   a[i][j] = tempVar.charAt(0);
		   }
	   if (a[i][j] == ' ' || a[i][j] == '\n')
	   {
		   break;
	   }
	   }
	   if (a[i][j] == ' ')
	   {
		   a[i][j] = '\0';
	   }
	   if (a[i][j] == '\n')
	   {
		   a[i][j] = '\0';
		   break;
	   }
	   }
	   System.out.printf("%s",a[i]);
	   for (p = i - 1;p >= 0;p--)
	   {
	   System.out.printf(" %s",a[p]);
	   }
	   return 0;
	}





}

