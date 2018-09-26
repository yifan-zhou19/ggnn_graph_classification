package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int len;
		int cnt = 0;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String s = new String(new char[505]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = s.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String a;
		for (p = s;p <= s.Substring(len) - n;p++) //??????????????
		{
			cnt = 1; //???
			for (q = p + 1;q <= s.Substring(len) - n;q++) //?????????????
			{
				for (j = 0;j < n;j++)
				{
					if (*(p + j) != *(q + j))
					{
						break;
					}
				}
				if (j == n)
				{
					cnt = cnt + 1;
				}
			}
			if (cnt > max)
			{
				max = cnt;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (p = s;p <= s.Substring(len) - n;p++) //?????????????
			{
				cnt = 1;
				for (q = p + 1;q <= s.Substring(len) - n;q++) //??????
				{
					for (j = 0;j < n;j++)
					{
					if (*(p + j) != *(q + j))
					{
						break;
					}
					}
				if (j == n)
				{
					cnt = cnt + 1;
				}
				}
				if (cnt == max)
				{
					a = p;
					for (j = 0;j < n;j++)
					{
						System.out.print((a.Substring(j)));
					}
					System.out.print("\n");
				}
			}
		}

			return 0;
	}
}

