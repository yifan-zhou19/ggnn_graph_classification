import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String a1 = new String(new char[101]);
		String a2 = new String(new char[101]);
		int i;
		int k;
		int l;
		int la;
		int lb;
		int lc;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();


		lb = b.length();
		lc = c.length();

		l = 0;
		a = tangible.StringFunctions.changeCharacter(a, -1, ' ');
		for (;;)
		{ //??????????
		la = a.length();
		i = 0;

		for (k = l;k <= la - 1;k++) //??????????
		{
		 if (a.charAt(k) == b.charAt(i))
		 {
			 i++;
			 if (i == lb && (a.charAt(k + 1) == ' ' || a.charAt(k + 1) == '\0') && (a.charAt(k - lb) == ' '))
			 {
				 break;
			 }
		 }
		 else
		 {
			 i = 0;
		 }
		}

		if (k == la)
		{
			break;
		}

		a1 = tangible.StringFunctions.changeCharacter(a1, 0, '\0');
		for (i = 0;i <= k - lb;i++) //??
		{
		a1 = tangible.StringFunctions.changeCharacter(a1, i, a.charAt(i));
		}
		a1 = tangible.StringFunctions.changeCharacter(a1, k - lb + 1, '\0');

		a2 = tangible.StringFunctions.changeCharacter(a2, 0, '\0');
		for (i = 0;i <= la - k - 2;i++)
		{
		a2 = tangible.StringFunctions.changeCharacter(a2, i, a.charAt(k + 1 + i));
		}
		a2 = tangible.StringFunctions.changeCharacter(a2, la - k - 1, '\0');

		a1 += c; //??
		a1 += a2;
		a = a1;


		l = k - lb + 1 + lc;
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

