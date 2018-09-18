package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int i = 0;
		int[] d = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] b = new float[10000];
		float c;
		c = n / 10;
		b[0] = Math.floor(c);
		a[0] = n % 10;
		if (b[0] == 0F)
		{
			System.out.print(n);
			System.out.print("\n");
		}
		if (b[0] != 0F)
		{
		while (true)
		{
			a[i + 1] = (int)b[i] % 10;
			b[i + 1] = Math.floor(b[i] / 10);
			if (b[i + 1] < 1F)
			{
				break;
			}
			i++;
		}
		for (int k = 0;k <= i + 1;k++)
		{
			System.out.print(a[k]);
		}
		System.out.print("\n");
		}
		return 0;
	}
}

