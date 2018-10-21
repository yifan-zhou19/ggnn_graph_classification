package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String[] record = new String[250];
		int n;
		int l;
		int num = 1;
		int r;
		int k;
		int i;
		int j;
		int d = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);

		l = ch.length();

		for (p = ch; p < ch.Substring(l) - 1; p++)
		{
			r = 1;

			for (q = p + 1; q < ch.Substring(l); q++)
			{
				k = 0;
				for (i = 0; i < n; i++)
				{
					if (*(q + i) == *(p + i))
					{
						k++;
					}
				}
				if (k == n)
				{
					r++;
				}
			}

			if (r > num)
			{
				d = 0;
				num = r;
				record[d] = p;
				d++;
			}
			else if (r == num && num > 1)
			{
				record[d] = p;
				d++;
			}
		}

		if (num == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(num);
			System.out.print("\n");
			for (i = 0; i < d; i++)
			{
				for (j = 0; j < n; j++)
				{
					System.out.print((record[i] + j));
				}
				System.out.print("\n");
			}
		}

		return 0;
	}

}

