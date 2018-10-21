package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] number = new int[1001];
	int i;
	int p;
	int count;
	int start;
	int end;
	count = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		start = 0;
		end = 0;
		for (p = 1;p <= n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[p] = Integer.parseInt(tempVar2);
			}
		}
		for (p = 1;p <= n - 1;p++)
		{
			if (start == 0 && number[p] == 0 && (p == 1 || number[p - 1] != 0) && number[p + 1] != 0)
			{
				start = p;
			}
			if (start != 0 && number[p] == 0 && (p == 1 || number[p - 1] != 0) && number[p + 1] != 0)
			{
				end = p;
			}
		}
		if (end - start <= 1)
		{
			continue;
		}
		count += (end - start - 1);



	}
	System.out.printf("%d",count);
	return 0;
	}
}

