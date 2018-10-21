package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int nhuiwen;
		int len;
		String str = new String(new char[500]);

		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (nhuiwen = 2; nhuiwen <= len; nhuiwen++)
		{
			final String buf1 = "";
			final String buf2 = "";
			for (i = 0; i + nhuiwen - 1 < len; i++)
			{
				int n = nhuiwen;
				int m = 0;
				for (j = i; j <= i + nhuiwen - 1; j++)
				{
					buf1 = tangible.StringFunctions.changeCharacter(buf1, --n, str.charAt(j));
					buf2 = tangible.StringFunctions.changeCharacter(buf2, m++, str.charAt(j));
				}
				//cout << "n = " << n << endl << "m = " << m << endl;
				buf1 = tangible.StringFunctions.changeCharacter(buf1, nhuiwen, '\0');
				buf2 = tangible.StringFunctions.changeCharacter(buf2, nhuiwen, '\0');
				if (strcmp(buf1, buf2) == 0)
				{
					for (k = 0; k < nhuiwen; k++)
					{
						System.out.print(buf1.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

