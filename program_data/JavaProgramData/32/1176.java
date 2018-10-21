import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[120]);
		String b = new String(new char[120]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int q = 1;q <= n;q++)
		{
			System.in.read();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			for (int i = 0;i < b.length();i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 96 - b.charAt(i));
			}
			for (int i = 1;i <= b.length();i++)
			{
				a.charAt(a.length() - i) += (b.charAt(b.length() - i) - 48);
			}
			for (int i = a.length() - 1;i >= 0;i--)
			{
				if (a.charAt(i) < 48)
				{
					a.charAt(i) += 10;
					a.charAt(i - 1)--;
				}
			}
			for (int i = 0;i < a.length();i++)
			{
				System.out.print((int)(a.charAt(i) - 48));
			}
			System.out.print("\n");
		}

		return 0;
	}

}

