package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String str2 = new String(new char[100]);
		String original = new String(new char[100]);
		String word = new String(new char[100]);
		String replace = new String(new char[100]);
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		str = tangible.StringFunctions.changeCharacter(str, len, ' ');
		str = tangible.StringFunctions.changeCharacter(str, len + 1, '\0');
		original = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();
		int i = 0;
		int p = 0;
		int wordlen = 0;
		int j = 0;
		int temp = 0;
		int k;
		int n = 0;
		int t = 0;
		while (i < str.length())
		{

			if (str.charAt(i) != ' ')
			{
				word = tangible.StringFunctions.changeCharacter(word, j, str.charAt(i));
				j++;
				i++;
				temp = 1;
			}
			else if (temp == 1)
			{
				word = tangible.StringFunctions.changeCharacter(word, j, '\0');
		/*	printf("??word:");
				while(t<strlen(word))
				{
					printf("%c",word[t]);
					t++;
				}
				printf("\n");*/
				t = 0;
				if (strcmp(word,original) == 0)
				{
					for (k = 0;k < (i - j);k++) //???????????str2
					{
						str2 = tangible.StringFunctions.changeCharacter(str2, k, str.charAt(k));
					}
					n = 0;
					while (n < replace.length()) //????????
					{
						str2 = tangible.StringFunctions.changeCharacter(str2, k, replace.charAt(n));
						n++;
						k++;
					}
					n = i;
					while (n < str.length()) //???????????
					{
						str2 = tangible.StringFunctions.changeCharacter(str2, k, str.charAt(n));
						n++;
						k++;
					}
					n = 0;
					while (n < k) //????str
					{
						str = tangible.StringFunctions.changeCharacter(str, n, str2.charAt(n));
						n++;
					}
					str = tangible.StringFunctions.changeCharacter(str, n, '\0');
					i = 0; //??????
				}
				else
				{
					i++; //?????????
				}
				j = 0;
				temp = 0;
			}
			else if (temp == 0) //??????
			{
				i++;
			}
		}
		i = 0;
		while (i < str.length() - 1)
		{
			System.out.printf("%c",str.charAt(i));
			i++;
		}

	}
}

