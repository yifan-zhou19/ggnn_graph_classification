package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		b = 0;
		a = 0;
		int[] zzd = new int[101];
		int[] hzy = new int[101];
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
				zzd[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				hzy[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zzd[i] >= 90 && zzd[i] <= 140 && hzy[i] >= 60 && hzy[i] <= 90)
			{
				   a++;
			}
			else
			{
				if (a > b)
				{
					b = a;
				}
				a = 0;
			}
		}
		if (b > a)
		{
		System.out.printf("%d",b);
		}
		else if (b <= a)
		{
			System.out.printf("%d",a);
		}
		return 0;
	}

}

