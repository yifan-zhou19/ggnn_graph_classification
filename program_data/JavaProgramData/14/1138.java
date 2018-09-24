package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] math = new int[100000];
		int[] chin = new int[100000];
		int[] total = new int[100000];
		int[] id = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = Integer.parseInt(tempVar2);
			}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			math[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			chin[i] = Integer.parseInt(tempVar4);
		}
		}
		for (i = 0;i < n;i++)
		{
			total[i] = 100000 * (math[i] + chin[i]) + 100000 - id[i];
		}
		int comp = new int(const Object * a,const Object * b);
		qsort(total,n,(Integer.SIZE / Byte.SIZE),comp);
		System.out.printf("%ld %ld\n",100000 - (total[n - 1] - 100000 * ((int)total[n - 1] / 100000)),(int)total[n - 1] / 100000);
		System.out.printf("%ld %ld\n",100000 - (total[n - 2] - 100000 * ((int)total[n - 2] / 100000)),(int)total[n - 2] / 100000);
		System.out.printf("%ld %ld\n",100000 - (total[n - 3] - 100000 * ((int)total[n - 3] / 100000)),(int)total[n - 3] / 100000);
		System.in.read();
		System.in.read();
	}




		public static int comp(Object a, Object b)
		{
	return *(int)a - (int)b;
		}

}

