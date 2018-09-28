package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int b;
		int sum = 0;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
			{
				sum++;
			}
			else
			{
				sum = 0;
			}
			if (sum >= x)
			{
				x = sum;
			}
		}
		System.out.printf("%d",x);
	}
}

