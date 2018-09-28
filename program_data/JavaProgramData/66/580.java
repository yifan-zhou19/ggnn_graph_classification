package <missing>;

public class GlobalMembers
{
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
	int temp = 0;
	temp = ((a - 1) * (365 % 7) + (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400) % 7;
	if (b == 1)
	{
		temp = temp + 0;
	}
	if (b == 2)
	{
		temp = temp + 3;
	}
	if (b == 3)
	{
		temp = temp + 3;
	}
	if (b == 4)
	{
		temp = temp + 6;
	}
	if (b == 5)
	{
		temp = temp + 1;
	}
	if (b == 6)
	{
		temp = temp + 4;
	}
	if (b == 7)
	{
		temp = temp + 6;
	}
	if (b == 8)
	{
		temp = temp + 2;
	}
	if (b == 9)
	{
		temp = temp + 5;
	}
	if (b == 10)
	{
		temp = temp + 0;
	}
	if (b == 11)
	{
		temp = temp + 3;
	}
	if (b == 12)
	{
		temp = temp + 5;
	}

	if (((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) && (b > 2))
	{
	temp++;
	}
	temp = (temp + c - 1) % 7;
	if (temp == 0)
	{
		System.out.print("Mon.");
	}
	if (temp == 1)
	{
		System.out.print("Tue.");
	}
	if (temp == 2)
	{
		System.out.print("Wed.");
	}
	if (temp == 3)
	{
		System.out.print("Thu.");
	}
	if (temp == 4)
	{
		System.out.print("Fri.");
	}
	if (temp == 5)
	{
		System.out.print("Sat.");
	}
	if (temp == 6)
	{
		System.out.print("Sun.");
	}
	}

}

