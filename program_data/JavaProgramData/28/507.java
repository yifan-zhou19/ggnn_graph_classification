package <missing>;

public class GlobalMembers
{
	public static int len;
	public static int checkbegin(String a, int i)
	{
		int j;
		for (j = i;j < len;++j)
		{
			if (!a[j].equals(' '))
			{
				return (j);
			}
		}
	}
	public static int checkend(String a, int i)
	{
		int j;
		for (j = i + 1;j <= len;++j)
		{
			if (a[j].equals(' ') || a[j].equals('\0'))
			{
				return (j);
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i = 0;
		int b;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		b = checkend(a, checkbegin(a, i)) - checkbegin(a, i);
		System.out.printf("%d",b);
		i = checkend(a, checkbegin(a, i)) + 1;
		while (i <= len)
		{
			b = checkend(a, checkbegin(a, i)) - checkbegin(a, i);
			System.out.printf(",%d",b);
			i = checkend(a, checkbegin(a, i)) + 1;
		}
	}
}
