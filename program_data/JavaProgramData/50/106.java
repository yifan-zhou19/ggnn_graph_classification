package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int a;
		int w = 0;
		int rizi = 0;
		int u;
		int[] yue = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			u = i + 1;
	rizi = yue[i] + 12;
			a = rizi % 7;
			if ((w == 1) && (a == 4))
			{
				System.out.printf("%d\n",u);
			}
			else if ((w == 2) && (a == 3))
			{
		System.out.printf("%d\n",u);
			}
			else if ((w == 3) && (a == 2))
			{
		System.out.printf("%d\n",u);
			}
			else if ((w == 4) && (a == 1))
			{
		System.out.printf("%d\n",u);
			}
			else if ((w == 5) && (a == 0))
			{
		System.out.printf("%d\n",u);
			}
			else if ((w == 6) && (a == 6))
			{
		System.out.printf("%d\n",u);
			}
			else if ((w == 7) && (a == 5))
			{
		System.out.printf("%d\n",u);
			}
		}
	}
}

