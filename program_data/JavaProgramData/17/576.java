package <missing>;

public class GlobalMembers
{
	public static int[] pp = new int[120];
	public static void kuohao(String a)
	{

		int i;
		int j;
		int len = a.length();
		for (i = 0;i <= len - 1;i++)
		{
			if (a[i].equals(')'))
			{
				for (j = i;j >= 0;j--)
				{
					if (a[j].equals('('))
					{
						pp[i] = 0;
						pp[j] = 0;
						a[i] = 'a';
						a[j] = 'a';
						break;
					}
					if (j == 0)
					{
						pp[i] = 1;
					}
				}
				a[i] = 'a';
				kuohao(a);

			}
			if (i == len - 1)
			{
				for (j = 0;j <= len - 1;j++)
				{
					if (a[j].equals('('))
					{
						pp[j] = -1;
					}
				}
				return;
			}
		}

	}



	public static int Main()
	{
		String str = new String(new char[200]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(str);
			System.out.print("\n");
			int i;
			for (i = 0;i <= 119;i++)
			{
				pp[i] = 0;
			}
			kuohao(str);
			for (i = 0;i <= str.length() - 1;i++)
			{
				if (pp[i] == 0)
				{
					System.out.print(" ");
				}
				else if (pp[i] == 1)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print("$");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

