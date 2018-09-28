package <missing>;

public class GlobalMembers
{
	//2014.1.2
	//zwb

	public static int Main()
	{
		int i;
		int j;
		int k;
		int flag = 0;
		final String a = "";
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = a.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				flag = 0;
				for (k = j; k <= i / 2 + j; k++)
				{
					if (a.charAt(k) != a.charAt(i + j + j - 1 - k))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					for (k = j; k <= i + j - 1; k++)
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

