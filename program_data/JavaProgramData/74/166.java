package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int chush;
		int yush;
		int sush;
		int weish;
		int[] meiwei = new int[10];
		int geshu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (chush = 2,sush = 1;chush <= i / 2;chush++)
			{
				if (i % chush == 0)
				{
					sush = 0;
				}
			}
			if (sush == 1)
			{
				weish = (int)Math.log10(i) + 1;
				for (k = i,j = 0;j < weish;j++)
				{
					meiwei[j] = k % 10;
					k = k / 10;
				}
				for (k = 0,j = 0;j < weish;j++)
				{
					k = k + meiwei[weish - 1 - j] * (int)Math.pow(10,j);
				}
				if (i == k)
				{
					System.out.printf("%d",i);
					geshu++;
					break;
				}
			}
		}
		for (i++;i <= n;i++)
		{
			for (chush = 2,sush = 1;chush <= i / 2;chush++)
			{
				if (i % chush == 0)
				{
					sush = 0;
				}
			}
			if (sush == 1)
			{
				weish = (int)Math.log10(i) + 1;
				for (k = i,j = 0;j < weish;j++)
				{
					meiwei[j] = k % 10;
					k = k / 10;
				}
				for (k = 0,j = 0;j < weish;j++)
				{
					k = k + meiwei[weish - 1 - j] * (int)Math.pow(10,j);
				}
				if (i == k)
				{
					System.out.printf(",%d",i);
					geshu++;
				}
			}
		}
		if (geshu == 0)
		{
			System.out.print("no");
		}
	}
}

