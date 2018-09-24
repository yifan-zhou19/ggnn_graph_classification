package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] sz = new int[20];
		int i;
		int fanxu = 0;
		int weishu = 0;
		for (i = 0;;i++)
		{
			sz[i] = num % (int)Math.pow(10,i + 1);

			if (num % (int)Math.pow(10,i + 1) == 0 && num / (int)Math.pow(10,i + 1) == 0)
			{
				weishu = i;
				break;
			}
			num = num - sz[i];
		}
		for (i;i >= 0;i--)
		{
			fanxu = fanxu + sz[i] * (int)Math.pow(10,weishu - i - 1) / (int)Math.pow(10,i);
		}
		return fanxu;
	}
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",reverse(a),reverse(b),reverse(c),reverse(d),reverse(e),reverse(f));
	}
}

