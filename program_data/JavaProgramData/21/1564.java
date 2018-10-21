package <missing>;

public class GlobalMembers
{
	public static float abs(float x)
	{
	if (x < 0F)
	{
		return (-x);
	}
	else
	{
		return (x);
	}
	}
	public static int Main()
	{
		int[] input = new int[300];
		int i;
		int flag = -1;
		int num;
		int xiabiao = 0;
		float average;
		float sum = 0.0F;
		float fst;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input[i] = Integer.parseInt(tempVar2);
			}
			sum += input[i];
		}
		average = sum / num;
		fst = abs(input[0] - average);
		for (i = 1;i < num;i++)
		{
			if (abs(input[i] - average) > fst)
			{
				fst = abs(input[i] - average);
				xiabiao = i;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (abs(input[i] - average) == fst)
			{
				flag++;
			}
		}
		if (flag == 0)
		{
			System.out.printf("%d",input[xiabiao]);
		}
		else
		{
				if (input[xiabiao] < average)
				{
				System.out.printf("%d,%d",input[xiabiao],(2 * (int)average - input[xiabiao]));
				}
				else
				{
				System.out.printf("%d,%d",(2 * (int)average - input[xiabiao]),input[xiabiao]);
				}
		}
	}
}

