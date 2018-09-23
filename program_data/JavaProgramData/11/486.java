package <missing>;

public class GlobalMembers
{
	public static int rui(int x)
	{
		if (x % 4 != 0)
		{
			return (0);
		}
		else if (x % 100 == 0 && x % 400 != 0)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static void Main()
	{
		int[] r = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int a;
		int b;
		int c;
		int i;
		int n = 0;
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
		for (i = 0;i < b - 1;i++)
		{
			n = n + r[i];
		}
		n = n + c;
		if (rui(a) == 1 && b > 2)
		{
			n++;
		}
		System.out.printf("%d\n",n);
	}
}

