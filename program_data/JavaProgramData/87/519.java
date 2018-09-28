package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int i;
		int miaoshu1;
		int miaoshu2;
		int jieguo;
		for (i = 1;i <= 10086;i++)
		{
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
			if (a < 1 || d>11 || b < 0 || f>59)
			{
				break;
			}
			else
			{
				miaoshu1 = a * 3600 + b * 60 + c;
				miaoshu2 = (d + 12) * 3600 + e * 60 + f;
				jieguo = miaoshu2 - miaoshu1;
				System.out.printf("%d\n",jieguo);
			}
		}
		scanf("0 0 0 0 0 0");
		return 0;
	}


}

