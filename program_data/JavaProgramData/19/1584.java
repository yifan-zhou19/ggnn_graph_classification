package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String stc = new String(new char[201]);
	String wrd1 = new String(new char[101]);
	String wrd2 = new String(new char[101]);
	char[][] wrdd = new char[100][101];
	int i;
	int j = 0;
	int k = 0;
	int l = 0;
	stc = new Scanner(System.in).nextLine();
	wrd1 = new Scanner(System.in).nextLine();
	wrd2 = new Scanner(System.in).nextLine();

	for (i = 0;stc.charAt(i) != '\0';i++)
	{
		if (stc.charAt(i) != ' ')
		{
			wrdd[j][k] = stc.charAt(i),k++;
		}
	else
	{
		wrdd[j][k] = '\0',j++,k = 0;
	}
	}

	for (i = 0;i <= j;i++)
	{
	 if (strcmp(wrd1,wrdd[i]) == 0)
	 {
		 wrdd[i] = wrd2;
	 }
	}

	for (i = 0,k = 0;l <= j;i++)
	{
		if (wrdd[l][k] != '\0')
		{
			stc = tangible.StringFunctions.changeCharacter(stc, i, wrdd[l][k],k++);
		}
	else
	{
		stc = tangible.StringFunctions.changeCharacter(stc, i, ' ',l++,k = 0);
	}
	}
	stc = tangible.StringFunctions.changeCharacter(stc, i - 1, '\0');
	System.out.println(stc);
	}
}

