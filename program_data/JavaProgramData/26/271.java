import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String se;
		String a = new String(new char[100]);
		char n;
		char i;
		a = new Scanner(System.in).nextLine();
		se = a;
		n = a.length();
		for (i = 0; * (se + i) != '\0'; i++)
		{
			if (*(se + i - 1) == ' ' && *(se + i) == ' ')
			{
				se + i = se + i + 1;
				i--;
			}
		}
		System.out.print(se);
		System.out.print("\n");
		return 0;
	}
}
