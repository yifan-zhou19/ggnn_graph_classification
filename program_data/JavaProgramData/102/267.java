package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		double[] h1 = new double[41];
		double[] h2 = new double[42];
		double t;
		double h;
		String sex = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 System.in.read();
		for (i = 0,j = 0;i + j < n;)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'm')
			{
			h1[i] = h;
			i++;
			}
		else
		{
			h2[j] = h;
			j++;
		}
		}
		for (p = 0;p < i - 1;p++)
		{
			for (q = 0;q < i - 1 - p;q++)
			{
				if (h1[q] > h1[q + 1])
				{
					t = h1[q];
					h1[q] = h1[q + 1];
					h1[q + 1] = t;
				}
			}
		}
		for (p = 0;p < j;p++)
		{
			for (q = 0;q < j - p;q++)
			{
				if (h2[q] < h2[q + 1])
				{
					t = h2[q];
					h2[q] = h2[q + 1];
					h2[q + 1] = t;
				}
			}
		}
				System.out.printf("%.2f", h1[0]);
				for (p = 1;p < i;p++)
				{
					System.out.printf("%.2f", " ");
					System.out.printf("%.2f", h1[p]);
				}
				for (p = 0;p < j;p++)
				{
					System.out.printf("%.2f", " ");
					System.out.printf("%.2f", h2[p]);
				}
				return 0;
	}



}

