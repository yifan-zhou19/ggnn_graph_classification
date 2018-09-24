package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a < b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		int num;
		int[] h = new int[100];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 0; i < num; i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] f = new int[100];
		f[0] = 1;
		for (i = 1; i < num; i++)
		{
			f[i] = 1;
			for (j = 0; j < i; j++)
			{
				if (h[i] <= h[j])
				{
					f[i] = max(f[i], f[j] + 1);
				}
			}
		}
		int result = f[0];
		for (i = 1; i < num; i++)
		{
			result = max(f[i], result);
		}
		System.out.print(result);
		System.out.print("\n");
	}
}

