package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] jaji = new char[1000][256];
		int n;
		int i;
		int j;

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
				jaji[i] = tempVar2.charAt(0);
			}
		}

		for (i = 0;i < n;i++)
		{

			 for (j = 0;j < String.valueOf(jaji[i]).length();j++)
			 {
				 if (jaji[i][j] == 'A')
				 {
					 jaji[i][j] = 'T';
				 }
				 else if (jaji[i][j] == 'T')
				 {
					 jaji[i][j] = 'A';
				 }
				 else if (jaji[i][j] == 'C')
				 {
					 jaji[i][j] = 'G';
				 }
				 else if (jaji[i][j] == 'G')
				 {
					 jaji[i][j] = 'C';
				 }
			 }
			 jaji[i][String.valueOf(jaji[i]).length()] = '\0';

		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",jaji[i]);

		}
		return 0;

	}



}

