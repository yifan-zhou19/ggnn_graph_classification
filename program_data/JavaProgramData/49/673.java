package <missing>;

public class GlobalMembers
{
	/*
	 * ????first.cpp
	 * ???00948343_??
	 * ?????2012/9/16
	 * ?????1???100?????????
	 */


	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[30][500];
		String temp = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = a.length();
		int i;
		int j;
		int k;
		int count = 0;
		for (i = 0;i < length;i++)
		{
			for (j = i + 1;j < length;j = j + 2)
			{
				for (k = 0;k < (j - i + 1) / 2;k++)
				{
					if (a.charAt(i + k) != a.charAt(j - k))
					{
						break;
					}
				}
				if (k == (j - i + 1) / 2)
				{
					for (k = i;k < j + 1;k++)
					{
						b[count][k - i] = a.charAt(k);
					}
					b[count][j + 1 - i] = '\0';
					count++;
				}
			}
		}
		for (i = 0;i < count - 1;i++)
		{
			for (j = 0;j < count - 1 - i;j++)
			{
				if (String.valueOf(b[j]).length() > String.valueOf(b[j + 1]).length())
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

