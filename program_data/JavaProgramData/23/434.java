package <missing>;

public class GlobalMembers
{
	/*
	 *???? DANCIDAOPAI.cpp
	 *??????
	 *????: 2012-11-21
	 *?????????????
	 */
	public static int Main()
	{
		int i = 0;
		char[][] word = new char[50][50]; //??????????
		while ((word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //?????
		{
			i++;
		}
		int j;
		j = i - 1;
		System.out.print(word[j]);
		j--;
		while (j >= 0)
		{
			System.out.print(" ");
			System.out.print(word[j]);
			j--;
		} //??????
		return 0;
	}

}

