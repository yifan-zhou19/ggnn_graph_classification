package <missing>;

public class GlobalMembers
{
	public static void func(String a, String b)
	{
		int p = 0;
		int i = 0;
		int j = 0;
		int lena = a.length();
		int lenb = b.length();
		for (i = lena - 1,j = lenb - 1;j >= 0;i--,j--)
		{
			if ((a[i] - b[j] - p) >= 0)
			{
					a[i] = '0' + a[i] - b[j] - p;
					p = 0;
			}
			else
			{
				   a[i] = '0' + a[i] - b[j] - p + 10;
				   p = 1;
			}
		}
		a[i] = a[i] - p;
		for (i = 0;i <= lena - 1;i++)
		{
			if (!a[i].equals(0))
			{
				break;
			}
		}
		for (j = i;j <= lena - 1;j++)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return;
	}


	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			String a = new String(new char[101]);
			String b = new String(new char[101]);
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			func(a, b);
		}
		return 0;
	}
}

