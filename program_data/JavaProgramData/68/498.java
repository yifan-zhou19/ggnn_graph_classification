package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int tashisushu = int x;
	int n;
	int fenjie;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i += 2)
	{
		for (fenjie = 2;fenjie <= (i / 2);fenjie++)
		{
			if (tashisushu(fenjie) + tashisushu(i - fenjie) == 2)
			{
				System.out.printf("%d=%d+%d\n",i,fenjie,i - fenjie);
				break;
			}
		}
	}
	}


	public static int tashisushu(int x)
	{
	int i = 2;
	int c = 1;
	for (i;i <= Math.sqrt(x);i++)
	{
		if (x % i == 0)
		{
			return 0;
			c = 0;
			break;
		}
	}
	if (c == 1)
	{
		return 1;
	}
	}

}

