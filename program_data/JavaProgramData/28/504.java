package <missing>;

public class GlobalMembers
{
	public static int read(String x)
	{
		int i;
		int len;
		int num = 0;
		len = x.length();
		for (i = len - 1;i >= 0;i--)
		{
			if (!x[i].equals(' '))
			{
				num++;
			}
			else
			{
				break;
			}
		}
		x[i] = '\0';
		return (num);
	}
	public static void move(String x)
	{
		int len;
		int i;
		len = x.length();
		for (i = len;i >= 1;i--)
		{
			x[i] = x[i - 1];
		}
		x[len + 1] = '\0';
		x[0] = ' ';
	}
	public static int count(String x)
	{
		int len;
		int i;
		int p = 0;
		int m = 0;
		len = x.length();
		for (i = 0;i < len - 1;i++)
		{
			if (x[i].equals(' '))
			{
				p = 0;
			}
			else if (p == 0)
			{
					p = 1;
					m++;
			}
		}
		return (m);
	}
	public static void cut(String x)
	{
		int len;
		len = x.length();
		while (x[len - 1].equals(' '))
		{
			x[len - 1] = '\0';
			len--;
		}
	}

	public static int Main()
	{
		String w = new String(new char[3000]);
		int[] word = new int[300];
		int i;
		int j;
		int n;
		w = new Scanner(System.in).nextLine();
		move(w);
		n = count(w);
		for (i = n - 1;i >= 0;i--)
		{
			word[i] = read(w);
			cut(w);
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%d",word[j]);
			if (j < n - 1)
			{
				System.out.print(",");
			}
		}
	}
}
