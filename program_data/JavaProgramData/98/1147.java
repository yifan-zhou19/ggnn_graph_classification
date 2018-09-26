import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		String c;
		int flag = 0;
		c = str;
		b = str;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		if (len == 80)
		{
			System.out.print(str);
		}
		else
		{
		for (; b - str < len + 1; b++)
		{
			if ((b - c.Substring(1)) % 80 == 0 != null)
			{
				if (*b == ' ')
				{
					for (b = c; b < c.Substring(79); b++)
					{
						System.out.print(b);
					}
					System.out.print("\n");
					b++;
					c = b;
				}
				else
				{
					if (*(b + 1) == ' ')
					{
						for (b = c; b < c.Substring(80); b++)
						{
							System.out.print(b);
						}
						System.out.print("\n");
						b++;
						c = b;
					}
					else
					{
						int num = 0;
						if (*(b + 1) != ' ')
						{
							while (*b != ' ')
							{
								b--;
								num++; // ???????????????????
							}
							for (b = c; b < c.Substring(79) - num; b++)
							{
								 System.out.print(b);
							}
							 System.out.print("\n");
							 b++;
							 c = b;
						}
					}
				}

			}
			if (*b == '\0')
			{
				b = c;
				while (*b != '\0')
				{
					System.out.print(b);
					b++;
				}
				System.out.print("\n");
			}
		}
		}
		return 0;
	}



}

