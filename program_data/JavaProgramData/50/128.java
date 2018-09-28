package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int i;
		int n;
		int[] b = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 5)
		{
			a = 1;
		}
		if (n == 6)
		{
			a = 0;
		}
		if (n == 7)
		{
			a = 6;
		}
		else
		{
			a = 6 - n;
		}
		for (i = 0;i < 12;i++)
		{
			if (b[i] % 7 == a)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}
}

