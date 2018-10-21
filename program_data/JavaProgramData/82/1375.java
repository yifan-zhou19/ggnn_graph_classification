package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int s = 0;
		int b1;
		int b2;
		int i;
		int n;
		int t;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b2 = Integer.parseInt(tempVar3);
			}
			if (b1 >= 90 && b1 <= 140 && b2 >= 60 && b2 <= 90)
			{
				s++;
				if (s > max)
				{
					max = s;
				}
			}
			else
			{
				s = 0;
			}

		}
			System.out.printf("%d",max);

		return 0;
	}
}

