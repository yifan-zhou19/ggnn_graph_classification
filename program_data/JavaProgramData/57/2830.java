package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] wd = new char[50][15];
		int i;
		int j;
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
			   wd[i] = tempVar2.charAt(0);
		   }
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;wd[i][j] != '\0';j++)
		   {
		   }
		   if (wd[i][j - 1] == 'g')
		   {
			 wd[i][j - 3] = '\0';
		   }
		   else
		   {
			   wd[i][j - 2] = '\0';
		   }
		}
		for (i = 0;i < n;i++)
		{
		   System.out.printf("%s\n",wd[i]);
		}
		int a;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

