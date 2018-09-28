package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[100]);
	char[][] word = new char[100][100];
	int i = 0;
	int j = 0;

	str = new Scanner(System.in).nextLine();

	for (int k = 0;str.charAt(k) != '\0';k++)
	{

		if (str.charAt(k) == ' ')
		{
			word[i][j] = '\0';
			i++;
			j = 0;
			continue;
		}
		word[i][j] = str.charAt(k);
		j++;
	}
	word[i][j] = '\0';
	for (j = 0;word[i][j] != '\0';j++)
	{
		System.out.print(word[i][j]);
	}

	for (int k = i - 1;k >= 0;k--)
	{
		System.out.print(" ");
		for (j = 0;word[k][j] != '\0';j++)
		{
		System.out.print(word[k][j]);
		}
	}
	//cin>>str;
	return 0;
	}

}
