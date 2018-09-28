package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		String st = new String(new char[101]);
		st = new Scanner(System.in).nextLine();
		for (i = 0;i < 101;i++)
		{
			if (st.charAt(i) == '\0')
			{
				a = i;
				break;
			}
		}
		for (i = 0;i < a;i++)
		{
			if (!(st.charAt(i) == ' ' && st.charAt(i + 1) == ' '))
			{
			System.out.printf("%c",st.charAt(i));
			}
		}
		return 0;
	}

}
