package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i = 0;
		int j = 0;
		int len;
		int max;
		int min;
		String str = new String(new char[6000]);
		char[][] str2 = new char[200][30];
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (t = 0;t < len;t++)
		{
			if ((str.charAt(t) != ' ') && (str.charAt(t) != ','))
			{
			   str2[i][j] = str.charAt(t);
			   j++;
			}
			else
			{
			   str2[i][j] = '\0';
			   i++;
			   j = 0;
			}
		}
		str2[i][j] = '\0';
		max = 0;
		for (j = 0;j < i + 1;j++)
		{
			if (String.valueOf(str2[j]).length() > String.valueOf(str2[max]).length())
			{
			   max = j;
			}
		}
		System.out.printf("%s\n",str2[max]);
		min = 0;
		for (j = 0;j < i + 1;j++)
		{
			if ((String.valueOf(str2[j]).length() < String.valueOf(str2[min]).length()) && (String.valueOf(str2[j]).length() != 0))
			{
			   min = j;
			}
		}
		System.out.printf("%s",str2[min]);
	return 0;
	}


}
