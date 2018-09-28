package <missing>;

public class GlobalMembers
{
	// ****************************
	// ??? ? ????
	// ?? ? ??? 1300012972
	// ?? ? 12.15
	// ****************************




	public static int Main()
	{
		String str = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int j;
		int[] num = new int[500];
		int len;
		int k;
		int m;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);

		len = str.length(); // ????????

		for (p = str, q = num; p <= str.Substring(len) - m; p++, q++) //  ????????????????????????????
		{
			(*q)++;

			for (j = 1; p + j <= str.Substring(len) - m; j++)
			{
				for (k = 0; k < m; k++) //  ??????????
				{
					if (*(p + k) != *(p + j + k))
					{
						break;
					}
				}
				if (k == m)
				{
					(*q)++;
				}
			}

			if (max < *q) // ??????????
			{
				max = q;
			}
		}

		if (max < 2) // ??????????
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");

			for (q = num, p = str; q <= num + len - m; q++, p++)
			{
				if (max == *q)
				{
					for (k = 0; k < m; k++)
					{
						System.out.print((p + k));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

