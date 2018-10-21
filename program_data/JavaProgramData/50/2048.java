package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int s;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 7)
		{
			System.out.printf("%d\n",1);
		}
		i = 1;
		while (i <= 11)
		{
			s = 0;
			for (j = 1;j <= i;j++)
			{
				s = s + b[j];
			}
			if ((s + 12) % 7 + a == 5 || (s + 12) % 7 + a == 12)
			{
				System.out.printf("%d\n",i + 1);
			}
			i = i + 1;
		}
		return 0;
	}
}

