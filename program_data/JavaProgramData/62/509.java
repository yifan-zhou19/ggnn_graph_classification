package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[1000]);
		int i;
		int j;
		int l;
		st = new Scanner(System.in).nextLine();
		l = st.length();
		for (i = 0;i < l - 1;i++)
		{
			if ((st.charAt(i) == ' ') && (st.charAt(i + 1) == ' ')) //????????????.
			{
				for (j = i;j < l;j++)
				{
					st = tangible.StringFunctions.changeCharacter(st, j, st.charAt(j + 1));
				}
				i--; //????,????????
			}
		}
		System.out.print(st);
		System.out.print("\n");
		return 0;
	}

}

