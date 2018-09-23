package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[4000]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] str = new char[40][100];
		final String temp = "";
		int k = 0;
		int j = 0;
		int i;
		int n;
		int m;
		String = new Scanner(System.in).nextLine();
		n = String.length();
		for (i = 0;i < n;i++)
		{
			if (String[i] != ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, k, string.charAt(i));
				str[j][k] = string.charAt(i);
				k++;
			}
			else
			{
				str[j] = temp;
				k = 0;
				j++;
				for (m = 0;m < 100;m++)
				{
					temp = temp.substring(0, m);
				}

			}
			if (i == n - 1)
			{
			str[j] = temp;
			for (m = 0;m < 100;m++)
			{
				temp = temp.substring(0, m);
			}
			}
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= j;i++)
		{
			if (strcmp(str[i],a) == 0)
			{
				str[i] = b;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",str[i]);
		}
		System.out.printf("%s",str[j]);
		return 0;
	}


}

