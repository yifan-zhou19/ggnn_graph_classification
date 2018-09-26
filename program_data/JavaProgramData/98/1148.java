import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ????????????.cpp : ??????????????
	//



	public static int Main()
	{
		int x;
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int word = 0;
		String a = new String(new char[10000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		for (;;)
		{
			if (word == n)
			{
				break;
			}
			while (*(p + i) != ' ' && *(p + i) != '\0')
			{
				k++;
				i++;
			}
			if (i <= 80 && i != k)
			{
				System.out.print(' ');
			}
			if (i <= 80)
			{
				for (j = i - k;j <= i - 1;j++)
				{
					System.out.print((p + j));
				}
				i++;
				k = 0;
				word++;
			}
			if (i > 80)
			{
				System.out.print("\n");
				for (x = 1;x <= i - k;x++)
				{
					*p++;
				}
				i = 0;
				k = 0;
			}
		}
		return 0;
	}

}

