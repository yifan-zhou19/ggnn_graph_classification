package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int[] sum = new int[5];
		int i;
		for (i = 0;i < 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < 5;i++)
		{
		switch (b[i])
		{
		case 1:
			sum[i] = 0;
			break;
		case 2:
			sum[i] = 31;
			break;
		case 3:
			sum[i] = 59;
			break;
		case 4:
			sum[i] = 90;
			break;
		case 5:
			sum[i] = 120;
			break;
		case 6:
			sum[i] = 151;
			break;
		case 7:
			sum[i] = 181;
			break;
		case 8:
			sum[i] = 212;
			break;
		case 9:
			sum[i] = 243;
			break;
		case 10:
			sum[i] = 273;
			break;
		case 11:
			sum[i] = 304;
			break;
		case 12:
			sum[i] = 334;
			break;
		}
		sum[i] = sum[i] + c[i];
		if (((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0) && b[i] > 2)
		{
			sum[i] = sum[i] + 1;
		}
		}
		for (i = 0;i < 5;i++)
		{
		System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

