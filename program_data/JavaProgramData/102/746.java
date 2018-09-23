package <missing>;

public class GlobalMembers
{
	public static double[] mHeight = new double[40];
	public static double[] fHeight = new double[40];

	public static int comp(Object a, Object b)
	{
		//return (int)(*(double *)a -*(double *)b);
		if ((double)a > (double)b)
		{
			return 1;
		}
		else if ((double)a < (double)b)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int mCount = 0;
		int fCount = 0;
		int i;
		String temp = new String(new char[10]);
		double height;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(temp, "male") == 0)
			{
				mHeight[mCount++] = height;
			}
			else
			{
				fHeight[fCount++] = height;
			}
		}
		qsort(mHeight, mCount, (Double.SIZE / Byte.SIZE), comp);
		qsort(fHeight, fCount, (Double.SIZE / Byte.SIZE), comp);

		for (i = 0; i < mCount; i++)
		{
			//cout << setprecision(2) << mHeight[i] << " ";
			System.out.printf("%0.2f ", mHeight[i]);
		}
		for (i = 0; i < fCount - 1; i++)
		{
			//cout << setprecision(2) << fHeight[fCount-1-i] << " ";
			System.out.printf("%0.2f ", fHeight[fCount - 1 - i]);
		}
		//cout << setprecision(2) << fHeight[0] << endl;
		System.out.printf("%0.2f\n", fHeight[0]);

		return 0;
	}
}

