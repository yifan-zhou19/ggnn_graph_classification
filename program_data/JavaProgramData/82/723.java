package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] shousuo = new int[100];
		int[] shuzhang = new int[100];
		int[] zanshi = new int[100];
		int i;
		int j;
		int e;
		j = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shuzhang[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (shousuo[i] >= 90 && shousuo[i] <= 140 && shuzhang[i] >= 60 && shuzhang[i] <= 90 && i < n - 1)
			{
				j = j + 1;
				zanshi[i] = 0;
			}
			else if (shousuo[i] >= 90 && shousuo[i] <= 140 && shuzhang[i] >= 60 && shuzhang[i] <= 90 && i == n - 1)
			{
				j = j + 1;
				zanshi[i] = j;
			}
			else if (shousuo[i] < 90 || shousuo[i]>140 || shuzhang[i] < 60 || shuzhang[i]>90)
			{
				zanshi[i] = j;
				j = 0;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (zanshi[i] > zanshi[i + 1])
			{
				e = zanshi[i];
				zanshi[i] = zanshi[i + 1];
				zanshi[i + 1] = e;
			}
		}
		System.out.printf("%d",zanshi[n - 1]);
		return 0;
	}
}

