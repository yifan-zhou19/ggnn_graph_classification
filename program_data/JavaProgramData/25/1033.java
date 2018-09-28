package <missing>;

public class GlobalMembers
{
	public static void cf(String a)
	{
		int t = a.length();
		int i;
		for (i = 0;i < t;i++)
		{
			a[i] = (a[i] - 48) * 2 + 48;
		}
		for (i = 0;i < t - 1;i++)
		{
			if (a[i].compareTo(57) > 0)
			{
				a[i] -= 10;
				a[i + 1] += 1;
			}
		}
		if (a[t - 1].compareTo(57) > 0)
		{
			a[t - 1] -= 10;
			a[t] = '1';
		}
	}
	public static void strre(String a)
	{
		int i;
		int j;
		int k;
		char t;
		k = a.length();
		for (j = 0,i = k - 1;j < k / 2;j++,i--)
		{
			t = a[j];
			a[j] = a[i];
			a[i] = t;
		}
	}
	public static void Main()
	{
		int n;
		char[] a = {'1', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			cf(a);
		}
		strre(a);
		System.out.println(a);
	}
}

