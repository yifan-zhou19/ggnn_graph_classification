package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]); //??????
		String substr = new String(new char[5]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //??
		{
		int j = 0;
		int A = str.length(); //????
		int B = substr.length();
		int k = 0;
		char temp = str.charAt(0); //??
		for (int i = 0;i < A;i++)
		{
			if (str.charAt(i) > temp)
			{
				temp = str.charAt(i);
			}
		}
		for (j = 0;j < A;j++)
		{
			if (str.charAt(j) == temp)
			{
				break;
			}
		}
		j++;
		for (k = A;k >= j;k--)
		{
			str = tangible.StringFunctions.changeCharacter(str, k + B, str.charAt(k));
		}

		for (int l = j;l <= j + B - 1;l++)
		{
		str = tangible.StringFunctions.changeCharacter(str, l, substr.charAt(l - j));
		}
		System.out.print(str);
		System.out.print("\n");
		}
		return 0;
	}
}

