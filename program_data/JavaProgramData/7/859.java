package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String e = new String(new char[1]);
		char tmp;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		l = a.length();
		m = b.length();
		i = 0;
		while (i < l)
		{
			e = String.format("%c", a.charAt(i));
			d = e;
			for (k = 1;k < m;k++)
			{
				e = String.format("%c", a.charAt(i + k));
				d += e;
			}
			k = strcmp(d,b);
			if (k == 0)
			{
				System.out.printf("%s",c);
				i = i + m;
				break;
			}
			else
			{
			System.out.printf("%c",a.charAt(i));
			i++;
			}
		}
		while (i < l)
		{
			System.out.printf("%c",a.charAt(i));
			i++;
		}
		return 0;
	}
}
