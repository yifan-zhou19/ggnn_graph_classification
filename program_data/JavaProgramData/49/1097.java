package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[MAX]);
		String sub1 = new String(new char[MAX]);
		String sub2 = new String(new char[MAX]);
		int len; //i length of substring, j head of substring
		int i;
		int j;
		int k;
		int l;

		str = new Scanner(System.in).nextLine();
		len = str.length();

		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				for (k = j,l = 0;k <= i + j - 1;k++,l++)
				{
					sub1 = tangible.StringFunctions.changeCharacter(sub1, l, str.charAt(k));
					sub2 = tangible.StringFunctions.changeCharacter(sub2, l, str.charAt(i + 2 * j - 1 - k));
				}
				sub1 = tangible.StringFunctions.changeCharacter(sub1, i, '\0');
				sub2 = tangible.StringFunctions.changeCharacter(sub2, i, '\0');
				if (strcmp(sub1,sub2) == 0)
				{
					System.out.printf("%s\n",sub1);
				}
			}
		}
	}
}

