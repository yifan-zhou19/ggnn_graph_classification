package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] ans = new int[100];
	public static int look = 0;
	public static int i;
	public static int check1(int num)
	{
		int j;
		for (j = 2;j <= Math.sqrt(i);j++)
		{
			if (i % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int check2(int num)
	{
		int len = 0;
		int ctr1;
		int[] number1 = new int[100];
		int[] number2 = new int[100];
		int temp = num;
		while (temp != 0)
		{
			temp = temp / 10;
			number1[len + 1] = temp;
			len++;
		}
		number1[0] = num;
		for (ctr1 = 0;ctr1 < len;ctr1++)
		{
			number2[ctr1] = number1[ctr1] - number1[ctr1 + 1] * 10;
		}
		temp = 0;
		for (ctr1 = 0;ctr1 < len;ctr1++)
		{
			temp = temp * 10 + number2[ctr1];
		}
		if (temp == num)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 100;i++)
		{
			ans[i] = 0;
		}
		for (i = n;i <= m;i++)
		{
			if (check1(i) != 0 && check2(i) != 0)
			{
				ans[look] = i;
				look++;
			}
		}
		if (look == 0)
		{
			System.out.print("no");
		return 0;
		}
		System.out.printf("%d",ans[0]);
		for (i = 1;i < look;i++)
		{
			System.out.printf(",%d",ans[i]);
		}
		return 0;
	}
}

