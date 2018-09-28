import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[500]);
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		for (int i = 0; i < N; i++)
		{
			words = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p = words;
			while (*p != '\0')
			{
				if (*p == 'A')
				{
					System.out.print('T');
				}
				else if (*p == 'T')
				{
					System.out.print('A');
				}
				else if (*p == 'C')
				{
					System.out.print('G');
				}
				else if (*p == 'G')
				{
					System.out.print('C');
				}
				p++;
			}
			System.out.print("\n");
		}
		return 0;
	}
}

