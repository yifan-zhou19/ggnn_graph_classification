import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]); //???????
		String b = new String(new char[81]);
		int i; //??i?m
		int m;
		a = new Scanner(System.in).nextLine(); //?????
		b = new Scanner(System.in).nextLine();
		i = 0;
		while (a.charAt(i) != '\0') //????????????
		{
				if ('A' <= a.charAt(i) && a.charAt(i) <= 'Z')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
				}
				i++;
		}
		i = 0;
		while (b.charAt(i) != '\0')
		{
				if ('A' <= b.charAt(i) && b.charAt(i) <= 'Z')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
				}
				i++;
		}
		m = strcmp(a,b); //???
		switch (m) //????
		{
		case 0:
			System.out.print("=");
			System.out.print("\n");
			break;
		case 1:
			System.out.print(">");
			System.out.print("\n");
			break;
		case -1:
			System.out.print("<");
			System.out.print("\n");
			break;
		default:
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;
	}
}

