package <missing>;

public class GlobalMembers
{
	public static int power(int n,int k)
	{
		int i;
		int answer = 1;
		for (i = 1;i <= k;i++)
		{
			answer = answer * n;
		}
		return answer;
	}
	public static String str = new String(new char[100]);
	public static int checkhui(int number)
	{
		int s = Math.log10(number);
		int i;
		int[] a = new int[1000];
		int check = 1;
		for (i = 0;i <= s;i++)
		{
			a[i] = number / power(10, s - i);
			number = number - a[i] * power(10, s - i);
		}
		int j;
		for (j = 0;j <= s / 2;j++)
		{
			if (a[j] == a[s - j])
			{
				continue;
			}
			else
			{
				check = 0;
				break;
			}
		}
		return check;
	}

	public static int checksu(int number)
	{
		int j;
		int check = 1;
		if (number == 2)
		{
			return check;
		}
		for (j = 2;j <= number - 1;j++)
		{
			if (number % j == 0)
			{
				return 0;
				break;
			}
		}
		return check;
	}
	public static int Main()
	{
		int small;
		int big;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			small = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			big = Integer.parseInt(tempVar2);
		}
		int i;
		int status = 0;
		for (i = small;i <= big;i++)
		{
			if ((checkhui(i) == 1) && (checksu(i) == 1))
			{
				System.out.printf("%d",i);
			status = 1;
			break;
			}
		}
		for (++i;i <= big;i++)
		{
			if ((checkhui(i) == 1) && (checksu(i) == 1))
			{
				System.out.printf(",%d",i);
			}
		}

	if (status == 0)
	{
		System.out.print("no");
	}


		return 0;
	}


}

