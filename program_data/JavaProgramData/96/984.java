import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*???? ??(12-11) ??13 
	//********************************

	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int i;
		int yu;
		int sh;
		int lin;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		yu = 0;
		for (i = 0; i < l; i++)
		{
			lin = 10 * yu + (a.charAt(i) - '0');
			b = tangible.StringFunctions.changeCharacter(b, i, lin / 13);
			yu = lin % 13;
		}
		if ((l == 1) || ((l == 2) && (a.charAt(0) == '1') && (a.charAt(1) < '3')))
		{
			System.out.print("0");
		}
		else
		{
			if (b.charAt(1) != null)
			{
				for (i = 1; i < l; i++)
				{
					System.out.print((int)b.charAt(i));
				}
			}
			else
			{
				for (i = 2; i < l; i++)
				{
					System.out.print((int)b.charAt(i));
				}
			}
		}
		System.out.print("\n");
		System.out.print(yu);
		System.out.print("\n");
		System.in.read();
		System.in.read(); //????
		return 0;
	}

}

