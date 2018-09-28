package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] a = new float[n];
		float ar;
		float sum = 0F;
		float max = 0F;
		for (int i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ar = sum / n;
		for (int i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - ar) >= max)
			{
				max = Math.abs(a[i] - ar);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if ((Math.abs(a[i] - ar) == max) && k == 0)
			{
			System.out.print(a[i]);
			k++;
			}
			else if ((Math.abs(a[i] - ar) == max) && k != 0)
			{
				System.out.print(',');
				System.out.print(a[i]);
			k++;
			}
		}
		return 0;
	}
}

