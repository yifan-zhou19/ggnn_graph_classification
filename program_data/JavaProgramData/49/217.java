import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void revchk(tangible.RefObject<String> a, int l) //????????????
	{
		int i;
		int j = 0;
		for (i = 0;i <= l - 1;i++)
		{
			if (a.argValue.charAt(i) != a.argValue.charAt(l - 1 - i)) //???????
			{
				j = 1;
			}
		}
		if (j == 0)
		{
			for (i = 0;i <= l - 1;i++) //???????
			{
				System.out.print(a.argValue.charAt(i));
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int m;
		int n;
		String b = new String(new char[500]);
		b = new Scanner(System.in).nextLine(); //??
		for (m = 2;m <= (int)b.length();m++) //??2-strlen
		{
			for (n = 0;n <= (int)b.length() - m;n++) //??????m?
			{
				revchk(b.charAt(n), m);
			}
		}
		return 0;

	}
}

