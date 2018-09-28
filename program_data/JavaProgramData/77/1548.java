package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[110]);
	public static int l;
	public static void vv(String a, char b, char g)
	{
		int i;
		int flag = 0;
		l = a.length();
		for (i = 0; i < l; i++)
		{
			if (!a[i].equals('*'))
			{
			flag = 1;
			}
		}
		if (flag == 0)
		{
			return;
		}
		else
		{
		for (i = 0; i < l; i++)
		{
			if (a[i].equals(g))
			{
				for (int j = i - 1; j >= 0; j--)
				{
				if (a[j].equals(b))
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					a[j] = '*';
					a[i] = '*';
					break;
				}
				}

			}
		}
		vv(a, b, g);
		}
	}
	public static int Main()
	{
		char b;
		char g;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		b = a.charAt(0);
		g = a.charAt(l - 1);
		vv(a, b, g);

		return 0;
	}

}

