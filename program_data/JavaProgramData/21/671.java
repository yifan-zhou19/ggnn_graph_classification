package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int max = 0;
		int min = 0;
		float ave = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			ave = ave + a[i];
		}
		ave = ave / n;
		max = a[0];
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		if ((max - ave) > (ave - min))
		{
			System.out.print(max);
		}
		if ((max - ave) < (ave - min))
		{
			System.out.print(min);
		}
		if ((max - ave) == ave - min)
		{
			System.out.print(min);
			System.out.print(",");
			System.out.print(max);
		}
		return 0;
	}

}

