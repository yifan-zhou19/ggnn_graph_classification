import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int change(tangible.RefObject<String> str, int[] a)
	{ //??????????
		int len = str.argValue.length(); //????????
		for (int i = 0;i < len;i++) //???????
		{
			a[len - i - 1] = str.argValue.charAt(i) - '0';
		}
		return len; //????
	}
	public static void printnum(tangible.RefObject<Integer> a, int len)
	{ //?????
		int k = len - 1; //k?????
		while (*(a.argValue + k) == 0 && k > 0)
		{ //???????????????????
			k--;
		}
		for (int i = k;i >= 0;i--) //???????????
		{
			System.out.print((a.argValue + i));
		}
	}
	public static int jiafa(int[] a, int alen, int[] b, int blen, int[] c)
	{ //????
		int len = (alen > blen) ? alen : blen; //?a?b??????????len
		for (int i = 0;i < len;i++)
		{ //?????????
			c[i] = 0;
			if (i < alen)
			{
				c[i] += a[i];
			}
			if (i < blen)
			{
				c[i] += b[i];
			}
		}
		c[len] = 0;
		for (int i = 0;i < len;i++)
		{
			if (c[i] >= 10)
			{ //??
				c[i + 1] += c[i] / 10;
				c[i] = c[i] % 10;
			}
		}
		return c[len]? (len + 1):len; //??len+1???????????????len?????
	}

	public static int Main()
	{
		String n1 = new String(new char[251]);
		String n2 = new String(new char[251]);
		int[] a = new int[251];
		int[] b = new int[251];
		int[] c = new int[251];
		int alen;
		int blen;
		int clen;
		n1 = new Scanner(System.in).nextLine(); //?????
		n2 = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_n1 = new tangible.RefObject<String>(n1);
		alen = change(tempRef_n1, a);
		n1 = tempRef_n1.argValue;
	tangible.RefObject<String> tempRef_n2 = new tangible.RefObject<String>(n2);
		blen = change(tempRef_n2, b);
		n2 = tempRef_n2.argValue;
		//??
		clen = jiafa(a, alen, b, blen, c); //?????????
	tangible.RefObject<Integer> tempRef_c = new tangible.RefObject<Integer>(c);
		printnum(tempRef_c, clen); //????
		c = tempRef_c.argValue;
		return 0;
	}
}

