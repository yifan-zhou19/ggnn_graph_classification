package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] p = new char[1000][30];
		int i;
		int n = 0;
		int[] sum = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2.charAt(0);
			}
			sum[i] = String.valueOf(p[i]).length();
		}
		int count = 0;
		for (i = 0;i < n;i++)
		{
			if (count == 0)
			{
				System.out.printf("%s",p[i]);
				count = count + sum[i];
			}
			else if (count + sum[i] < 80)
			{
				System.out.printf(" %s",p[i]);
				count = count + sum[i] + 1;
			}
			else if (count + sum[i] >= 80)
			{
				System.out.print("\n");
				count = sum[i];
				System.out.printf("%s",p[i]);
			}
		}
	}
}

