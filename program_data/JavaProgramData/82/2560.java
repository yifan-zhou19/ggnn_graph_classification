package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int max = 0;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
			{
				k++;
			}
			else
			{
				k = 0;
			}

			if (max < k)
			{
				max = k;
			}

		   n--;
		}
		System.out.printf("%d",max);

	   return 0;
	}

}

