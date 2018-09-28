package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[101]);
		int i;
		st = new Scanner(System.in).nextLine();
		i = 0;
		while (st.charAt(i) != '\0')
		{
			if ((st.charAt(i) != ' ') || (st.charAt(i - 1) != ' '))
			{
				System.out.printf("%c",st.charAt(i));
			}
			i++;
		}
		return 0;
	}

}
