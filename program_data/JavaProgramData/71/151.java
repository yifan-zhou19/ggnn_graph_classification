package <missing>;

public class GlobalMembers
{
	public static int f(int nian,int yue,int ri)
	{
		int z = 0;
		int i;
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (nian % 400 == 0 || (nian % 4 == 0 && nian % 100 != 0))
		{
			d[1] = 29;
		}
		for (i = 0;i < yue-1;i++)
		{
			z = z + d[i];
		}
		z = z + ri;
		return (z);
	}
	public static void Main(String[] args)
	{
		int nian;
		int yue1;
		int yue2;
		int n;
		int i;
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
			nian = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yue1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			yue2 = Integer.parseInt(tempVar4);
		}
		if ((int)(Math.abs(f(nian, yue1, 1) - f(nian, yue2, 1))) % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}

	}



}

