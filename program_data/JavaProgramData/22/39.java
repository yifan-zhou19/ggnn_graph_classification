package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int m;
		int l;
		int t;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
			c = System.in.read();
		}while (c != '\n');
		l = i;
		if (l == 1)
		{
			System.out.print("No");
		}
		else
		{
		m = 0;
		for (i = 1;i < l;i++)
		{
			if (a[i] > a[m])
			{
				m = i;
			}
		}
			t = m;
			m = 0;
			while (a[m] == a[t])
			{
				m++;
			}
			for (i = 0;i < l;i++)
			{
			if (a[i] < a[t] && a[i]> a[m])
			{
				m = i;
			}
			}
			if (a[m] == a[t] || m == l)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%u\n",a[m]);
			}
		}
	}
}

