package <missing>;

public class GlobalMembers
{
	public static int leap(int a)
	{
		int z;
		if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
	return (z);
	}
	public static void Main()
	{
		int a0;
		int a;
		int s;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a0 = Integer.parseInt(tempVar);
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
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		a = a0 % 400;
		if (a == 0)
		{
			a = 400;
		}
		month[1] = 28 + leap(a);
		s = 0;
		for (i = 1;i <= a - 1;i++)
		{
			s = s + 365 + leap(i);
		}
		for (i = 1;i <= b - 1;i++)
		{
			s = s + month[i - 1];
		}
		s = s + c;
		switch (s % 7)
		{
		case 0:
			System.out.print("Sun.");
			break;
		case 1:
			System.out.print("Mon.");
			break;
		case 2:
			System.out.print("Tue.");
			break;
		case 3:
			System.out.print("Wed.");
			break;
		case 4:
			System.out.print("Thu.");
			break;
		case 5:
			System.out.print("Fri.");
			break;
		case 6:
			System.out.print("Sat.");
			break;
		}
	}

}

