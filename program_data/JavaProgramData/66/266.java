package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int a;
		int b;
		int c;
		int sum = 0;
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
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
		if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
		{
			sum += ((a - 1) % 7 * 365) % 7;
			for (i = 0;i < b - 1;i++)
			{
				sum += month[i];
			}
			sum += c;
			sum += (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
		}
		else
		{
			sum += ((a - 1) % 7 * 365) % 7;
			for (i = 0;i < b - 1;i++)
			{
				sum += month[i];
			}
			sum += c;
			if (b > 2)
			{
				sum += (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400 + 1;
			}
			else
			{
				sum += (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
			}
		}
		System.out.printf("%s\n",week[sum % 7]);
	}

}

