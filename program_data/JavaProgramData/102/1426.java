package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int k;
		int i;
		int j;
		String sex = new String(new char[10]);
		double[] a = new double[45];
		double[] b = new double[45];
		double temp;
		int boy = 0;
		int girl = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < N; k++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			temp = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'f')
			{
				b[girl] = temp;
				girl++;
			}
			else
			{
				a[boy] = temp;
				boy++;
			}
		}
		for (i = 0; i < boy - 1;i++)
		{
			for (j = 0; j < boy - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0; i < girl - 1;i++)
		{
			for (j = 0; j < girl - 1 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					temp = b[j + 1];
					b[j + 1] = b[j];
					b[j] = temp;
				}
			}
		}
		for (i = 0; i < boy;i++)
		{
			System.out.printf("%.2f", a[i]);
			System.out.printf("%.2f", " ");
		}
		for (j = 0; j < girl - 1;j++)
		{
			System.out.printf("%.2f", b[j]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", b[j]);
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

