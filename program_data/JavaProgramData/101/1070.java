package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	for (a = 0;a < 3;a++)
	{
	for (b = 0;b < 3;b++)
	{
	for (c = 0;c < 3;c++)
	{
		if ((a + b + c == 3) && ((b > a) + (c == a) + a == 2) && ((a > b) + (a > c) + b == 2) && ((c > b) + (b > a) + c == 2))
		{
	for (i = 0;i < 3;i++)
	{
		if (a == i)
		{
			System.out.print("A");
		}
	else
	{
	if (b == i)
	{
		System.out.print("B");
	}
	else
	{
	if (c == i)
	{
		System.out.print("C");
	}
	else
	{
		;
	}
	}
	}
	}
		}
	}
	}
	}
	return 0;
	}
}
