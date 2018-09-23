package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int put = int;
		int min = new int(int,int);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] a1 = new int[10];
		int[] b1 = new int[10];
		int n1;
		int n2;
		int p = 0;
		int q = 0;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;;i++)
		{
			a[i] = n1;
			n1 = put(n1);
			p++;
			if (n1 == 0)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			b[i] = n2;
			n2 = put(n2);
			q++;
			if (n2 == 0)
			{
				break;
			}
		}
		for (i = p;i > 0;i--)
		{
			a1[j] = a[i - 1];
			j++;
		}
		j = 0;
		for (i = q;i > 0;i--)
		{
			b1[j] = b[i - 1];
			j++;
		}
		for (i = 0;i < min(p, q);i++)
		{
			if (a1[i] == b1[i] && a1[i + 1] != b1[i + 1])
			{
				System.out.printf("%d",a1[i]);
				break;
			}
		}
		return 0;
	}

	public static int put(int a)
	{
		int m;
		if (a % 2 == 0)
		{
			m = a / 2;
		}
		else
		{
			m = (a - 1) / 2;
		}
		return m;
	}

	public static int min(int a,int b)
	{
		int m;
		if (a < b)
		{
			m = a;
		}
		else
		{
			m = b;
		}
		return m;
	}

}

