package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		String word = new String(new char[10000]);
		char c;
		word = new Scanner(System.in).nextLine();
		len = word.length();
		c = word.charAt(0);
		for (i = 0;i < len - 1;i++)
		{
		word.charAt(i) += word.charAt(i + 1);
		}
		word.charAt(i) += c;
		System.out.printf("%s",word);
	   // getch();
		return 0;
	}

}
