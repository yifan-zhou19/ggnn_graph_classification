package <missing>;

public class GlobalMembers
{
	/*
	 *????reversal.cpp
	 *??:???
	 *?????2012-11-10
	 *???????
	 */



	public static int Main()
	{
		int i;
		int j;
		int n = -1;
		String temp = new String(new char[101]); // word????
		char[][] word = new char[101][101];
		while ((temp = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			word[++n] = temp; // ?????????
		}
		for (i = 0,j = n;i < j;i++,j--) // ?????
		{
			temp = word[i]; // ??
			word[i] = word[j];
			word[j] = temp;
		}
		for (i = 0;i < n;i++) // ??
		{
			System.out.print(word[i]);
			System.out.print(' ');
		}
		System.out.print(word[n]);
		System.out.print("\n");
		return 0;
	}
}

