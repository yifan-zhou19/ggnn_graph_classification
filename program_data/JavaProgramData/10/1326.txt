package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num_lanjie = new int[25];
		int[] input = new int[25];
		for (int i = 0;i <= n - 1;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					input[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					input[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		//???????????num_lanjie????????????
		/*
		????????????????????????????????????????????????????????????????????????????
		*/
		num_lanjie[n - 1] = 1;
		for (int i = n - 2;i >= 0;i--)
		{
			int max = 0;
			for (int j = n - 1;j > i;j--)
			{
				if (input[i] >= input[j] != 0 && max < num_lanjie[j])
				{
					max = num_lanjie[j];
				}
			}
			num_lanjie[i] = max + 1;
		}
		//????num_lanjie????????
		int max = 0;
		for (int i = 0;i <= n - 1;i++)
		{
			max = max > num_lanjie[i] != 0?max:num_lanjie[i];
		}
		System.out.printf("%d",max);
		return 0;
	}
}

