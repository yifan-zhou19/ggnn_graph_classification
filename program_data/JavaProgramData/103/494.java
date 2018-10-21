import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int zimu(char m)
	{
		int num = 0;
		if (m <= 'Z' && m >= 'A')
		{
			num = m - 'A' - 1;
		}
		else if (m <= 'z' && m >= 'a')
		{
			num = m - 'a' - 1;
		}
		return num;
	}

	public static int Main()
	{
		int k = 1;
		int i = 1;
		String a = new String(new char[10001]);
		char temp;
		a = new Scanner(System.in).nextLine();
		temp = a.charAt(0);
		while (a.charAt(i) != '\0')
		{
			if (zimu(a.charAt(i)) == zimu(temp))
			{
				k++;
			}
			else
			{
				System.out.print('(');
				System.out.print((char)('A' + 1 + zimu(temp)));
				System.out.print(',');
				System.out.print(k);
				System.out.print(')');
				k = 1;
				temp = a.charAt(i);
			}
			i++;
		}
		if (zimu(a.charAt(i - 1)) != zimu(a.charAt(i - 2) || k > 1))
		{
			System.out.print('(');
			System.out.print((char)('A' + 1 + zimu(temp)));
			System.out.print(',');
			System.out.print(k);
			System.out.print(')');
		}
		return 0;
	}

}
