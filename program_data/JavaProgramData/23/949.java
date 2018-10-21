package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int n;
		int i;
		int j;
		int k;
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		i = n - 1;
		for (j = 0;str1.charAt(i) != 32 && i >= 0;i--)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(i));
		j++;
		}
		for (k = j - 1;k >= 0;k--)
		{
			System.out.printf("%c",str2.charAt(k));
		}
		i--;
		while (i >= 0)
		{
			for (j = 0;str1.charAt(i) != 32 && i >= 0;i--)
			{
			str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(i));
		j++;
			}
		System.out.print(" ");
		for (k = j - 1;k >= 0;k--)
		{
			System.out.printf("%c",str2.charAt(k));
		}
		i--;
		}


	}

}

