package <missing>;

public class GlobalMembers
{
	public static int IsPrime(int a)
	{
		int x;
		int i;
		x = Math.sqrt(a);
		assert a > 1;
		for (i = 2;i <= x;i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n; //flag??????????????????????
		int i;
		int primea;
		int primeb;
		int flag = 0;
		//1.??????????a?b
		//2.????????
		int isprimeflag1;
		int isprimeflag2;
		int exist = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2) //i??????????
		{
			if (flag == 1) //?????????????????????????
			{
				primeb = i;
				if (IsPrime(primeb) != 0)
				{
					exist = 1;
					System.out.printf("%d %d\n",i - 2,primeb);
				}
				else
				{
					flag = 0;
				}
			}
			else //???????????????????????
			{
				primea = i;
				primeb = i + 2;
				if (primeb > n)
				{
					break;
				}
				i += 2;
				isprimeflag1 = IsPrime(primea);
				isprimeflag2 = IsPrime(primeb);
				if (isprimeflag1 != 0 && isprimeflag2 != 0)
				{
					exist = 1;
					System.out.printf("%d %d\n",primea,primeb);
					flag = 1;
				}
				else if (isprimeflag2)
				{
					flag = 1;
				}
			}
		}
		if (exist == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}
}

