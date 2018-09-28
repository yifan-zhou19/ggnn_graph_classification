package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int line = 0;
		int count = 0;
		String ch = new String(new char[45]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n;i++)
		{
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p = ch;
			while (*p != '\0')
			{
				p++;
				count++;
			}
			if (line + count <= 80 && line == 0)
			{
				line = count;
				System.out.print(ch);
				count = 0;
				continue;
			}
			if (line + count + 1 <= 80)
			{
					System.out.print(' ');
					System.out.print(ch);
					line = count + 1 + line;
					count = 0;
					continue;
			}
			if (line + count + 1 > 80)
			{
				System.out.print("\n");
				System.out.print(ch);
				line = count;
				count = 0;
			}

		}
		return 0;
	}









}

