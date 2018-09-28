package <missing>;

public class GlobalMembers
{
	public static int p(int a)
	{
		int i = 1;
		while (a > 0)
		{
			i *= 10;
			a--;
		}
		return i;
	}
	public static int t(int a, int i)
	{
		int n = Math.log10(a);
		return (a % p(i)) / p(i - 1);
	}
	public static int huiwen(int a)
	{
		int n = Math.log10(a); //n+1??
		int i;
		for (i = 1;i <= (n + 1) / 2 + 1;i++)
		{
			if (t(a, i) != t(a, n + 2 - i))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int sushu(int a)
	{
		int i;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}


	public static void Main()
	{
		int max;
		int min;
		int i;
		int index = 0;
		int tempa = p(2);
		int tempb = t(12345, 4);
		int temp = huiwen(101);
		int[] out = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (i = min;i <= max;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				out[index] = i;
				index++;
			}
		}
		if (index == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < index;i++)
			{
				if (i != index - 1)
				{
					System.out.printf("%d,",out[i]);
				}
				else
				{
					System.out.printf("%d",out[i]);
				}
			}
		}
	}


}

