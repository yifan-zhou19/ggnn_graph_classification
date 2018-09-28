package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j = 0;
		int[] zs = new int[100];
		int t = 0;
		for (i = 0;i < 100;i++)
		{
			zs[i] = 0;
		}
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (90 <= a != 0 && a <= 140 && 60 <= b != 0 && b <= 90)
			{
				t++;
			}
			else
			{
				zs[j] = t;
				j++;
				t = 0;
			}
		}
		j = j + 1;
		zs[j + 1] = t;
		int max = 0;
		for (i = 0;i < 100;i++)
		{

			if (zs[i] > max)
			{
				max = zs[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

