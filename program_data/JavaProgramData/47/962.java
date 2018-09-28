package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] number = new int[NUMBER];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int a;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			number[i] = a;
			i++;
		}
		while ((n - 1) >= 0)
		{
			if ((n - 1) > 0)
			{
				System.out.printf("%d ", number[n - 1]);
			n--;
			}
			else
			{
				System.out.printf("%d", number[0]);
				n--;
			}
		}
		return 0;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			1 = Integer.parseInt(tempVar3);
		}
	}
}

