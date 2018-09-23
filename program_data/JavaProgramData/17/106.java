package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int len;
		String a = new String(new char[101]);

		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int[] b = new int[100];
			len = a.length();

		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ')')
			{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				char * p = a.charAt(i - 1);
				for (j = i - 1;j >= 0;j--)
				{
					if (*p == '(' && b[j] == 0)
					{
						b[j] = 1;
						b[i] = 1;
						break;
					}
					p--;

				}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == '(' && b[i] == 0)
			{
				System.out.print("$");
			}
			else
			{
				if (a.charAt(i) == ')' && b[i] == 0)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		System.out.print("\n");
		}
		return 0;
	}

}

