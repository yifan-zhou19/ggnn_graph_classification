package <missing>;

public class GlobalMembers
{
	public static int f(String a, int n)
	{
		int i;
		if (a[n - 1].equals('r') && a[n - 2].equals('e'))
		{
			for (i = 0;i < n - 2;i++)
			{
				System.out.printf("%c",a[i]);
			}
		}
		if (a[n - 1].equals('y') && a[n - 2].equals('l'))
		{
			for (i = 0;i < n - 2;i++)
			{
				System.out.printf("%c",a[i]);
			}
		}
		if (a[n - 3].equals('i') && a[n - 2].equals('n') && a[n - 1].equals('g'))
		{
			for (i = 0;i < n - 3;i++)
			{
				System.out.printf("%c",a[i]);
			}
		}
		System.out.print("\n");
		return (0);
	}
	public static void Main()
	{
		int n;
		int y;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[20]);
		for (i = 0;i < n;i++)
		{

			s = new Scanner(System.in).nextLine();
			x = s.length();
			y = f(s, x);
		}
	}


}

