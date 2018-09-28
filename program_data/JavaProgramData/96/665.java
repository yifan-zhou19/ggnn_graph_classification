import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = ""; // a???????b???13???
		final String b = "";
		a = new Scanner(System.in).nextLine(); // ?a??
		int r; // r???
		int i;
		r = 0;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, ((r * 10 + (a.charAt(i) - '0')) / 13) + '0'); // ???????a????????13??b??????
			r = (r * 10 + (a.charAt(i) - '0')) % 13; // ???????a????????13????
		}
		if (a.charAt(1) == '\0' || ((a.charAt(0) - '0') == 1 && ((a.charAt(1) - '0') < 3) && (a.charAt(2) == '\0'))) // ???????13?????0
		{
			System.out.print('0');
		}
		else if ((b.charAt(1) - '0') != 0) // ?b?????0??????????b
		{
			for (i = 1; b.charAt(i) != '\0'; i++)
			{
				System.out.print(b.charAt(i));
			}
		}
		else // ??????????
		{
			for (i = 2; b.charAt(i) != '\0'; i++)
			{
				System.out.print(b.charAt(i));
			}
		}
		System.out.print("\n");
		System.out.print(r);
		return 0;
	}
}

