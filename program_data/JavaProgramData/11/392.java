package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
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
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			int[] m = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int i;
			int k = 0;
			for (i = 0;i < (b - 1);i++)
			{
			  k = k + m[i];
			}
		k = k + c;
		System.out.printf("%d",k);
		}
		else
		{
			int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int i;
			int k = 0;
			for (i = 0;i < (b - 1);i++)
			{
			  k = k + m[i];
			}
			k = k + c;
			System.out.printf("%d",k);
		}
	}

}

