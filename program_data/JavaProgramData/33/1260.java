package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] s = new char[1000][256];
	 char[][] zfc = new char[1000][256];
	 int i;
	 int j;
	 int l;
	 int n;
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
			s[i] = tempVar2.charAt(0);
		}
	 }
	  for (i = 0;i < n;i++)
	  {
		l = String.valueOf(s[i]).length();
		for (j = 0;j < l;j++)
		{
		if (s[i][j] == 'A')
		{
		zfc[i][j] = 'T';
		}
		 else if (s[i][j] == 'T')
		 {
		zfc[i][j] = 'A';
		 }
		else if (s[i][j] == 'C')
		{
		zfc[i][j] = 'G';
		}
		else
		{
		zfc[i][j] = 'C';
		}
		}
	zfc[i][j] = '\0';
	System.out.printf("%s\n",zfc[i]);
	  }
	return 0;
	}
}

