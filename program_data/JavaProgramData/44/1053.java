package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a3 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a4 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a5 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			a6 = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",reverse(a1),reverse(a2),reverse(a3),reverse(a4),reverse(a5),reverse(a6));
	}
	public static int reverse(int num)
	{
		int mun;
		int p1;
		int p2;
		int p3;
		int p4;
		int p5;
		if (Math.abs(num) < 10)
		{
			mun = num;
		}
		else if (Math.abs(num) >= 10 && Math.abs(num) < 100)
		{
			p1 = num / 10,p2 = num - p1 * 10,mun = p2 * 10 + p1;
		}
		else if (Math.abs(num) >= 100 && Math.abs(num) < 1000)
		{
			p1 = num / 100,p2 = (num - p1 * 100) / 10,p3 = num - p1 * 100 - p2 * 10,mun = p3 * 100 + p2 * 10 + p1;
		}
		else if (Math.abs(num) >= 1000 && Math.abs(num) < 10000)
		{
			p1 = num / 1000,p2 = (num - p1 * 1000) / 100,p3 = (num - p1 * 1000 - p2 * 100) / 10,p4 = num - p1 * 1000 - p2 * 100 - p3 * 10,mun = p4 * 1000 + p3 * 100 + p2 * 10 + p1;
		}
		else if (Math.abs(num) >= 10000)
		{
			p1 = num / 10000,p2 = (num - p1 * 10000) / 1000,p3 = (num - p1 * 10000 - p2 * 1000) / 100,p4 = (num - p1 * 10000 - p2 * 1000 - p3 * 100) / 10,p5 = num - p1 * 10000 - p2 * 1000 - p3 * 100 - p4 * 10,mun = p5 * 10000 + p4 * 1000 + p3 * 100 + p2 * 10 + p1;
		}
		return (mun);
	}
}

