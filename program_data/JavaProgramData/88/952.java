import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pointer = null;
		str = new Scanner(System.in).nextLine();
		pointer = str;
		while (*pointer != 0)
		{
			if (*pointer >= '0' && *pointer <= '9')
			{
				if (pointer == str || *(pointer - 1) != '-')
				{
					while (*pointer >= '0' && *pointer <= '9')
					{
						System.out.print(pointer);
						pointer++;
					}
					System.out.print("\n");
				}
				else
				{
					while (*pointer >= '0' && *pointer <= '9')
					{
						pointer++;
					}
				}
			}
			else
			{
				pointer++;
			}
		}
		return 0;
	}

}
