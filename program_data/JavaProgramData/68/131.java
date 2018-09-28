package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int r = 1;
		if (x % 2 == 0)
		{
			r = 0;
		}
		for (i = 3;i <= Math.sqrt(x);i = i + 2)
		{
			if (x % i == 0)
			{
				r = 0;
			}
		}
			return r;
	}
	public static void Main(String[] args)
	{
		int n;
		int fig;
		int elm1;
		int elm2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (fig = 6;fig <= n;fig = fig + 2)
		{
			for (elm1 = 2;elm1 < fig;elm1++)
			{
				elm2 = fig - elm1;
				if (sushu(elm1) == 1 && sushu(elm2) == 1)
				{
					System.out.printf("%d=%d+%d\n",fig,elm1,elm2);
					break;
				}
			}
		}
	}
}

