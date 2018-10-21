package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double[] b = new double[301];
		double av;
		double sum = 0;
		double n;
		double[] a = new double[301];
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		av = sum / n;
		for (i = 0; i < n;i++)
		{
			b[i] = Math.abs(a[i] - av);
		}
		double max = 0;
		int count = 0;
		int[] c = new int[301];
		c[0] = 0;
		for (i = 0; i < n; i++)
		{
			if (max < b[i])
			{
				count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(c,0,(Integer.SIZE / Byte.SIZE));
				max = b[i];
				c[count] = i;
			}
			if (Math.abs(max - b[i]) < 1e-5)
			{
				count++;
				c[count] = i;
			}
		}
		for (i = 0; i <= count; i++)
		{
		 for (int j = 0; j <= count - i - 1; j++)
		 {
			 double temp;
			 if (a[c[j + 1]] > a[c[j]])
			 {
				 temp = a[c[j]];
				 a[c[j]] = a[c[j + 1]];
				 a[c[j + 1]] = temp;
			 }
		 }
		}
		System.out.print(a[c[count]]);
		if (count >= 1)
		{
			for (i = count - 2; i >= 0; i--)
			{
				System.out.print(",");
				System.out.print(a[c[i]]);
			}
		}
		System.out.print("\n");
		return 0;
	}





}

