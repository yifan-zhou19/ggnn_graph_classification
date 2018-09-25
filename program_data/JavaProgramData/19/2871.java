public class WORD
{
	public String str = new String(new char[100]);
	public int length;
}

package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: WORD words[100];
	public static short[] words = new short[100];

	public static int Main()
	{
		String str = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);

		int i;
		int j;
		int k;
		int numOfWords;

		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		// printf("%s %s %s\n", str, a, b);

		//printf("length of string = %d\n", strlen(str));

		for (i = 0, j = 0, k = 0; i < str.length(); i++)
		{
			if (str.charAt(i) != ' ')
			{
				words[j].str[k++] = str.charAt(i);
			}
			else
			{
				words[j++].length = k - 1;
				k = 0;
			}
		}

		numOfWords = j + 1;

		//printf("number of words = %d\n", numOfWords);

		for (i = 0; i < numOfWords; i++)
		{
			if (tangible.StringFunctions.strStr(words[i].str, a) && String.valueOf(words[i].str).length() == a.length())
			{
				System.out.printf("%s", b);
			}
			else
			{
				System.out.printf("%s", words[i].str);
			}

			if (i != numOfWords - 1)
			{
				System.out.print(" ");
			}
		}


		return 0;
	}

}

