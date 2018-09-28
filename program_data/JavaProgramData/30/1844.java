package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum;
		int n = 100;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sum = Integer.parseInt(tempVar3);
		}
		for (i = 0; i <= n; i++)
		{
		  if (i % 7 == 0 || i == 17 || i == 27 || i == 37 || i == 47 || i == 57 || i == 67 || i == 87 || i == 97 || i == 71 || i == 72 || i == 73 || i == 74 || i == 75 || i == 76 || i == 78 || i == 79)
		  {
			continue;
		  }
		  else
		  {
				sum += i * i;
		  }
		};
		System.out.printf("%d", sum);
		return 0;
	}
}

