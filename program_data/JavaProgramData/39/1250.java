public class file
{
	public String name = new String(new char[100]);
	public int scoreq;
	public int scorec;
	public char m;
	public char w;
	public int ati;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		file[] f = tangible.Arrays.initializeWithDefaultfileInstances(101);
		int n;
		int sum = 0;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			f[i].money = 0;
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f[i].scoreq = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				f[i].scorec = Integer.parseInt(tempVar4);
			}
			System.in.read();
			f[i].m = System.in.read();
			System.in.read();
			f[i].w = System.in.read();
			System.in.read();
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				f[i].ati = Integer.parseInt(tempVar5);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f[i].scoreq > 80 && f[i].ati >= 1)
			{
				f[i].money += 8000;
			}
			if (f[i].scoreq > 85 && f[i].scorec > 80)
			{
				f[i].money += 4000;
			}
			if (f[i].scoreq > 90)
			{
				f[i].money += 2000;
			}
			if (f[i].scoreq > 85 && f[i].w == 'Y')
			{
				f[i].money += 1000;
			}
			if (f[i].scorec > 80 && f[i].m == 'Y')
			{
				f[i].money += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += f[i].money;
		}
		k = f[0].money;
		for (i = 0;i < n;i++)
		{
			if (f[i].money > k)
			{
				k = f[i].money;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f[i].money == k)
			{
				System.out.printf("%s\n",f[i].name);
				System.out.printf("%d\n",f[i].money);
				break;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

