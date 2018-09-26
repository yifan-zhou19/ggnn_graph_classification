package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		int reverse = int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			reverse(a[i]);
		}
	}
	public static int reverse(int num)
	{
		int indiv;
		int ten;
		int hundred;
		int thousand;
		int ten_thousand;
		int c;
		if (num > 0)
		{
			ten_thousand = num / 10000;
			thousand = (int)(num - ten_thousand * 10000) / 1000;
			hundred = (int)(num - ten_thousand * 10000 - thousand * 1000) / 100;
			ten = (int)(num - ten_thousand * 10000 - thousand * 1000 - hundred * 100) / 10;
			indiv = (int)(num - ten_thousand * 10000 - thousand * 1000 - hundred * 100 - ten * 10);
			if (num > 9999)
			{
				c = indiv * 10000 + ten * 1000 + hundred * 100 + thousand * 10 + ten_thousand;
				System.out.printf("%d\n",c);
			}
			else if (num > 999)
			{
				c = indiv * 1000 + ten * 100 + hundred * 10 + thousand;
				System.out.printf("%d\n",c);
			}
			else if (num > 99)
			{
				c = indiv * 100 + ten * 10 + hundred;
				System.out.printf("%d\n",c);
			}
			else if (num > 9)
			{
				c = indiv * 10 + ten;
				System.out.printf("%d\n",c);
			}
			else
			{
				System.out.printf("%d\n",indiv);
			}

		}
		else if (num == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			ten_thousand = Math.abs(num) / 10000;
			thousand = (int)(Math.abs(num) - ten_thousand * 10000) / 1000;
			hundred = (int)(Math.abs(num) - ten_thousand * 10000 - thousand * 1000) / 100;
			ten = (int)(Math.abs(num) - ten_thousand * 10000 - thousand * 1000 - hundred * 100) / 10;
			indiv = (int)(Math.abs(num) - ten_thousand * 10000 - thousand * 1000 - hundred * 100 - ten * 10);
			if (Math.abs(num) > 9999)
			{
				c = indiv * 10000 + ten * 1000 + hundred * 100 + thousand * 10 + ten_thousand;
				System.out.printf("-%d\n",c);
			}
			else if (Math.abs(num) > 999)
			{
				c = indiv * 1000 + ten * 100 + hundred * 10 + thousand;
				System.out.printf("-%d\n",c);
			}
			else if (Math.abs(num) > 99)
			{
				c = indiv * 100 + ten * 10 + hundred;
				System.out.printf("-%d\n",c);
			}
			else if (Math.abs(num) > 9)
			{
				c = indiv * 10 + ten;
				System.out.printf("-%d\n",c);
			}
			else
			{
				System.out.printf("-%d\n",indiv);
			}

		}


	}
}

