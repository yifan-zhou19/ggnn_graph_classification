package <missing>;

public class GlobalMembers
{
	public static int opp(int a)
	{
		int[] num = new int[5];
		int i;
		int j;
		int rev = 0;
		for (i = 0;a != 0;i++)
		{
			num[i] = a % 10;
			a = (a - a % 10) / 10;
		}
		for (j = 0;j < i;j++)
		{
			rev = rev + num[j] * Math.pow(10,i - j - 1);
		}
		return rev;
	}
	public static int Main()
	{
		int opp = int a;
		int i;
		for (i = 1;i < 7;i++)
		{
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n >= 0)
			{
				System.out.printf("%d\n",opp(n));
			}
			else
			{
				System.out.printf("-%d\n",opp(-n));
			}
		}
		return 0;
	}

}

