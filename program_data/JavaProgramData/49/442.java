import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void run(int i, String a)
	{
		int j;
		int k;
		int l;
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		for (j = 0; j < 500; j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			c = tangible.StringFunctions.changeCharacter(c, j, '\0');
		}
		int len = a.length();
		for (j = 0; j <= len - i; j++)
		{
			for (k = 0; k < i; k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, a[j + k]);
			}
			for (l = 0; l < i; l++)
			{
				c = tangible.StringFunctions.changeCharacter(c, l, b.charAt(b.length() - l - 1));
			}
			for (k = 0; k < i; k++)
			{
				if (b.charAt(k) != c.charAt(k))
				{
					break;
				}
			}
			if (k == i)
			{
				for (k = 0; k < i; k++)
				{
					System.out.print(b.charAt(k));
				}
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
		int i;
		int len;
		String a = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 2; i <= len; i++)
		{
			run(i, a);
		}
		return 0;
	}
}

