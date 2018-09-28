package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] kaishi = new int[100];
		int[] jieshu = new int[100];
		int[] shijian = new int[100];
		int i;
		int p = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f[i] = Integer.parseInt(tempVar6);
			}
			if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
			{
				break;
			}
			else
			{
				kaishi[i] = 3600 * a[i] + 60 * b[i] + c[i];
				jieshu[i] = 12 * 3600 + 3600 * d[i] + 60 * e[i] + f[i];
				shijian[i] = jieshu[i] - kaishi[i];

			}
			p++;

		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d\n",shijian[i]);
		}





		return 0;
	}

}

