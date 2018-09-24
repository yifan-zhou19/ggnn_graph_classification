package <missing>;

public class GlobalMembers
{
	public static int fuc(int[] b, int m)
	{
		int i;
		int t;
		b[0] = m;
		for (i = 1;b[i - 1] != 1;i++)
		{
			b[i] = (b[i - 1] - b[i - 1] % 2) / 2;
		}
		return (i - 1);
	}
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		i = fuc(a, m);
		j = fuc(b, n);
		for (;a[i] == b[j];i--,j--)
		{
			;
		}
		System.out.printf("%d",a[i + 1]);
	}

}

