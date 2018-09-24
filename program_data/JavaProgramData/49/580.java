package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[520]);
		int len;
		int i;
		int j;
		int k;
		int num;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 2; i <= len; i++)
		{
			for (j = 0; j <= len - i; j++)
			{
				num = 0;
				for (k = 0; k < i; k++)
				{
					if (str.charAt(j + k) == str.charAt(j + i - k - 1))
					{
						num++;
					}
				}
				if (num == i)
				{
					for (k = 0; k < i; k++)
					{
						System.out.print(str.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

