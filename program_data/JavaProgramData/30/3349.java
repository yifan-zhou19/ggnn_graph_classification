package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
			   continue;
			}
			else
			{
			   if (i % 10 == 7 || i / 10 == 7)
			   {
			   continue;
			   }
			   else
			   {
			   sum += i * i;
			   }
			}
		}
			System.out.printf("%d",sum);
	}
}

