import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int d;
		int c = 0;
		int flag = 1;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			d = a.charAt(i) - '0' + c * 10;
			b = tangible.StringFunctions.changeCharacter(b, i, '0' + d / 13);
			c = d % 13;
		}
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (flag != 0)
			{
				if (b.charAt(i) == '0')
				{
					continue;
				}
				else
				{
					flag = 0;
				}
			}
			System.out.print(b.charAt(i));
		}
		if (flag != 0)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
			System.out.print("\n");
		}
		System.out.print(c);
		System.out.print("\n");
		return 0;
	}
}

