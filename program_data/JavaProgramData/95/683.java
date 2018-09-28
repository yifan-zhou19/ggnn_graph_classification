import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int e = 0;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine(); //??ab
		for (i = 0;i <= a.length();i++)
		{
			if (a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			if (b.charAt(i) > 96)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32); //?????
			}
			if ((a.charAt(i) - 32) * (b.charAt(i) - 32) == 0)
			{
				continue;
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				e = 1;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print('<');
				e = 1;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				continue; //????
			}

		}
		if (e == 0)
		{
			System.out.print('=');
		}
		return 0;
	}

}

