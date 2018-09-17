package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int len;
		String s = new String(new char[1001]);
		char c;

		s = new Scanner(System.in).nextLine();

		len = s.length();



		for (i = 0;i < len;i++)
		{
			k = 1;
			c = s.charAt(i);
			if ((c >= 97) && (c <= 122))
			{
				c = c - 32;
			}

			while ((s.charAt(i + 1) == c) || (s.charAt(i + 1) == c + 32))
			{
				i++;
			k++;
			}

			System.out.printf("(%c,%d)",c,k);

		}
		return 0;
	}

}
