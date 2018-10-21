import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]); //????a[i],b[i]
		String b = new String(new char[80]);
		int i; //????????
		a = new Scanner(System.in).nextLine(); //?????
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 80;i++)
		{
			if (a.charAt(i) >= 97)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i <= 80;i++)
		{
			if (b.charAt(i) >= 97)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		for (i = 0;i < 80;i++) //????
		{
			if (a.charAt(i) == '\0') //??????????????
			{
				System.out.print("=");
				System.out.print("\n");
				break; //???????
			}
			else if (a.charAt(i) == b.charAt(i)) //????
			{
				continue; //??
			}
			else if (a.charAt(i) > b.charAt(i)) //????
			{
				System.out.print(">");
				System.out.print("\n");
				break; //???????
			}
			else if (a.charAt(i) < b.charAt(i)) //????
			{
				System.out.print("<");
				System.out.print("\n");
				break; //???????
			}
		}
		return 0;
	}
}

