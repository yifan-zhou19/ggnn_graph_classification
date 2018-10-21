package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int e;
		int i;
	int d = 0;

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
	if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
	{
		int[] score = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	for (i = 0;i < b - 1;i++)
	{
		d = d + score[i];
	}
	e = d + c;
	}
		else
		{
			int[] score = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	for (i = 0;i < b - 1;i++)
	{
		d = d + score[i];
	}
	e = d + c;
		}
		System.out.printf("%d\n",e);
	}
}

