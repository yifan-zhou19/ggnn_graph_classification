package <missing>;

public class GlobalMembers
{
	public static int yuanshi(int a,int b)
	{
		if (a > 80 && b >= 1)
		{
			return 8000;
		}
		else
		{
			return 0;
		}
	}
	public static int wusi(int a,int b)
	{
		if (a > 85 && b > 80)
		{
			return 4000;
		}
		else
		{
			return 0;
		}
	}
	public static int chengji(int a)
	{
		if (a > 90)
		{
			return 2000;
		}
		else
		{
			return 0;
		}
	}
	public static int xibu(int a,char c)
	{
		if (a > 85 && c == 'Y')
		{
			return 1000;
		}
		else
		{
			return 0;
		}
	}
	public static int banji(int b,char d)
	{
		if (b > 80 && d == 'Y')
		{
			return 850;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int[] a = new int[120];
		int[] b = new int[102];
		int[] c = new int[120];
		int i;
		int n;
		int[] qian = new int[102];
		int zong = 0;
		int max = 0;
		int wei;
		char[][] mingzi = new char[102][30];
		String xue = new String(new char[102]);
		String xi = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				mingzi[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				xue = tangible.StringFunctions.changeCharacter(xue, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi = tangible.StringFunctions.changeCharacter(xi, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				c[i] = Integer.parseInt(tempVar7);
			}
			qian[i] = (yuanshi(a[i], c[i]) + wusi(a[i], b[i]) + chengji(a[i]) + xibu(a[i], xi.charAt(i)) + banji(b[i], xue.charAt(i)));
			zong += qian[i];
			if (qian[i] > max)
			{
				max = qian[i];
				wei = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",mingzi[wei],qian[wei],zong);



			return 0;










	}
}

