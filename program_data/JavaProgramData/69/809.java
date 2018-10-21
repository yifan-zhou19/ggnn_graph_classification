package <missing>;

public class GlobalMembers
{
	//****************************
	//????????
	//???2013.12.21
	//****************************
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		int i = 0;
		int j = 0;
		int[] n = new int[260];
		int[] m = new int[260];
		int l = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = a.length() - 1;i >= 0;i--)
		{
			n[j++] = a.charAt(i) - '0';
		}
		j = 0;
		for (i = b.length() - 1;i >= 0;i--)
		{
			m[j++] = b.charAt(i) - '0';
		}
		if (a.length() > b.length())
		{
			l = a.length();
		}
		else
		{
			l = b.length();
		}
		for (i = 0;i < l;i++)
		{
			n[i] = n[i] + m[i];
			if (n[i] >= 10)
			{
				n[i + 1] = n[i + 1] + 1;
				n[i] = n[i] - 10;
			}
		}
		while (n[l] == 0)
		{
			l--;
		}
		if (l > 0)
		{
		for (i = l;i >= 0;i--)
		{
			System.out.print(n[i]);
		}
		}
		else
		{
			System.out.print("0");
		}
		System.out.print("\n");
		return 0;
	}
}
