package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[202];
	public static int[] aa = new int[200];
	public static int[] bb = new int[200];
	public static int Main()
	{
		int add = new int(char * a,char * b);
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int cclen;
		int j;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		cclen = add(tempRef_a, tempRef_b);
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
		for (j = cclen;j >= 0;j--)
		{
		  System.out.printf("%d",c[j]);
		}
	}
	public static int add(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int i;
		int k;
		int len;
		int alen = a.argValue.length();
		int blen = b.argValue.length();
		len = (alen > blen)? alen:blen;
		k = 0;
		for (i = alen - 1;i >= 0;i--)
		{
			aa[k] = a.argValue.charAt(i) - '0';
			k++;
		}
		k = 0;
		for (i = blen - 1;i >= 0;i--)
		{
			bb[k] = b.argValue.charAt(i) - '0';
			k++;
		}
		c[0] = 0;
		for (i = 0;i < len;i++)
		{
			if (i < alen)
			{
				c[i] += aa[i];
			}
			if (i < blen)
			{
				c[i] += bb[i];
			}
		}
		for (i = 0;i < len;i++)
		{
			c[i + 1] += c[i] / 10;
			c[i] = c[i] % 10;
		}
		k = len;
		for (i = len;i > 0;i--)
		{
		   if (c[i] == 0)
		   {
		   k--;
		   }
		   else
		   {
		   break;
		   }
		}
		return k;
	}








}

