package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int h;
		int[] len = new int[100];
		char[][] j = new char[1000][3000];
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
				j[i] = tempVar2.charAt(0);
			}
		}


		for (i = 0;i < n;i++)
		{
			for (h = 0;h < String.valueOf(j[i]).length();h++)
			{
				if (j[i][h] == 'A')
				{
					j[i][h] = 'T';
				}
				else
				{
					if (j[i][h] == 'T')
					{
						j[i][h] = 'A';
					}
					else
					{
					   if (j[i][h] == 'C')
					   {
						   j[i][h] = 'G';
					   }
					   else
					   {
						   if (j[i][h] == 'G')
						   {
							   j[i][h] = 'C';
						   }
					   }
					}
				}
			}

		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n",j[i]);
		}
		System.out.printf("%s",j[n - 1]);
		return 0;
	}



}

