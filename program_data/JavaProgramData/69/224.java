package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		String c = new String(new char[255]);
		int i;
		int[] d = new int[255];
		int k = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 255;i++)
		{
			d[i] = 0;
		}
		if (a.length() > b.length())
		{
			c = a;
			a = b;
			b = c;
		}
		for (i = a.length() - 1;i >= 0;i--)
		{
			  d[a.length() - 1 - i] = ((int)(a.charAt(i) + b.charAt(i - a.length() + b.length()) - '0'-'0') + k) % 10;
			  k = ((int)(a.charAt(i) + b.charAt(i - a.length() + b.length()) - '0'-'0') + k) / 10;
		}
		for (i = b.length() - a.length() - 1;i >= 0;i--)
		{
			d[b.length() - 1 - i] = ((int)(b.charAt(i) - '0') + k) % 10;
			k = ((int)(b.charAt(i) - '0') + k) / 10;
		}
		d[b.length()] = k;
		k = 0;
		for (i = b.length();i >= 0;i--)
		{
			if (d[i] != 0)
			{
				break;
			}
			k++;
		}
		for (i = b.length() - k;i >= 0;i--)
		{
				System.out.printf("%d",d[i]);
		}
		if (k == (b.length() + 1))
		{
			System.out.print("0");
		}
		return 0;
	}

}
