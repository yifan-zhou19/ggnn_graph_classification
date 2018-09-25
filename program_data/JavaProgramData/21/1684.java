package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min = 1000;
		int max = 0;
		float average = 0.0F;
		float sum = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] array = new int[N];
		for (int i = 0; i < n; i++)
		{
			array[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += array[i];
			if (array[i] > max)
			{
				max = array[i];
			}
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		average = sum / n;
		float cha = 0F;

		if (Math.abs(max - average) > Math.abs(min - average))
		{
		System.out.print(max);
		System.out.print("\n");
		}
		else if (Math.abs(max - average) < Math.abs(min - average))
		{
		System.out.print(min);
		System.out.print("\n");
		}
		else
		{
		System.out.print(min);
		System.out.print(",");
		System.out.print(max);
		System.out.print("\n");
		}

		return 0;
	}
}

