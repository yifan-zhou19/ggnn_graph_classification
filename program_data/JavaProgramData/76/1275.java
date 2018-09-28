package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float num;
		float[] a = new float[50000];
		float[] b = new float[50000];
		float sum = 0F;
		float min;
		float max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		min = a[0];
		max = b[0];
		for (int i = 1; i < n; i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			min = a[i] > min != 0 ? min : a[i];
			max = b[i] > max != 0 ? b[i] : max;
		}
		num = min;
		for (float j = min; j <= max; j = j + 0.5)
		{
			for (int i = 0; i < n; i++)
			{
				if (a[i] <= j != 0 && j <= b[i])
				{
					sum++;
				}
			}
			if (sum == 0F)
			{
				break;
			}
			sum = 0F;
			num = num + 0.5;
		}
		if (num == max + 0.5)
		{
			System.out.print(min);
			System.out.print(" ");
			System.out.print(max);
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}


}

