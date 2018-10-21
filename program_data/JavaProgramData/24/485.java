package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		String[] b = {""};
		final String longstr = "";
		final String shortstr = "";
		int i;
		int k = 0;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{

			b[k][j] = a.charAt(i);
			j++;
			if (a.charAt(i) == 32)
			{
				b[k][j - 1] = '\0';
				k = k + 1;
				j = 0;

			}
		}
		longstr = b[0];
		shortstr = b[0];
		for (i = 0;i <= k;i++)
		{

			if (String.valueOf(b[i]).length() > longstr.length())
			{
				longstr = b[i];
			}
			if (String.valueOf(b[i]).length() < shortstr.length())
			{
				shortstr = b[i];
			}
		}
		System.out.printf("%s\n%s\n",longstr,shortstr);
	}

}
