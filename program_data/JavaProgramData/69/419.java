package <missing>;

public class GlobalMembers
{
	public static int birev(tangible.RefObject<String> s, int[] sr)
	{
		int i;
		int len = s.argValue.length();
		for (i = 0; s.argValue.charAt(i); i++)
		{
			sr[len - 1 - i] = s.argValue.charAt(i) - '0';
		}
		return len;
	}
	public static int bisum(int[] ar, int alen, int[] br, int blen, int[] sum)
	{
		int len = (alen > blen)?alen:blen;
		int i;
		int temp = 0;
		for (i = 0; i < len; i++)
		{
			sum[i] = (ar[i] + br[i] + temp) % 10;
			temp = (ar[i] + br[i] + temp) / 10;
		}
		if (temp != 0)
		{
			sum[i] = 1;
			len++;
		}
		return len;
	}
	public static void biprt(int[] sum, int sumlen)
	{
		while (sum[sumlen - 1] == 0 && sumlen > 1)
		{
			sumlen--;
		}
		while (sumlen != 0)
		{
			System.out.printf("%d", sum[sumlen - 1]);
			sumlen--;
		}
	}
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] ar = new int[300];
		int[] br = new int[300];
		int[] sum = new int[300];
		int alen;
		int blen;
		int sumlen;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		alen = birev(tempRef_a, ar);
		a = tempRef_a.argValue;
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		blen = birev(tempRef_b, br);
		b = tempRef_b.argValue;
		sumlen = bisum(ar, alen, br, blen, sum);
		biprt(sum, sumlen);
		return 0;
	}

}

