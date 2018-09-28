package <missing>;

public class GlobalMembers
{
	public static int lena;
	public static int lenb;
	public static int lenc;
	public static void minus(String a, String b, String c)
	{
		int carry = 0;
		int i;
		for (i = lena - 1;i >= 0;i--)
		{
			if (a[i] - b[i] - carry < 0 != null)
			{
				c[i] = a[i].Substring(10) - b[i] + '0' - carry;
			carry = 1;
			}
		else if (a[i] - b[i] - carry >= 0)
		{
				c[i] = a[i] - b[i] + '0' - carry;
			carry = 0;
		}
		}
		c[lena] = '\0';
	}
	public static void operate(String b)
	{
		int jump = lena - lenb;
		int i;
		b[lena] = '\0';
		for (i = lenb;i >= 0;--i)
		{
			b[i + jump] = b[i];
		}
		for (i = 0;i < jump;i++)
		{
			b[i] = '0';
		}
	}
	public static void Main()
	{
		char[][] a = new char[ARRAY][N];
		char[][] b = new char[ARRAY][N];
		String c = new String(new char[N]);
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = tempVar3.charAt(0);
		}
		System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			lena = String.valueOf(a[i]).length();
			lenb = String.valueOf(b[i]).length();
		operate(b[i]);
		minus(a[i], b[i], c);
		for (j = 0;j < lena;j++)
		{
			if (c.charAt(j) != '0')
			{
				break;
			}
		}
		for (;j < lena;j++)
		{
			System.out.printf("%c",c.charAt(j));
		}
		System.out.print("\n");
		}
	}
}

