package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 's', so pointers on this parameter are left unchanged:
	public static int getone(char * s)
	{
		int count = 0;
		if (!cin.get(*s))
		{
			return -1;
		}
		while (*s != ' ' && *s != 0)
		{
			s = s.Substring(1);
			count++;
			if (!cin.get(*s))
			{
				break;
			}
		}
		*s = 0;
		return count;
	}



	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String s = new String(new char[41]);
		int c = 0;
		int r = 80;
		for (int i = 0 ; i < n ; i++)
		{
			c = getone(s);
			if (r == 80)
			{
				System.out.print(s);
				r -= c;
			}
			else
			{
				if (r > c)
				{
					System.out.print(' ');
					System.out.print(s);
					r -= c + 1;
				}
				else
				{
					System.out.print("\n");
					System.out.print(s);
					r = 80 - c;
				}
			}
		}
	}
}

