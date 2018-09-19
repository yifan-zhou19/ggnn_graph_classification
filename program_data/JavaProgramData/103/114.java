package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[1010]);
		char ch;
		int i;
		int j;
		int k;

		st = new Scanner(System.in).nextLine();
		for (i = 0; st.charAt(i) != '\0'; i++)
		{
			if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
			{
				st = tangible.StringFunctions.changeCharacter(st, i, st.charAt(i) - 'a'+'A');
			}
		}
		ch = st.charAt(0);
		k = 1;
		for (i = 1; st.charAt(i) != '\0'; i++)
		{
			if (st.charAt(i) != ch)
			{
				System.out.printf("(%c,%d)", ch, k);
				ch = st.charAt(i);
				k = 1;
			}
			else
			{
				k++;
			}
		}
		System.out.printf("(%c,%d)\n", ch, k);
		return 0;
	}

}

