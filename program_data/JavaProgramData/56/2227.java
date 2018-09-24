package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int n;
		int[] b = new int[5];
		int[] tem = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		tem[0] = a;
		for (i = 0;i < 5;i++)
		{
			b[i] = tem[i] % 10;
			tem[i + 1] = (tem[i] - b[i]) / 10;
			if (tem[i + 1] == 0)
			{
				n = i;
				break;
			}
		}
		for (j = 0;j <= n;j++)
		{
			System.out.printf("%d",b[j]);
		}
		return 0;

	}
}

