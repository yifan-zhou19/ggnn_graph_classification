package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		final String word = "";
		str = new Scanner(System.in).nextLine();
		int i;
		int n;
		int j = 0;
		int s = 0;
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				word.charAt(j)[s] = str.charAt(i);
				s++;
			}
			else
			{
				j++;
				s = 0;
			}
		}
		for (i = j;i > 0;i--)
		{
			System.out.printf("%s ",word.charAt(i));
		}
		System.out.printf("%s",word.charAt(0));
	}

}
