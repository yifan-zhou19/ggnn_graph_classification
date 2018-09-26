package <missing>;

public class GlobalMembers
{
	public static void change(String x, int n)
	{
		int i;
		int j;
		char tem;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			if (x[i].compareTo(x[j]) > 0)
			{
				tem = x[j];
				x[j] = x[i];
				x[i] = tem;
			}
			}
		}
	}
	public static void Main()
	{
		int len;
		int n;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		if (len % 2 == 0)
		{
			System.out.print("NO");
		}
		else
		{
		n = (len - 1) / 2;
		for (i = 0;i < n;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i));
			c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i + n + 1));
		}
		change(b, n);
		change(c, n);
		for (i = 0;b.charAt(i) == c.charAt(i) && i < n;)
		{
			i++;
		}
		if (i == n)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
	}

}

