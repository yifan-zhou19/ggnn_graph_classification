package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[503]);
		int i;
		int j;
		int k;
		int p;
		int m;
		int l;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		for (m = 2;m <= l;m = m + 2)
		{
			for (i = 0;str.charAt(i + 1) != '\0';i++)
			{
				j = i;
				p = i + 1;
				while (str.charAt(j) == str.charAt(p) && j >= 0 && str.charAt(p) != '\0')
				{
					j--;
					p++;
					if (p != (i + 1) && ((p - j - 1) == m))
					{
						for (k = j + 1;k < p;k++)
						{
							System.out.print(str.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		for (i = 1;str.charAt(i) != '\0';i++)
		{
			j = i - 1;
			p = i + 1;
			while (str.charAt(j) == str.charAt(p) && j >= 0 && str.charAt(p) != '\0')
			{
				j--;
				p++;
			}
			if (p != (i + 1))
			{
				for (k = j + 1;k < p;k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.print("\n");
			}
		}

		return 0;
	}

}

