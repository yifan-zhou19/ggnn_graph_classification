package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String t = new String(new char[85]);
		String in = new String(new char[45]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = in;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int sum = 0;
		int len;
		int j;
		int k = 0;

		for (i = 0; i < n; i++)
		{
			in = ConsoleInput.readToWhiteSpace(true).charAt(0);

			q = in;
			k = 0;

			len = in.length();

			while (*q != '\0')
			{
				*p++= *q++;
				k++;
				sum++;

				if (sum > 80)
				{
					p = p - k;
					sum -= k;

					if (*(p - 1) == ' ')
					{
						p--;
						sum--;
					}

					q = in;
					k = 0;

					*p = '\0';
					System.out.print(t);
					System.out.print("\n");

					p = t;
					sum = 0;

					while (*q != 0)
					{
						*p++= *q++;
						k++;
						sum++;
					}
				}
			}
			if (sum < 80)
			{
				*p = ' ';
				p++;
				sum++;
			}
		}
		p--;
			*p = '\0';
			System.out.print(t);
		return 0;
	}
}

