package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[10][11];
		char[][] substr = new char[10][4];
		final String output = "";
		int maxN = 0;
		int i = 0;
		int j;
		int end;
		while (scanf("%s %s",str[i],substr[i]) != EOF)
		{
		//	scanf("%s %s",str[i],substr[i]);
			i++;
		}
		end = i;
		for (i = 0;i < end;i++)
		{
			char max = str[i][0];
			String p;
			p = output.charAt(i);
			for (j = 0;j < String.valueOf(str[i]).length();j++)
			{
				if ((int)str[i][j] > (int)max)
				{
					max = str[i][j];
					maxN = j + 1;
				}
			}
			p = String.valueOf(str[i]).substring(0, maxN);
			p += substr[i];
			p + String.valueOf(output.charAt(i)).length() += str[i] + maxN;
			System.out.printf("%s\n",output.charAt(i));
		}
		return 0;
	}

}
