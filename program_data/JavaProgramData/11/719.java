package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
	{

		for (int i = 1;i < b;i++)
		{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
			t += 31;
		}
		else if (i == 4 || i == 6 || i == 9 || i == 11)
		{
			t += 30;
		}
		else
		{
			t += 29;
		}
		}
	}
	else
	{
		for (int j = 1;j < b;j++)
		{
		if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
		{
			t += 31;
		}
		else if (j == 4 || j == 6 || j == 9 || j == 11)
		{
			t += 30;
		}
		else
		{
			t += 28;
		}
		}
	}
	t = t + c;

	System.out.printf("%d",t);
		return 0;
	}

}

