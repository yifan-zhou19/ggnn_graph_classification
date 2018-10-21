package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] shousuo = new int[101];
		int[] shuzhang = new int[101];
		int[] xiaoshi = new int[101];
		int k = 0;
		int t;
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
					shousuo[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shuzhang[i] = Integer.parseInt(tempVar3);
				}
			}
					for (i = 0;i < n;i++)
					{
	xiaoshi[i] = 0;
					}
			for (i = 0;i < n;i++)
			{
				if (shousuo[i] <= 140 && shousuo[i] >= 90 && shuzhang[i] <= 90 && shuzhang[i] >= 60)
				{
	xiaoshi[k]++;
				}
				else
				{
	k++;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (xiaoshi[i] > xiaoshi[0])
				{
	t = xiaoshi[0];
	xiaoshi[0] = xiaoshi[i];
	xiaoshi[i] = t;
				}
			}
			System.out.printf("%d",xiaoshi[0]);
		return 0;
	}



}

