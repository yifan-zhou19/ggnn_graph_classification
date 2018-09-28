package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;

		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n", reverse(num));
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n", reverse(num));
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			num = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n", reverse(num));
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			num = Integer.parseInt(tempVar4);
		}
		System.out.printf("%d\n", reverse(num));
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			num = Integer.parseInt(tempVar5);
		}
		System.out.printf("%d\n", reverse(num));
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			num = Integer.parseInt(tempVar6);
		}
		System.out.printf("%d\n", reverse(num));
	}

	public static int reverse(int num)
	{
		int r = 0;
		int flag = 0;
		if (num == 0)
		{
			r = 0;
		}
		else
		{
			switch (num / Math.abs(num))
			{
			case -1:
				num = num * (-1);
				flag = 1;
			case 1:
				while (num != 0)
				{
						r = r * 10 + num % 10;
						num = num / 10;
				}
			}
			if (flag == 1)
			{
				r = r * (-1);
			}
		}

		/*
			?????num???????r=0?flag=0???switch???
				[1](num=0) r=0,break??
				[2](num<0) ?num?-1?flag=1????break????[3]????
				[3](num>0)
				?while???????????num??0?
					r=r*10+num%10;
					num=num/10;
			??switch????flag???0??????r??-1?
		*/
		return (r);
	}
}

