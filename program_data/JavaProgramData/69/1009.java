import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int strReverse(tangible.RefObject<String> str)
	{
		int len = str.argValue.length();
		for (int i = 0; i < len / 2; i++)
		{
			char temp = str.argValue.charAt(i);
			str.argValue.charAt(i) = str.argValue.charAt(len - i - 1);
			str.argValue.charAt(len - i - 1) = temp;
		}
		return len;
	}

	public static int addBig(tangible.RefObject<String> l, int lLen, tangible.RefObject<String> s, int sLen, int[] c)
	{
		for (int i = 0; i < lLen; i++)
		{
			if (i < sLen)
			{
				c[i] = c[i] + l.argValue.charAt(i) - '0' + s.argValue.charAt(i) - '0';
				c[i + 1] = c[i] / 10;
				c[i] %= 10;
			}
			else
			{
				c[i] = c[i] + l.argValue.charAt(i) - '0';
				c[i + 1] = c[i] / 10;
				c[i] %= 10;
			}
		}
		return c[lLen] ? (lLen + 1) : lLen;
	}

	public static void printBig(int[] a, int len)
	{
		int k = len - 1;
		while (a[k] == 0 && k > 0)
		{
			k--;
		}
		for (int i = k; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		String a = new String(new char[MAX]);
		String b = new String(new char[MAX]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int aLen;
		int bLen;
		int cLen;
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		aLen = strReverse(tempRef_a);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		bLen = strReverse(tempRef_b);
		b = tempRef_b.argValue;
		int[] c = {0};
	tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b2 = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_b3 = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_a3 = new tangible.RefObject<String>(a);
		cLen = (aLen > bLen) ? addBig(tempRef_a2, aLen, tempRef_b2, bLen, c):addBig(tempRef_b3, bLen, tempRef_a3, aLen, c);
		a = tempRef_a3.argValue;
		b = tempRef_b3.argValue;
		b = tempRef_b2.argValue;
		a = tempRef_a2.argValue;
		printBig(c, cLen);
		return 0;
	}

}

