package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static int i;
	public static int j;
	public static int temp;
	public static void get()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, tempVar4);
		}
		}
	}
	public static void order()
	{
		for (i = m - 1;i >= 0;i--)
		{
		for (j = 0;j < i;j++)
		{
		if (a.charAt(j) > a.charAt(j + 1))
		{
			temp = a.charAt(j);
			a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
			a = tangible.StringFunctions.changeCharacter(a, j + 1, temp);
		}
		}
		}
		for (i = n - 1;i >= 0;i--)
		{
		for (j = 0;j < i;j++)
		{
		if (b.charAt(j) > b.charAt(j + 1))
		{
			temp = b.charAt(j);
			b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
			b = tangible.StringFunctions.changeCharacter(b, j + 1, temp);
		}
		}
		}
	}
	public static void com()
	{
		for (i = 0;i < n;i++)
		{
		a = tangible.StringFunctions.changeCharacter(a, m + i, b.charAt(i));
		}
	}
	public static void print()
	{
		System.out.printf("%d",a.charAt(0));
		for (i = 1;i < n + m;i++)
		{
		System.out.printf(" %d",a.charAt(i));
		}
	}
	public static int Main()
	{
		get();
		order();
		com();
		print();
	}
}

