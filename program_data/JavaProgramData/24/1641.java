package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String[] len = new String[300];
		String max;
		String min;
		int i;
		int j = 0;
		int k;
		str = new Scanner(System.in).nextLine();
		len[0] = str;
		j++;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
				len[j] = str.Substring(i) + 1;
				j++;
			}
		}
		max = len[0];
		min = len[0];
		for (k = 0;k < j;k++)
		{
			if (String.valueOf(len[k]).length() > max.length())
			{
			max = len[k];
			}
			if (String.valueOf(len[k]).length() < min.length())
			{
			min = len[k];
			}
		}
			System.out.printf("%s\n%s",max,min);

		return 0;
	}
}

