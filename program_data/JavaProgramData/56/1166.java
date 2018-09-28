package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	c = a % 10000;
	b = a / 10000;
	s = s + b;


	b = c / 1000;
	c = c % 1000;


	s = s + b * 10;

	b = c / 100;
	c = c % 100;
	s = s + b * 100;

	b = c / 10;
	c = c % 10;

	s = s + b * 1000;

	s = s + c * 10000;

	for (c = 0;c < 4;c++)
	{
		if (s % 10 == 0)
		{
			s = s / 10;
		}
	}
	System.out.printf("%d",s);
	return 0;
	}

}

