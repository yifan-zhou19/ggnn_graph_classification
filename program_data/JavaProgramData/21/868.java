package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int sum = 0;
		int j;
		int temp;
		char t = ',';
		float m;
		float[] b = new float[1000];
		float d;
		float q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		m = sum / (n * 1.0);
		for (i = 0;i < n;i++)
		{
					q = a[i] - m;
			b[i] = Math.abs(q);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < (n - i);j++)
			{
				if (b[j] < b[j + 1])
				{
				d = b[j];
				b[j] = b[j + 1];
				b[j + 1] = d;
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				}
			}
		}
		if (b[0] != b[1])
		{
			System.out.print(a[0]);
		}
		else
		{
			System.out.print(a[0]);
			for (i = 1;i < n;i++)
			{
				if (b[i] == b[0])
				{
					System.out.print(t);
					System.out.print(a[i]);
				}
				else
				{
					break;
				}
			}
		}
		return 0;
	}

}

