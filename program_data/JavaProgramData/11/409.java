package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;

		int t = 0;
		int[] aa = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		for (int i = 0;i < b - 1;i++)
		{
			t = t + aa[i];
		}
		if (b > 2)
		{
			if ((a % 4 == 0) && ((a % 100) != 0) || (a % 400 == 0))
			{
				t = t + 29;
			}
			else
			{
				t = t + 28;
			}
		}
		t = t + c;
		System.out.printf("%d",t);

	}

}

