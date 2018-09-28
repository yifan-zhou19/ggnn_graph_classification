package <missing>;

public class GlobalMembers
{
	public static int[] xa = new int[300];
	public static int[] xb = new int[300];
	public static int[] xx = new int[300];
	public static String a = new String(new char[300]);
	public static String b = new String(new char[300]);
	public static int Main()
	{
		int lena;
		int lenb;
		int len;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		lena = 0;
			for (i = 0;i <= 250;i++)
			{
			xa[i] = 0;
			xb[i] = 0;
			xx[i] = 0;
			}
		while (a.charAt(lena) != '\0')
		{
			xa[lena] = a.charAt(lena) - '0';
			lena++;
		}
		lenb = 0;
		while (b.charAt(lenb) != '\0')
		{
			xb[lenb] = b.charAt(lenb) - '0';
			lenb++;
		}
		for (i = 0;i < lena / 2;i++)
		{
			int temp = xa[i];
			xa[i] = xa[lena - i - 1];
			xa[lena - i - 1] = temp;
		}
		for (i = 0;i < lenb / 2;i++)
		{
			int temp = xb[i];
			xb[i] = xb[lenb - i - 1];
			xb[lenb - i - 1] = temp;
		}
		if (lena > lenb)
		{
			len = lena;
		}
		else
		{
			len = lenb;
		}
		int x = 0;
		for (i = 0;i < len;i++)
		{
			x = x + xa[i] + xb[i];
			xx[i] = x % 10;
			x = x / 10;
		}
		xx[len] = x;
		while (xx[len] == 0 && len > 0)
		{
			len--;
		}
		for (i = len;i >= 0;i--)
		{
			System.out.printf("%d",xx[i]);
		}
		System.out.print("\n");
		return 0;
	}

}
