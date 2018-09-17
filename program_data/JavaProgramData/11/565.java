package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int[] f = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	int sum = 0;
	int i;
		for (i = 0;i < b - 1;i++)
		{
			sum = sum + f[i];
		}
	if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
	{

	if (b < 3)
	{
		d = sum + c;
	}
	else
	{
		d = sum + 1 + c;
	}
	}
	else
	{
		d = sum + c;
	}
	System.out.printf("%d",d);
	 return 0;
	}


}

