package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1;
		int n2;
		int i;
		String s = new String(new char[20]);
		double[] h1 = new double[50];
		double[] h2 = new double[50];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n1 = n2 = 0;
		for (i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			t = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(s,"male") == 0)
			{
				h1[n1++] = t;
			}
			else
			{
				h2[n2++] = t;
			}
		}
		sort(h1,h1 + n1);
		sort(h2,h2 + n2);
		for (i = 0;i < n1;i++)
		{
			System.out.printf("%.2lf ",h1[i]);
		}
		for (i = n2 - 1;i != 0;i--)
		{
			System.out.printf("%.2lf ",h2[i]);
		}
		System.out.printf("%.2lf",h2[0]);
		System.out.println("");
	}
}

