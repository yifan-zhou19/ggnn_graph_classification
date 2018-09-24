package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c = 0;
		int d = 0;
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
	if (a == b)
	{
		System.out.printf("%d",a);
	}
	else
	{
	for (;a != 0;)
	{
		c = (c<<1) | (a & 1),a >>= 1;
	}
	for (;b != 0;)
	{
		d = (d<<1) | (b & 1),b >>= 1;
	}
	a = c ^ d,c = 0;
	for (;(a & 1) == 0;)
	{
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
		c = (c<<1) | (d & 1),a >>= 1,d >>= 1;
	}
	System.out.printf("%d",c);
	}
	}
}

