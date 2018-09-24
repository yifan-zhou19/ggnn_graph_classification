package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int k = 0;
		int j = 0;
		int K = 0;
		int l = 0;
		String str = new String(new char[12]);
		for (i = 0;i < 6;i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (k = 0;str.charAt(k) != '\0';k++)
			{
				K = k;
			}
			if (str.charAt(0) == 45)
			{
				System.out.print(str.charAt(0));
				for (j = K;j >= 0;j--)
				{
					if (str.charAt(j) != 48)
					{
						l = j;
						break;
					}

				}
				for (j = l;j > 1;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(str.charAt(1));
				System.out.print("\n");
			}
			if (str.charAt(0) != 45)
			{
				for (j = K;j >= 0;j--)
				{
					if (str.charAt(j) != 48)
					{
						l = j;
						break;
					}
				}
				for (j = l;j > 0;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(str.charAt(0));
				System.out.print("\n");
			}

		}
		return 0;
	}


}

