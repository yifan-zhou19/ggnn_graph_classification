package <missing>;

public class GlobalMembers
{
	/**
	* @file		?????.cpp
	* @author	??	1000012792
	* @date		2010.11.24
	*/

	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] num = new int[1000];
		int start;
		int end;
		int max = 0;
		int count;
		int i = 1;
		int j;
		//num?????i???????start�end???????????max????????

		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		start = x[0];

		while (System.in.read() == ',') //??x??????????????start
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x[i] < start)
			{
				start = x[i];
			}
			i++;
		}

		count = i; //count?????????

		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		end = y[0];

		i = 1;
		while (System.in.read() == ',') //??y??????????????end
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y[i] > end)
			{
				end = y[i];
			}
			i++;
		}

		for (i = start;i < end;i++) //?start??????end???????????????num[i]
		{
			for (j = 0;j < count;j++)
			{
				if (x[j] <= i != 0 && i < y[j])
				{
					num[i]++;
				}
			}
			if (num[i] > max) //?num???????max
			{
				max = num[i];
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}



}

