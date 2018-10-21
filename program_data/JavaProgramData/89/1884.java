package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //flg??????????????????0?????1
		int a;
		int b;
		int i;
		int flg = 1;
		int[] num = new int[MAX]; //num????????????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++) //??????????0
		{
			num[i] = 0;
		}
		while (true)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
			if (a == 0 && b == 0) //?0 0????????
			{
				break;
			}
			else
			{
				num[b] = num[b] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] == n - 1) //??n-1?????????????????
			{
					System.out.printf("%d",i);
				flg = 0;
				break;
			}
		}
		if (flg != 0)
		{
			System.out.print("NOT FOUND");
		}
	}
}

