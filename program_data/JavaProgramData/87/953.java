package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int i;
		int[] s = new int[1000];
		int zhongjian;
		int qian1;
		int qian;
		int hou;
		int shu;
		shu = 0;
		i = 0;
		while (i < 1000)
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
			if (a[i] != 0)
			{
				zhongjian = (d[i] + 11 - a[i]) * 3600;
				qian1 = b[i] * 60 + c[i];
				qian = 3600 - qian1;
				hou = e[i] * 60 + f[i];
				s[i] = zhongjian + qian + hou;
				shu = shu + 1;
				i++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < shu;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

