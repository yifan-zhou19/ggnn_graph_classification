package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int[] b = new int[8];
		int c = 0;
		int d = 0;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= 7;i = i + 2)
		{
			if (a % i == 0)
			{
				b[i] = i;
				c++;
			}
		}
		for (i = 3;i <= 7;i = i + 2)
		{
			s = s + b[i];
		}
		if (s == 0)
		{
		System.out.print("n");
		}
			else
			{
		for (i = 3;i <= 7;i = i + 2)
		{
	if (b[i] != 0)
	{
				System.out.printf("%ld",b[i]);
			d++;
			if (d < c)
			{
				System.out.print(" ");
			}
	}
		}
			}
	}
}

