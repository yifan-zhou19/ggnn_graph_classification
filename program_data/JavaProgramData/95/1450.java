import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????????
	public static int Main()
	{
		String a = new String(new char[80]); //???????
		String b = new String(new char[80]);
		int i = 0;
		int j = 0;
		int lena = 0;
		int lenb = 0;
		int min = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
		}
		lena = a.length();
		lenb = b.length();
		if (lena < lenb)
		{
			min = lena;
		}
		if (lena >= lenb)
		{
			min = lenb;
		}
		for (i = 0;i < min;i++)
		{
				j = j + 1;
				if (a.charAt(i) == b.charAt(i))
				{
					continue;
				}
				if (a.charAt(i) > b.charAt(i))
				{
					System.out.print(">");
					System.out.print("\n");
					break;
				}
				if (a.charAt(i) < b.charAt(i))
				{
					System.out.print("<");
					System.out.print("\n");
					break;
				}
		}
			if (j == i)
			{
				if (lena > lenb)
				{
					System.out.print(">");
					System.out.print("\n");
				}
				if (lena < lenb)
				{
					System.out.print("<");
					System.out.print("\n");
				}
				if (lena == lenb)
				{
					System.out.print("=");
					System.out.print("\n");
				}
			}


		return 0;
	}





}

