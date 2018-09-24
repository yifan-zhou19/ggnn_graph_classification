package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int begin;
		int end;
		int flag;
		int p;
		String a = new String(new char[501]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			p = i;
		}
		p++;
		for (i = 2; i <= p; i++)
		{
			for (j = 0; j <= p - i; j++)
			{
				flag = 1;
				for (begin = j, end = j + i - 1; end > begin; begin++, end--)
				{
					if (a.charAt(begin) != a.charAt(end))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (begin = j; begin <= j + i - 1; begin++)
					{
						System.out.print(a.charAt(begin));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

