package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int r;
	int i = 1;
	int j = 0;
	char[][] ch = new char[1000][256];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= r;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   ch[i] = tempVar2.charAt(0);
	   }
	}
	i = 1;
	int p;
	 for (i = 1;i <= r;i++)
	 {
		 p = String.valueOf(ch[i]).length();
		 for (j = 0;j < p;j++)
		 {
		   if (ch[i][j] == 'A')
		   {
			 ch[i][j] = 'T';
			 continue;
		   }
		   if (ch[i][j] == 'T')
		   {
			 ch[i][j] = 'A';
			 continue;
		   }
		  if (ch[i][j] == 'G')
		  {
			 ch[i][j] = 'C';
			 continue;
		  }
		  if (ch[i][j] == 'C')
		  {
			 ch[i][j] = 'G';

		  }
		 }
	 }
	i = 1;
	for (i = 1;i <= r;i++)
	{

		System.out.printf("%s\n",ch[i]);

	}
	 return 0;
	}
}

