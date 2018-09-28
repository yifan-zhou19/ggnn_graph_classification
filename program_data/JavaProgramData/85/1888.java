package <missing>;

public class GlobalMembers
{
	public static int panduan(char x)
	{
	   int s = 1;
	   if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x == '_') || (x >= '0' && x <= '9'))
	   {
	   s = 0;
	   }
	   return s;

	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[100][21];
		for (i = 0;i < n;i++)
		{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   zfc[i] = tempVar2.charAt(0);
	   }
		}
		 int s = 0;
		 for (i = 0;i < n;i++)
		 {
	len = String.valueOf(zfc[i]).length();
	s = 0;

	for (j = 1;j < len;j++)
	{
	s = s + panduan(zfc[i][j]);
	}
		   if (((zfc[i][0] >= 'a' && zfc[i][0] <= 'z') || (zfc[i][0] >= 'A' && zfc[i][0] <= 'Z') || zfc[i][0] == '_') && (s == 0))
		   {
				System.out.print("yes\n");
		   }
		   else
		   {
				System.out.print("no\n");
		   }
		 }
		return 0;
	}
}

