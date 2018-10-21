package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String st = new String(new char[100]); //st is the sentence(without commar and period)
		char[][] swst = new char[20][20];
		int i;
		int j;
		int k = 1;
		int t;
		st = new Scanner(System.in).nextLine();
		for (i = 1;;i++)
		{
			for (j = 1;;j++)
			{
				if (st.charAt(k - 1) != ' ' && st.charAt(k - 1) != '\0')
				{
					swst[i - 1][j - 1] = st.charAt(k - 1);
					k++;
				}
				if (st.charAt(k - 1) == ' ' || st.charAt(k - 1) == '\0')
				{
					swst[i - 1][j] = '\0';
					k++;
					break;
				}
			}
			if (st.charAt(k - 2) == '\0')
			{
				break;
			}
		}
		System.out.printf("%s",swst[i - 1]);

		for (t = i - 2;t >= 0;t--)
		{
			System.out.printf(" %s",swst[t]);
		}
		System.out.print("\n");
		return 0;
	}
}
