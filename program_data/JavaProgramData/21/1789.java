package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j=0,n,result[2];
		int i;
		int j = 0;
		int n;
		int[] result = new int[2];
		float[] num = new float[300];
		float sum = 0F;
		float[] cha = new float[300];
		float aver;
		float max = 0F;
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
				num[i] = Float.parseFloat(tempVar2);
			}
			sum = sum + num[i];
		}
		aver = sum / n;
		for (i = 0;i < n;i++)
		{
			cha[i] = (num[i] - aver) > (aver - num[i])?(num[i] - aver):(aver - num[i]);
			if (max < cha[i])
			{
				max = cha[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				result[j] = num[i];
				j++;
			}
		}
		if (j == 1)
		{
			System.out.printf("%d",result[0]);
		}
		else
		{
			System.out.printf("%d,%d\n",(result[0]<result[1] != 0? result[0]:result[1]),(result[0]> result[1] != 0? result[0]:result[1]));
		}
	}
}

