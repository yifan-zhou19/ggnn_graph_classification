package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***????????***
	//***??????***
	//***???2013.1.13***
	//*************************************************
	public static int Main()
	{
		int n;
		int c;
		int i;
		int[] t = new int[2];
		int flag;
		double[] a = new double[301];
		double average;
		double d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		average = 0;
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			average += a[i];
		}
		average /= n;
		d = Math.abs(a[0] - average);
		flag = 1;
		t[0] = a[0];
		for (i = 1; i < n; i++)
		{
			if (Math.abs(Math.abs(a[i] - average) - d) < 0.1)
			{
				t[flag] = a[i];
				flag++;
			}
			else if (Math.abs(a[i] - average) > d)
			{
				flag = 1;
				d = Math.abs(a[i] - average);
				t[0] = a[i];
			}
		}
		c = 0;
		for (i = 0; i < flag; i++)
		{
			if (t[i] < average)
			{
				System.out.print(t[i]);
				c++;
				if (c < flag)
				{
					System.out.print(",");
				}
			}
		}
		for (i = 0; i < flag; i++)
		{
			if (t[i] > average)
			{
				System.out.print(t[i]);
				c++;
				if (c < flag)
				{
						System.out.print(",");
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

