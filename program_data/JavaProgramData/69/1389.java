import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q1;
		int q2;
		int t = 0;
		int i;
		int n;
		int l1;
		int l2;
		int l;
		int k;
		int max;
		int j;
		char temp;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String a_ = new String(new char[300]);
		String b_ = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		l1 = a.length();
		l2 = b.length();
		q1 = 0;
		for (i = 0; i < l1; i++)
		{
			if (a.charAt(i) == '0')
			{
				q1++;
			}
			else
			{
				break;
			}
		}
		l1 = l1 - q1;

		q2 = 0;
		for (i = 0; i < l2; i++)
		{
			if (b.charAt(i) == '0')
			{
				q2++;
			}
			else
			{
				break;
			}
		}
		l2 = l2 - q2;

		max = (l1 > l2)?l1:l2;
		l = max;

		j = 0;
		for (i = q1 + l1 - 1; i >= q1 ; i--)
		{
			a_ = tangible.StringFunctions.changeCharacter(a_, j++, a.charAt(i));
		}
		a_ = tangible.StringFunctions.changeCharacter(a_, j, '\0');

		j = 0;
		for (i = q2 + l2 - 1; i >= q2 ; i--)
		{
			b_ = tangible.StringFunctions.changeCharacter(b_, j++, b.charAt(i));
		}
		b_ = tangible.StringFunctions.changeCharacter(b_, j, '\0');

		if (l1 < max)
		{
			for (i = l1; i < max; i++)
			{
				a_ = tangible.StringFunctions.changeCharacter(a_, i, '0');
			}
		}
		if (l2 < max)
		{
			for (i = l2; i < max; i++)
			{
				b_ = tangible.StringFunctions.changeCharacter(b_, i, '0');
			}
		}

		for (i = 0; i < max; i++)
		{
			k = a_.charAt(i) - '0' + b_.charAt(i) - '0' + t;
			t = 0;
			if (k > 9)
			{
				k = k - 10;
				t = 1;
			}
			c = tangible.StringFunctions.changeCharacter(c, i, k + '0');
			if (i == max - 1 && t == 1)
			{
				l = max + 1;
				c = tangible.StringFunctions.changeCharacter(c, max, '1');
			}
		}
		for (i = l - 1; i >= 0; i--)
		{
			System.out.print(c.charAt(i));
		}

		if (l1 == 0 && l2 == 0)
		{
			System.out.print('0');
		}
		System.out.print('\n');




			return 0;

	}

}

