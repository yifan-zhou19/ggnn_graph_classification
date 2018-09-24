package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int num = 1;num <= n;num++)
		{

				if (num % 7 == 0 || (num - 70 <= 9 && num - 70>0) || num % 10 == 7)
				{
					continue;
				}
				sum += num * num;

		}
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
		return 0;
	}
}

