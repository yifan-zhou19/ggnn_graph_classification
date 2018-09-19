package <missing>;

public class GlobalMembers
{
	public static void kk(int n, int[] a)
	{
		int i = 0;
		while (n != 0)
		{
			a[i] = n;
			n /= 2;
			i++;
		}
	}
	public static int gg(int n)
	{
		int i = 0;
		while (n != 0)
		{
			n = n / 2;
			i++;
		}
		return (i);
	}

	public static void Main()
	{
		int a;
		int b;
		int[] c = new int[20];
		int[] d = new int[20];
		int e;
		int f;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		e = gg(a);
		f = gg(b);
		kk(a, c);
		kk(b, d);
		for (i = 1;;i++)
		{
			if (c[e - i] != d[f - i])
			{
				System.out.printf("%d",c[e - i + 1]);
				break;
			}
		}
	}

}

