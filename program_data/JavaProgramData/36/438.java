package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sort(char x[], int n);
		int m;
		int n;
		int r;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		sort(a, m);
		sort(b, n);
		r = strcmp(a,b);
		if (r == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

	public static void sort(String x, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
			if (x[j].compareTo(x[k]) > 0)
			{
				k = j;
			}
			}
			if (k != i)
			{
			t = x[i];
			x[i] = x[k];
			x[k] = t;
			}
		}
	}

}

