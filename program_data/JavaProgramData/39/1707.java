package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20]);
		String q = new String(new char[20]);
		char a;
		char b;
		int k;
		int m;
		int n;
		int p;
		int i;
		int amount;
		int max;
		int sum;
			 max = 0;
		 sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)

		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p = Integer.parseInt(tempVar7);
			}
			amount = 0;
					if ((m > 80) && (p >= 1))
					{
				amount += 8000;
					}
			if ((m > 85) && (n > 80))
			{
				amount += 4000;
			}
			if (m > 90)
			{
				amount += 2000;
			}
			if ((m > 85) && (b == 'Y'))
			{
				amount += 1000;
			}
			if ((n > 80) && (a == 'Y'))
			{
				amount += 850;
			}
			  sum += amount;

			if (amount > max)
			{
				q = s;
				max = amount;
			}


		}


			System.out.printf("%s\n",q);
			System.out.printf("%d\n",max);
				System.out.printf("%d\n",sum);
		return 0;
	}



}

