package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k = 0;
		String string = new String(new char[100]);
		char[][] word = new char[100][100];
		String = new Scanner(System.in).nextLine();
		for (i = 0;i < String.length();i++)
		{
			if (String[i] != ' ')
			{
				word[j][k] = string.charAt(i);
				k++;
			}
			else
			{
				word[j][k] = '\0';
				if (String[i + 1] != ' ')
				{
				j++;
				k = 0;
				}
			}
		}
		word[j][k] = '\0';
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s ",word[i]);
		}
		System.out.printf("%s\n",word[j]);
		return 0;
	}


}
