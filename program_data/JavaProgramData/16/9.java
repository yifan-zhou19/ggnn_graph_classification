package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[5];
		a = 100000;
		for (i = 0;i <= 4;i++)
		{
			a = a / 10;
			num[i] = (n / a) % 10;
		}
		if (num[0] != 0)
		{
			System.out.printf("%d%d%d%d%d",num[4],num[3],num[2],num[1],num[0]);
		}
		else if (num[1] != 0)
		{
			System.out.printf("%d%d%d%d",num[4],num[3],num[2],num[1]);
		}
		else if (num[2] != 0)
		{
			System.out.printf("%d%d%d",num[4],num[3],num[2]);
		}
		else if (num[3] != 0)
		{
			System.out.printf("%d%d",num[4],num[3]);
		}
		else
		{
			System.out.printf("%d",num[4]);
		}
	}
}

