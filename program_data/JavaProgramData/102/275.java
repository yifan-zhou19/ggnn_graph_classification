package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j = 0;
		int h = 0;
		int m;
		int flag = 0;
		char[][] n = new char[40][7];
		float[] s = new float[40];
		float[] a = new float[40];
		float[] b = new float[40];
		float temp;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k; i++)
		{
			n[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			s[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < k; i++)
		{
			if (n[i][0] == 'm')
			{
				a[j] = s[i];
				j++;
			}
			else
			{
				b[h] = s[i];
				h++;
			}
		}
		for (i = 0; i < j - 1; i++)
		{
			for (m = 0; m < j - i - 1; m++)
			{
				if (a[m] > a[m + 1])
				{
					temp = a[m + 1];
					a[m + 1] = a[m];
					a[m] = temp;
				}
			}
		}
		for (i = 0; i < h - 1; i++)
		{
			for (m = 0; m < h - i - 1; m++)
			{
				if (b[m] < b[m + 1])
				{
					temp = b[m + 1];
					b[m + 1] = b[m];
					b[m] = temp;
				}
			}
		}
		for (i = 0; i < j; i++)
		{
			if (flag != 0)
			{
			System.out.printf("%f", " ");
			System.out.printf("%.2f", a[i]);
			}
			else
			{
				System.out.printf("%.2f", a[i]);
				flag = 1;
			}
		}
		for (i = 0; i < h; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", b[i]);
		}
		return 0;
	}
}

