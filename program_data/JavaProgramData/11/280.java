package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		int[] ts = new int[5];
		int i;
		for (i = 1;i <= 5;i++)
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
		for (i = 1;i <= 5;i++)
		{
		switch (b[i])
		{
	case 1:
		ts[i] = c[i];
		break;
	case 2:
		ts[i] = c[i] + 31;
		break;
	case 3:
		ts[i] = c[i] + 59;
		break;
	case 4:
		ts[i] = c[i] + 90;
		break;
	case 5:
		ts[i] = c[i] + 120;
		break;
	case 6:
		ts[i] = c[i] + 151;
		break;
	case 7:
		ts[i] = c[i] + 181;
		break;
	case 8:
		ts[i] = c[i] + 212;
		break;
	case 9:
		ts[i] = c[i] + 243;
		break;
	case 10:
		ts[i] = c[i] + 273;
		break;
	case 11:
		ts[i] = c[i] + 304;
		break;
	case 12:
		ts[i] = c[i] + 334;
		break;
		}

		if ((a[i] % 4 == 0 && a[i] % 100 != 0 || a[i] % 400 == 0) && b[i] > 2)
		{
			ts[i] = ts[i] + 1;
		}

		System.out.printf("%ld",ts[i]);
		System.out.print("\n");

		}
		return 0;
	}

}

