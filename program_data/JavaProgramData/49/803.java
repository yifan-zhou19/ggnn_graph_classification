package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		int i;
		int j;
		int k;
		int flag;
		int count;
		int start;
		int end;
		len = str.length();
		for (i = 2; i <= len - 1; i++) // i???????????
		{
			for (j = 0; j <= len - i; j++) // j???????????,len - i???????????
			{
				flag = 0;
				count = j;
				for (k = j + i - 1; k >= count; count++, k--) // ?k = j?
				{
					flag = 0;
					if (str.charAt(count) == str.charAt(k))
					{
						flag = 1; // ????????
					}
					else
					{
						flag = 0;
						break;
					}
					// ??i??????????????i?????????k???count?count + 1
					if ((flag == 1) && ((k == count) || (k == count + 1)))
					{
						for (start = j; start <= j + i - 1; start++)
						{
							System.out.print(str.charAt(start));
							if (start == j + i - 1)
							{
								System.out.print("\n");
							} // end for
						} // end for
					} // end if
				} // end for k
			} // end for j
		} // end for i
		return 0;
	}

}

