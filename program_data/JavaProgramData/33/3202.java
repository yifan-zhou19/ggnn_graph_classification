package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  char[][] range = new char[10000][256];
	  char[][] vice = new char[10000][256];
	  int[] lenth = new int[10000];
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
			 range[i] = tempVar2.charAt(0);
		 }
		 lenth[i] = String.valueOf(range[i]).length();
	  }
	  for (i = 0;i < n;i++)
	  {
	   for (j = 0;j < lenth[i];j++)
	   {
		if (range[i][j] == 'A')
		{
			vice[i][j] = 'T';
		}
		if (range[i][j] == 'T')
		{
			vice[i][j] = 'A';
		}
		if (range[i][j] == 'C')
		{
			vice[i][j] = 'G';
		}
		if (range[i][j] == 'G')
		{
			vice[i][j] = 'C';
		}
	   }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		System.out.printf("%s\n",vice[i]);
	  }
		System.out.printf("%s",vice[n - 1]);
		return 0;
	}
}

