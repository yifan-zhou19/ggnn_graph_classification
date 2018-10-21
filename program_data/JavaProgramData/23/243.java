package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[200]);
		String[] word = {""};
		st = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int l;
		int number = 0;
		l = st.length();

		for (i = 0;i < l;i++)
		{
			if (st.charAt(i) != ' ')
			{
				word[number][j++] = st.charAt(i);
			}
			else if (st.charAt(i) == ' ' && st.charAt(i + 1) != ' ')
			{
				word[number++][j] = '\0';
				j = 0;
			}
		}
		word[number][j] = '\0';
		for (i = number;i > 0;i--)
		{
			System.out.printf("%s",word[i]);
			System.out.print(" ");
		}
		System.out.printf("%s",word[0]);
		return 0;
	}


}
