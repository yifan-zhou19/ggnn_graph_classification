package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		final String st = "\0";
		final String str = "\0";
		st = new Scanner(System.in).nextLine();
		for (i = 103;i >= 0;i--)
		{
			if (*(st.Substring(i)) != '\0')
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			*(str.Substring(j)) = *(st.Substring(j)) + *(st.Substring(j) + 1);
		}
		*(str.Substring(i)) = *(st.Substring(i)) + *(st.Substring(0));
		for (k = 0;k <= i;k++)
		{
			System.out.printf("%c",*(str.Substring(k)));
		}
		return 0;
	}

}
