package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[301];
		int[] change = new int[301];
		int n = 0;
		int i = 0;
		int sum = 0;
		int count = 0;
		double ave = 0;
		double max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(change,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + num[i];
		}
		ave = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(num[i] - ave) > max)
			{
				max = Math.abs(num[i] - ave);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(num[i] - ave) - max) < 0.00001)
			{
				change[count] = num[i];
				count++;
			}
		}
		if (count == 2)
		{
			if (change[1] > change[0])
			{
				System.out.print(change[0]);
				System.out.print(",");
				System.out.print(change[1]);
			}
			else
			{
				System.out.print(change[1]);
				System.out.print(",");
				System.out.print(change[0]);
			}
		}
		else
		{
			System.out.print(change[0]);
		}
		return 0;
	}
}

