package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int s = 0;
		int[] sb = new int[120];
		for (int k = 0;k <= 120;k++)
		{
		sb[k] = 0;
		}
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

			if (a <= 140 && a >= 90 && b >= 60 && b <= 90)
			{
				s++;
				sb[i] = s;

			}

			else
			{
				s = 0;
			}
		}
		for (int j = 0;j < 120;j++)
		{
			if (sb[j + 1] < sb[j])
			{
				sb[j + 1] = sb[j];
			}
		}
		System.out.printf("%d",sb[119]);





	return 0;
	}



}

