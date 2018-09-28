package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int num = 0;
		String ch = new String(new char[45]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = ch.length();
			p = ch;

			if (num == 0)
			{
				for (j = 0; j < l; j++)
				{
					System.out.print(p++);
					num++;
				}
			}

			else if (num > 0 && num + l + 1 <= 80)
			{
				System.out.print(" ");
				num++;

				for (j = 0; j < l; j++)
				{
					System.out.print(p++);
					num++;
				}
			}

			else if (num > 0 && num + 1 + l > 80)
			{
				System.out.print("\n");
				num = l;
				for (j = 0; j < l; j++)
				{
					System.out.print(p++);
				}
			}
		}

		return 0;
	}

}

