package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] t = new int[1002];
		int[] a = new int[1800];
		int[] b = new int[1800];
		char fei = ',';
		while (fei == ',')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			fei = System.in.read();
			i++;
		}
		i = 0;
		fei = ',';
		while (fei == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			fei = System.in.read();
			i++;
		}
		l = i;
		for (i = 0;i < 1002;i++)
		{
			t[i] = 0;
			for (j = 0;j < l;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					t[i]++;
				}
			}
		}
		int max = t[0];
		for (i = 0;i < 1002;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d %d",l,max);
	}
}

