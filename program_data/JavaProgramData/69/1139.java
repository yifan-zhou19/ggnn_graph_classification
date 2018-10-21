import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int length(tangible.RefObject<String> v)
	{
		int x;
		for (int i = 1;v.argValue.charAt(i - 1) >= '0' && v.argValue.charAt(i - 1) <= '9';i++)
		{
			x = i;
		}
		return x;
	}
	public static void diandao(tangible.RefObject<String> v, int i)
	{
		for (int j = 0;j < i / 2;j++)
		{
			swap(v.argValue.charAt(j),v.argValue.charAt(i - j - 1));
		}
	}
	public static int Main()
	{
		int x = 0;
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
		diandao(tempRef_a2, length(tempRef_a));
		a = tempRef_a2.argValue;
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_b2 = new tangible.RefObject<String>(b);
		diandao(tempRef_b2, length(tempRef_b));
		b = tempRef_b2.argValue;
		b = tempRef_b.argValue;
	tangible.RefObject<String> tempRef_a3 = new tangible.RefObject<String>(a);
		x = length(tempRef_a3);
		a = tempRef_a3.argValue;
	tangible.RefObject<String> tempRef_b3 = new tangible.RefObject<String>(b);
		if (x < length(tempRef_b3))
		{
			b = tempRef_b3.argValue;
		tangible.RefObject<String> tempRef_b4 = new tangible.RefObject<String>(b);
			x = length(tempRef_b4);
			b = tempRef_b4.argValue;
		}
		else
		{
			b = tempRef_b3.argValue;
		}
		for (int i = 0;i < x;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		for (int i = 0;i < x;i++)
		{
			if (a.charAt(i) < '0' || a.charAt(i)>'9')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
			}
			if (b.charAt(i) < '0' || b.charAt(i)>'9')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '0');
			}
			if (a.charAt(i) - '0' + b.charAt(i) - '0' + c.charAt(i) - '0' <= 9)
			{
				c.charAt(i) += -'0' + a.charAt(i) - '0' + b.charAt(i);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0' + a.charAt(i) - '0' + b.charAt(i) - 10);
				c = tangible.StringFunctions.changeCharacter(c, i + 1, '1');
			}
		}
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
	tangible.RefObject<String> tempRef_c2 = new tangible.RefObject<String>(c);
		diandao(tempRef_c2, length(tempRef_c));
		c = tempRef_c2.argValue;
		c = tempRef_c.argValue;
		int k = 0;
	tangible.RefObject<String> tempRef_c3 = new tangible.RefObject<String>(c);
		for (int i = 0;i < length(tempRef_c3);i++)
		{
			c = tempRef_c3.argValue;
			if (c.charAt(i) != '0')
			{
				k = i;
				break;
			}
		}
		c = tempRef_c3.argValue;
	tangible.RefObject<String> tempRef_c4 = new tangible.RefObject<String>(c);
		for (int i = k;i < length(tempRef_c4);i++)
		{
			c = tempRef_c4.argValue;
			System.out.print(c.charAt(i));
		}
		c = tempRef_c4.argValue;
		return 0;
	}
}

