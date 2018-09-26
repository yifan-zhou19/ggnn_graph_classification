package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int sum = 0;
		int len1;
		int len2;
		int i;
		int j;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str1.length();
		len2 = str2.length();
		if (len1 != len2)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		else
		{
			for (i = 0; i < len1; i++)
			{
				for (j = 0; j < len1; j++)
				{
					if (str2.charAt(j) == str1.charAt(i))
					{
						str2 = str2.substring(0, j);
						sum++;
						break;
					}
				}
			}
			if (sum == len1)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

