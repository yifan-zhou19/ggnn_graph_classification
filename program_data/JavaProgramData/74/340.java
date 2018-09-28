package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static f1(int x)
	{
	int a;
	int b;
	int[] p = new int[100];
	for (a = 0;x != 0;a++)
	{
		p[a] = x % 10;
	x = x / 10;
	}
	a--;
	for (b = 0;b <= a;b++)
	{
		if (p[b] != p[a])
		{
			break;
		}
	else
	{
		a--;
	}
	}
	if (b < a)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	}
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static f2(int x)
	{
		int a;
		int b;
		for (a = 2;a <= x;a++)
		{
			b = x % a;
		if (b == 0)
		{
			break;
		}
		}
		if (a == x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	c = 0;
	for (;a <= b;a++)
	{
	if (f1(a) == 1 && f2(a) == 1 && c == 1)
	{
	System.out.printf(",%d",a);
	}
	else if (f1(a) == 1 && f2(a) == 1)
	{
		System.out.printf("%d",a);
	c = 1;
	}
	}
	if (c == 0)
	{
		System.out.print("no");
	}
	}



}

