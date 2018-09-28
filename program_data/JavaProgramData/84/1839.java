package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int max = 0;
		int sec;
		int[] number = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
			if (number[i] > max)
			{
				max = number[i];
			}
		}
			a = max;
			sec = max;
			for (i = 0;i < n;i++)
			{
				if ((a - number[i]) < sec && (a - number[i]>0))
				{
						sec = a - number[i];
				}
			}

			b = a - sec;
			System.out.printf("%d\n",a);
			System.out.printf("%d\n",b);
			return 0;
	}
}

