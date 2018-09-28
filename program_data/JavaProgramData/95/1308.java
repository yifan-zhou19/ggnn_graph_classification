package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int lena = a.length();
		int lenb = b.length();
		int f = 1;
		for (int i = 0;i < lena;i++)
		{
			if (a.charAt(i) >= 'a')
			{
				a.charAt(i) -= 32;
			}
			if (b.charAt(i) >= 'a')
			{
				b.charAt(i) -= 32;
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				f = 0;
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print('<');
				f = 0;
				break;
			}
		}
		if (f != 0 && lena == lenb)
		{
			System.out.print('=');
		}
		else if (f != 0 && lena > lenb)
		{
			System.out.print('>');
		}
		else if (f != 0 && lena < lenb)
		{
			System.out.print('<');
		}
	}

}
