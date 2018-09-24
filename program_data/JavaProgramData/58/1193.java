package <missing>;

public class GlobalMembers
{
	public static int start(char a)
	{
		int m;
		if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z') || a == '_')
		{
		m = 1;
		}
		else
		{
		m = 0;
		}
		return m;
	}
	public static int sym(char b)
	{
		int n;
		if ((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z') || (b >= '0' && b <= '9') || b == '_')
		{
		n = 1;
		}
		else
		{
		n = 0;
		}
		return n;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int result;
		int len;
		char[][] c = new char[100][81];
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		n = Integer.parseInt(a);
		for (i = 0;i < n;i++)
		{
		*(c + i) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
		len = String.valueOf(*(c + i)).length();
		result = 1;
		if (start(*(c[i] + 0)) == 0)
		{
			System.out.print("0\n");
		}
		if (start(*(c[i] + 0)) == 1)
		{
			for (j = 0;j < len;j++)
			{
			result *= sym(*(c[i] + j));
			}
			if (result == 1)
			{
			System.out.print("1\n");
			}
			else
			{
			System.out.print("0\n");
			}
		}
		}
		return 0;
	}

}
