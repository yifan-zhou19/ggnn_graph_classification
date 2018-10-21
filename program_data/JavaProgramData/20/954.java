package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[12]);
		String substr = new String(new char[5]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		int size = 0;
		for (int i = 0;i <= 10;i++)
		{
			if (str.charAt(i) == '\0')
			{
					size = i;
			break;
			}
		}
		int tmp = 0;
		for (int i = 0;i < size;i++)
		{
			if (str.charAt(i) > tmp)
			{
				tmp = str.charAt(i);
			}
		}
		int j = 0;
		for (int i = 0;i < size;i++)
		{
			if (str.charAt(i) == tmp)
			{
				j = i;
				break;
			}
		}
		for (int i = 0;i <= j;i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print(substr);
		if (j < size-1)
		{
			for (int i = j + 1;i < size;i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.print("\n");
		}
		return 0;
	}
}

