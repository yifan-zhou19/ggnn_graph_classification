package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] SBP = new int[100];
		int[] DBP = new int[100];
		int[] c = new int[100];
		int temp = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				SBP[i] = Integer.parseInt(tempVar2);
			}

			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				DBP[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if ((90 <= SBP[i] != 0 && SBP[i] <= 140) && (60 <= DBP[i] != 0 && DBP[i] <= 90))
			{
				c[i] = 1;
			}
			else
			{
				c[i] = 0;
			}
		}


		for (i = 0;i <= (n - 1);i++)
		{
			if (c[i] == 1)
			{
				temp++;
			}
			if (c[i] == 0)
			{
				temp = 0;
			}

			max = (temp > max)?temp:max;
		}

		System.out.printf("%d",max);
		return 0;

	}
}

