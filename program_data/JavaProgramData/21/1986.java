package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[300];
		float s = 0F;
		float max = 0F;
		float l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			s += a[i];
		}
		s /= n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - s) >= max)
			{
				max = Math.abs(a[i] - s);
				l = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - s) == max && l != a[i])
			{
				System.out.print(a[i]);
				System.out.print(",");
			}
			if (Math.abs(a[i] - s) == max && l == a[i])
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

