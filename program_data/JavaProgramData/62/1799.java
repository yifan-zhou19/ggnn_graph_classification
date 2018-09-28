import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String Sentence = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pos = Sentence;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * shift = null;
		Sentence = new Scanner(System.in).nextLine();

		for (; * pos != '\0'; pos++)
		{
			if (*pos != ' ')
			{
				System.out.print(pos);
			}
			else
			{
				System.out.print(pos);
				shift = pos + 1;
				for (; * shift == ' ';)
				{
					shift++;
				}
				pos = shift;
				System.out.print(pos);
			}
		}
		System.out.print("\n");
		return 0;
	}
}
