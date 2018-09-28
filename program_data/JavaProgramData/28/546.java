package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[9000]);
		char[][] str = new char[300][30];
		final String temp = "";
		int k = 0;
		int j = 0;
		int i;
		int n;
		int m;
		int l = 0;
		String = new Scanner(System.in).nextLine();

		n = String.length();
		for (i = 0;i < n;i++)
		{
			if (String[i] != ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k, string.charAt(i));
				str[j][k] = string.charAt(i);
				k++;
				l = 1;
			}
			else
			{
				if (l == 1)
				{
					str[j] = temp;
					k = 0;
					j++;
				}
				for (m = 0;m < 30;m++)
				{
					temp = temp.substring(0, m);
				}
				l = 0;
			}
			if (i == n - 1)
			{
			str[j] = temp;
			for (m = 0;m < 30;m++)
			{
				temp = temp.substring(0, m);
			}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",String.valueOf(str[i]).length());
		}
		System.out.printf("%d",String.valueOf(str[j]).length());
		return 0;
	}

}

