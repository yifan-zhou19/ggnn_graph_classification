package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		float[] h = new float[100];
		String gender = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			gender = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		if (strcmp(gender,"male") == 0)
		{
			h[i] = h[i] * 10;
		sum++;
		}

		}
		sort(h + 1,h + n + 1);
		for (int i = n - sum + 1;i <= n;i++)
		{
		System.out.printf("%.2lf ",h[i] / 10);
		}
		for (int i = n - sum;i >= 2;i--)
		{
		System.out.printf("%.2lf ",h[i]);
		}

		System.out.printf("%.2lf",h[1]);


		return 0;
	}

}

