package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] n = new int[10];
		int d;
		int i;
		for (i = 0;i < 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < 5;i++)
		{
		if ((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0)
		{
			switch (b[i])
			{
	case 1:
		d = 0;
		break;
	case 2:
		d = 31;
		break;
	case 3:
		d = 60;
		break;
	case 4:
		d = 91;
		break;
	case 5:
		d = 121;
		break;
	case 6:
		d = 152;
		break;
	case 7:
		d = 182;
		break;
	case 8:
		d = 213;
		break;
	case 9:
		d = 244;
		break;
	case 10:
		d = 274;
		break;
	case 11:
		d = 305;
		break;
	case 12:
		d = 335;
		break;
			}
		n[i] = d + c[i];
		System.out.printf("%d\n",n[i]);
		}
			else
			{
	switch (b[i])
	{
	case 1:
		d = 0;
		break;
	case 2:
		d = 31;
		break;
	case 3:
		d = 59;
		break;
	case 4:
		d = 90;
		break;
	case 5:
		d = 120;
		break;
	case 6:
		d = 151;
		break;
	case 7:
		d = 181;
		break;
	case 8:
		d = 212;
		break;
	case 9:
		d = 243;
		break;
	case 10:
		d = 273;
		break;
	case 11:
		d = 304;
		break;
	case 12:
		d = 334;
		break;
	}
	n[i] = d + c[i];
	System.out.printf("%d\n",n[i]);
			}
		}
	}
}

