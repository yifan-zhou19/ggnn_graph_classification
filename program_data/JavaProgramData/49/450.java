package <missing>;

public class GlobalMembers
{
	public static void huiwen(String str)
	{
		int i;
		int j;
		int k;
		int t;
		int x;
		int len;
		int count;
		len = str.length();
		for (j = 2; j < len + 1; j++) //j???????????
		{
			for (i = 0; i <= len - j; i++) //i?????????
			{
				count = 0;
				for (k = i, t = i + j - 1; k < t; k++, t--) //k, t???????????????????
				{
					if (str[k].equals(str[t]))
					{
						count++;
					}
				}
				if (count == j / 2)
				{
					for (x = i; x < i + j; x++)
					{
						System.out.print(str[x]);
					}
					System.out.print("\n");
				}
			}
		}
	}


	public static int Main()
	{
		String str = new String(new char[500]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		huiwen(str);
		return 0;
	}









}

