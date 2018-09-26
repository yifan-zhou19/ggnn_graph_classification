package <missing>;

public class GlobalMembers
{
	//???2010?11?24?
	//???1000010586_???
	//???????

	public static int Main()
	{
		int len;
		int i;
		int j;
		int k;
		int l;
		String word = new String(new char[500]);
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = word.length();
		for (i = 1 ; i <= len / 2 ; i++)
		{
			for (j = 0 ; j <= len - i ; j++)
			{
				for (k = 0 ; k <= i - 1 ; k++)
				{
					if (word.charAt(j + k) != word.charAt(j + 2 * i - 1 - k))
					{
						break;
					}
				}
				if (k == i)
				{
					for (l = 0 ; l <= 2 * i - 1 ; l++)
					{
						System.out.print(word.charAt(j + l));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

