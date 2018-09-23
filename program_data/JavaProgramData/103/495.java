import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String p;
		String q;
		String b = new String(new char[100]);
		int lenth;
		int i = 0;
		int j;
		int[] count = new int[100];
		for (i = 0; i < 100; i++)
		{
			count[i] = 1;
		}
		i = 0;
		a = new Scanner(System.in).nextLine();
		lenth = a.length();
		for (p = a; p <= lenth + a; p++)
		{
			for (q = p.Substring(1); q == p || Math.abs(p - q) == 32 ; q++)
			{
					b = tangible.StringFunctions.changeCharacter(b, i, p);
					count[i]++;
			}
			if (count[i] != 1)
			{
				p = q - 1;
				i++;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, p);
				i++;
			}
		}
		for (j = 0; j < i; j++)
		{
			if (b.charAt(j) >= 'a' && b.charAt(j) <= 'z')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) - 32);
			}
		}
		for (j = 0; j < i - 1; j++)
		{
			System.out.print("(");
			System.out.print(b.charAt(j));
			System.out.print(",");
			System.out.print(count[j]);
			System.out.print(")");
		}
		return 0;
	}

}

