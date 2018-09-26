package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words1 = new String(new char[300]);
		char k;
		int i;
		int n = 0;
		words1 = new Scanner(System.in).nextLine();
		k = words1.charAt(0);
		for (i = 0;words1.charAt(i);i++)
		{
			n++;
		}
		for (i = 0;i < n - 1;i++)
		{
			words1 = tangible.StringFunctions.changeCharacter(words1, i, words1.charAt(i) + words1.charAt(i + 1));
		}
		words1 = tangible.StringFunctions.changeCharacter(words1, n - 1, words1.charAt(n - 1) + k);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",words1.charAt(i));
		}
		return 0;
	}

}

