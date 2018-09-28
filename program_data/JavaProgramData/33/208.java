package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		char[][] p = new char[1000][256];
		char[][] p1 = new char[1000][256];
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
				p[i] = tempVar2.charAt(0);
			}
			for (j = 0;p[i][j] != '\0';j++)
			{
				switch (p[i][j])
				{
					case'A':
						 p1[i][j] = 'T';
						 break;
					case'T':
						 p1[i][j] = 'A';
						 break;
					case'C':
						p1[i][j] = 'G';
						break;
					case'G':
						p1[i][j] = 'C';
						break;
				}
			}
			System.out.printf("%s\n",p1[i]);
		}






	}
}

