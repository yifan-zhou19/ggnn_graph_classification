import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char check(String a, String b)
	{

		for (int i = 0;;i++)
		{
			if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
			{
				a[i] -= ('A'-'a');
			}
			if (b[i].compareTo('A') >= 0 && b[i].compareTo('Z') <= 0)
			{
				b[i] -= ('A'-'a');
			}


			if (a[i].compareTo(b[i]) > 0)
			{
				return '>';
			}
			if (a[i].compareTo(b[i]) < 0)
			{
				return '<';
			}

			if (a[i].equals('\0'))
			{
				return'=';
			}

		}

	}

	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);

		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		System.out.print(check(a, b));
		return 0;
	}
}
