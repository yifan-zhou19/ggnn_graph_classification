package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] DNA = new char[1000][1000];
		char[][] DNA2 = new char[1000][1000];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				DNA[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(DNA[i]).length();
			for (int j = 0;j < len;j++)
			{
		   if (DNA[i][j] == 'A')
		   {
			   DNA2[i][j] = 'T';
		   }
				if (DNA[i][j] == 'T')
				{
					DNA2[i][j] = 'A';
				}
				if (DNA[i][j] == 'C')
				{
					DNA2[i][j] = 'G';
				}
		   if (DNA[i][j] == 'G')
		   {
			   DNA2[i][j] = 'C';
		   }
			}
					  System.out.println(DNA2[i]);
		}
		return 0;
	}

}

