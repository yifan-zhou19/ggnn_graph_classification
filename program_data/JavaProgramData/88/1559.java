import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String a = new String(new char[31]);
		char count;
		char i;
		a = new Scanner(System.in).nextLine();
		p = a;
		count = 0;
		for (i = 0; * (p + i) != '\0';i++)
		{
			if (*(p + i) >= '0' && *(p + i) <= '9')
			{
				System.out.print((p + i));
				count = 0;
			}
			else
			{
				count++;
				if (count == 1)
				{
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}
