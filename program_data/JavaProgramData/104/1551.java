package <missing>;

public class GlobalMembers
{
	public static int number(int n)
	{
		int i;
		int k = 1;
		for (i = 1;;i++)
		{
			k *= 2;
			if (n < k)
			{
				break;
			}
		}
		return i;
	}
	public static void array(int[] a, int number, int n)
	{
		a[number] = n;
		int l = number;
		int i;
		for (i = 1;i < l;i++)
		{
			if (n % 2 == 0)
			{
				n /= 2;
			}
			else
			{
				n = (n - 1) / 2;
			}
			number -= 1;
			a[number] = n;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int m1;
		int n1;
		int k = 0;

		m1 = number(m);
		n1 = number(n);
		int[] a = new int[100];
		int[] b = new int[100];
		array(a, m1, m);
		array(b, n1, n);
		int i;
		int j;
		for (i = m1;i >= 1;i--)
		{
			for (j = n1;j >= 1;j--)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					k = 1;
					break;
				}
			}
			if (k != 0)
			{
				break;
			}
		}
	}



}

