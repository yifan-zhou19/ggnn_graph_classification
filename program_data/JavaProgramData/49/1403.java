package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[530]);
		int i;
		int j;
		int lng;
		int len;
		int h;
		int k;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (lng = 2; lng <= len; lng++)
		{
			for (h = 0; h < len; h++)
			{
				i = h;
				j = h + lng - 1;
				while (i < j)
				{
					if (str.charAt(i) != str.charAt(j))
					{
						break;
					}
					i++;
					j--;
				}
				if (i == j || i > j)
				{
					for (k = 0; k < lng - 1; k++)
					{
						System.out.print(str.charAt(h + k));
					}
					System.out.print(str.charAt(h + k));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

