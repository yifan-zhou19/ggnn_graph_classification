package <missing>;

public class GlobalMembers
{
	public static int fanxushu(int x)
	{
		int j;
		int a;
		int[] shuzu = new int[10];
		int k;
		int l;
		a = Math.abs(x);
		for (j = 0;j < 10;j++)
		{
			shuzu[j] = (a % (int)Math.pow(10,j + 1)) / (int)Math.pow(10,j);
		}
		for (j = 0;j < 10;j++)
		{
			if (shuzu[j] != 0)
			{
				k = j;
				break;
			}
		}
		for (j = 9;j >= 0;j--)
		{
			if (shuzu[j] != 0)
			{
				l = j;
				break;
			}
		}
		for (j = 0;;j++)
		{
			System.out.printf("%d",shuzu[k + j]);
			if (k + j == l)
			{
				break;
			}
		}
		return 0;
	}
	public static int Main()
	{
		int i;
		int shuru;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				shuru = Integer.parseInt(tempVar);
			}
			if (shuru == 0)
			{
				System.out.print("0\n");
			}
			if (shuru > 0)
			{
				fanxushu(shuru);
				System.out.print("\n");
			}
			if (shuru < 0)
			{
				System.out.print("-");
				fanxushu(shuru);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

