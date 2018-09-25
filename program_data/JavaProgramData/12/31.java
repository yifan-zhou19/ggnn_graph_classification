package <missing>;

public class GlobalMembers
{
	public static void initarray(int[] a, int b, int length)
	{
		int i;
		for (i = 0 ; i < length ; i++)
		{
			a[i] = b;
		}
	}
	public static void base(int[] a)
	{
		int[] b = new int[maxinputint + 1];
		int i;
		int j;
		initarray(b, 0, maxinputint);
		for (i = 0 ; i < maxlen; i++)
		{
			if (a[i] > 0)
			{
				b[a[i]]++;
			}
		}
		j = 0;
		for (i = 0 ; i <= maxinputint; i++)
		{
			if (b[i] == 1)
			{
				a[j] = i;
				j++;
			}
		}
	}
	public static int twice(int[] a)
	{
		int i;
		int j;
		int t;
		int result;

		i = 0;
		j = 0;
		t = 0;
		result = 0;
		while ((a[i] <= 50) && (a[j] > 0))
		{
			t = a[i] * 2;
			j = i;
			while ((a[j] <= t) && (a[j] > 0))
			{
				if (a[j] == t)
				{
					result++;
				};
				j++;
			}
			j = 0;
			i++;
		}
		return result;
	}
	public static int Main() // ???
	{
		int[] a = new int[maxlen];
		int[] t = new int[maxlen];
		int i;
		int j;
		int k;
		int l;
		i = 0;
		for (i = 0 ; i < maxlen ; i++)
		{
			a[i] = -2;
		}
		i = 0;
		k = -2;
		while (a[i] != -1)
		{
			while (k != 0)
			{
				k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i] = k;
				i++;
			}
			base(a);
			j = twice(a);
			System.out.print(j);
			System.out.print("\n");
			initarray(a, -2, maxlen);
			i = 0;
			k = -2;
		}
		return 1;
	}
}

