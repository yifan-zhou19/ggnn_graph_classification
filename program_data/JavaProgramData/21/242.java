package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300];
		float average = 0F;
		float temp;
		float max = 0F;
		int i;
		int n;
		int flag = 0;
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
				num + i = tempVar2;
			}
		}

		for (i = 0;i < n;i++)
		{
			average += num[i];
		}
		average /= n;

		for (i = 0;i < n;i++)
		{
			 temp = Math.abs(average - num[i]);
			 if (temp > max)
			 {
				max = temp;
			 }
		}
		for (i = 0;i < n;i++)
		{
			 if (Math.abs(Math.abs(num[i] - average) - max) <= 0.001)
			 {
				 if (flag == 0)
				 {
					flag = 1;
				 }
				 else
				 {
					 System.out.print(",");
				 }
				 System.out.printf("%d",num[i]);
			 }
		}
		return 1;
	}

}

