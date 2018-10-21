package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int cnt = new int(int *,int);
		int[] b = new int[50];
		int[] a = new int[16];
		int i;
		int j;
		int h;
		for (i = 0;i < 50;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				h = Integer.parseInt(tempVar);
			}
			if (h == -1)
			{
				break;
			}
			for (a[0] = h,j = 1;j < 16;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
				if (a[j] == 0)
				{
					break;
				}
			}
		tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
			b[i] = cnt(tempRef_a, j);
			a = tempRef_a.argValue;
		}
		for (j = 0;j < i;j++)
		{
		System.out.printf("%d\n",b[j]);
		}
	}
	public static int cnt(tangible.RefObject<Integer> m, int n)
	{
		int k;
		int l;
		int p = 0;
		for (k = 0;k < n;k++)
		{
			for (l = 0;l < n;l++)
			{
				if (2 * *(m.argValue + k) == *(m.argValue + l))
				{
					p++;
				}
			}
		}
		return (p);
	}

}

