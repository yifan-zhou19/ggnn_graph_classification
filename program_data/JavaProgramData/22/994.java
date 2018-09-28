package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[1000]; //????
	public static int Main()
	{
		int index = 0; //?????
		int sec_max; //??
		int max; //??
		char c; //????
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[index++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				break;
			}
		} //???????, ????
		if (index == 1)
		{
			System.out.print("No\n");
			return 0;
		}
		max = 0;
		sec_max = 0;
		for (int i = 0; i < index; ++i)
		{ //???????max??????max???sec_max??
			if (num[i] > max)
			{
				sec_max = max;
				max = num[i];
			} //???max??????
			else if (num[i] == max)
			{
				continue;
			} //????max,??????
			else
			{
				if (num[i] > sec_max)
				{
					sec_max = num[i];
				}
			}
		} //??????????????????
		if (sec_max == 0)
		{
			System.out.print("No");
			return 0;
		}
		if (max == sec_max)
		{
			System.out.printf("%d",max); //????????
		}
		else
		{
			System.out.printf("%d\n", sec_max);
		}
		return 0;
	}


}

