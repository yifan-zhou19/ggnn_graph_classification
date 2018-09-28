package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] dc = new char[n][33];
		char[][] cd = new char[n][33];
		for (int i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   dc[i] = tempVar2.charAt(0);
		   }
		   a = String.valueOf(dc[i]).length();
		   if (dc[i][a - 1] == 114 || dc[i][a - 1] == 121)
		   {
				  b = a - 2;
		   }
		   if (dc[i][a - 1] == 103)
		   {
				  b = a - 3;
		   }
		   for (int x = 0;x < b;x++)
		   {
				 cd[i][x] = dc[i][x];
		   }
	cd[i][b] = 0;
		   System.out.printf("%s\n",cd[i]);
		}
		return 0;
	}
}

