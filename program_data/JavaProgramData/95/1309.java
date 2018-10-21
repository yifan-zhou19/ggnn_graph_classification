import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int cmp(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int ai = 0;
		int bi = 0;
		while (a.argValue.charAt(ai) != 0 && b.argValue.charAt(bi) != 0)
		{
			if (a.argValue.charAt(ai) > b.argValue.charAt(bi))
			{
				return 1;
			}
			if (a.argValue.charAt(ai) < b.argValue.charAt(bi))
			{
				return -1;
			}
			ai++;
			bi++;
		}
		if (a.argValue.charAt(ai) != 0)
		{
			return 1;
		}
		if (b.argValue.charAt(bi) != 0)
		{
			return -1;
		}
		return 0;
	}

	public static void strlw(tangible.RefObject<String> a)
	{
		int i = 0;
		while (a.argValue.charAt(i) != 0)
		{
			if (a.argValue.charAt(i) >= 'A' && a.argValue.charAt(i) <= 'Z')
			{
				a.argValue.charAt(i) += ('a'-'A');
			}
			i++;
		}
	}
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		strlw(tempRef_a);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		strlw(tempRef_b);
		b = tempRef_b.argValue;
		switch (cmp(a, b))
		{
		case 0:
			System.out.print('=');
			System.out.print("\n");
			break;
		case 1:
			System.out.print('>');
			System.out.print("\n");
			break;
		case -1:
			System.out.print('<');
			System.out.print("\n");
			break;
		}
		return 0;
	}
}

