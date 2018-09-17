package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		if (a % 4 == 0 && a % 100 != 0 || a % 100 == 0 && a % 400 == 0)
		{
			m[1] = 29;
		}
		else
		{
			m[1] = 28;
		}
		if (b == 1)
		{
			n = c;
		}
		else
		{
			for (i = 0;i < b - 1;i++)
			{
				n = n + m[i];
			}
			n = n + c;
		}
		System.out.printf("%d\n",n);
		return 0;
	}
}

