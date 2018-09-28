package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sushu = int i;
		int a = 0;
		int b;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 3;
		for (i;i <= n - 2;i++)
		{
		 if ((sushu(i) == 0) && (sushu(i + 2) == 0))
		 {
			System.out.printf("%d %d\n",i,i + 2);
		a++;
		 }
		}
					if (0 == a)
					{
		System.out.print("empty");
					}
	}

	public static int sushu(int i)
	{
		int w = 3;
	for (w;w <= i;w++)
	{
	if (i % w == 0)
	{
		break;
	}
	}
	if (w == i)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	}

}

