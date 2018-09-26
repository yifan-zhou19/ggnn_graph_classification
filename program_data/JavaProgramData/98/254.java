package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		int len = 0;
		char[][] str = new char[500][40];
		(char)(*p)[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = str;
		for (i = 0; i < n; i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < n - 1; i++)
		{
			len = String.valueOf(*(p + i)).length();
			if (count + len <= 80)
			{
				if (count + len + 1 + String.valueOf(str[i + 1]).length() <= 80)
				{
					System.out.print((p + i));
					System.out.print(" ");
					count += len + 1;
				}
				else
				{
					System.out.print((p + i));
					System.out.print("\n");
					count = 0;
				}
			}
			else
			{
				System.out.print("#");
				System.out.print("\n");
				System.out.print((p + i));
				count = len + 1;
			}
		}
		len = String.valueOf(*(p + n - 1)).length();
		if (count + len + 1 <= 80)
		{
			System.out.print((p + n - 1));
			System.out.print("\n");
		}
		else
		{
			System.out.print("\n");
			System.out.print((p + n - 1));
			System.out.print("\n");
		}
		return 0;
	}


}

