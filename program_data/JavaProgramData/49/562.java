package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int len;
		int i;
		int j;
		int k;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				for (k = 0; k < i / 2; k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - 1 - k))
					{
						k = -1;
						break;
					}
				}
				if (k != -1)
				{
					for (k = j; k < j + i; k++)
					{
						System.out.print(a.charAt(k));
					}
					System.out.print("\n");
				}

			}
		}
		return 0;
	}
}

