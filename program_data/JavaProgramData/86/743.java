package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int a;
		int num;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String chi = new String(new char[1000]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				total = a + 3 * j;
				if (total > 60)
				{
				break;
				}
			}
			chi = new Scanner(System.in).nextLine();
			if (total <= 62 && total >= 60)
			{
				num = total - 3 * j;
				System.out.printf("%d\n",num);
			}
			else if (total < 60)
			{
				num = 60 - 3 * m;
				System.out.printf("%d\n",num);
			}
			else
			{
				num = 60 - 3 * (j - 1);
				System.out.printf("%d\n",num);
			}
		}
	}
}

