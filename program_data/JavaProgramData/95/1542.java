import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		int i;
		int m;
		int n;
		int t;
		int k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		n = b.length();
		if (n < m)
		{ //?m?n???????m
			t = m;
			m = n;
			n = t;
		}
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90) //?a??????????????????a???A~Z????????????
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90) //?????b??????
			{
				b.charAt(i) += 32;
			}
		}
		k = strcmp(a,b);
		if (k == 1)
		{
			System.out.print(">");
		}
		else if (k == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}



}

