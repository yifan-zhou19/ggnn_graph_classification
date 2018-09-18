package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n;
		int n;
		int[] a = new int[300];
		double sum = 0;
		double avg;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
		avg = sum / n;

		if (Math.abs(Math.abs(a[0] - avg) - Math.abs(a[n - 1] - avg)) < 1 * 1e-5)
		{
			System.out.print(a[0]);
			System.out.print(",");
			System.out.print(a[n - 1]);
			System.out.print("\n");
			return 0;
		}

		if (Math.abs(a[0] - avg) - Math.abs(a[n - 1] - avg) > 1 * 1e-5)
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}
	}


}

