package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int l;
		String p = new String(new char[505]);
		int b;
		int w;
		int i;
		int flag;

		p = ConsoleInput.readToWhiteSpace(true).charAt(0);

		l = p.length();

		for (w = 2; w <= l; w++)
		{
			for (b = 0; b <= l - w; b++)
			{
				flag = 1;

				for (i = 0; i < w / 2 + 1 ; i++)
				{
					if (p.charAt(b + i) != p.charAt(b + w - 1 - i))
					{
						flag = 0;
						break;
					}
				}

				if (flag == 1)
				{
					for (i = b; i < b + w; i++)
					{
						System.out.print(p.charAt(i));
					}

					System.out.print("\n");
				}
			}
		}

			return 0;
	}



}

