import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String a = new String(new char[100]);
		char b;
		char g;
		a = new Scanner(System.in).nextLine();
		for (n = 0; a.charAt(n) != '\0'; n++)
		{
			;
		}
		b = a.charAt(0);
		for (i = 0; a.charAt(i) == b; i++)
		{
			;
		}
		g = a.charAt(i);
		for (i = 0; i < n / 2; i++)
		{
			for (j = 0; a.charAt(j) != g; j++)
			{
				;
			}
			for (k = j; a.charAt(k) != b; k--)
			{
				;
			}
			System.out.print(k);
			System.out.print(" ");
			System.out.print(j);
			System.out.print("\n");
			a = tangible.StringFunctions.changeCharacter(a, k, '0');
			a = tangible.StringFunctions.changeCharacter(a, j, '0');

		}
		return 0;
	}

}

