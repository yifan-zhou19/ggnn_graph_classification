package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int j;
	int a;
	int b = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 3;i < n - 1;i++)
	{
		for (j = 2;j < i;j++)
		{
			a = j;
			if (i % j == 0)
			{
				break;
			}
		}
			if (a == i - 1)
			{
			for (j = 2;j < i + 2;j++)
			{
			   a = j;
			   if ((i + 2) % j == 0)
			   {
				   break;
			   }
			}
			}
		if (a == i + 1)
		{
			System.out.printf("%d %d\n",i,i + 2);
		b++;
		}
	}
	if (b == 0)
	{
		System.out.print("empty");
	}
	return 0;
	}
}

