import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void friends(tangible.RefObject<String> p, int len)
	{
		int i;
		char m = p.argValue;
		for (i = 0; i < len - 1; i++)
		{
			*(p.argValue.Substring(i)) += *(p.argValue.Substring(i) + 1);
		}
		*(p.argValue.Substring(len) - 1) += m;
	}

	public static int Main()
	{
		String a = new String(new char[105]);
		a = new Scanner(System.in).nextLine();
		int len = a.length();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		friends(tempRef_a, len);
		a = tempRef_a.argValue;
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

