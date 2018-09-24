package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300];
		int[] a = new int[300];
		float ave;
		float sum = 0.0F;
		float x = 0.0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - ave) > x)
			{
				x = Math.abs(a[i] - ave);
				max = i;
			}
		}
		System.out.print(a[max]);
		for (i = max + 1;i < n;i++)
		{
			if (Math.abs(a[i] - ave) == x)
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

