package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int t;
		int s;
		int j;
		int p;
		int c;
		int tk;
		int tm;
		int qk;
		int qm;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			t = 0;
			p = 0;
			j = 0;
			s = 0;
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
			tk = 0;
			tm = n - 1;
			qk = 0;
			qm = n - 1;
			for (;tk <= tm;)
			{
				if (a[tm] > b[qm])
				{
					t++;
					tm--;
					qm--;
				}
				else if (a[tm] < b[qm])
				{
					s++;
					tm--;
					qk++;
				}
				else if (a[tk] > b[qk])
				{
					t++;
					tk++;
					qk++;
				}
				else if (a[tk] < b[qk])
				{
					s++;
					tm--;
					qk++;
				}
				else if (a[tm] < b[qk])
				{
					s++;
					tm--;
					qk++;
				}

				else
				{
					tm--;
					qk++;
				}
			}
			System.out.printf("%d\n",t * 200 - s * 200);
		}
		return 0;
	}
}

