package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int nian;
	int yue;
	int ri;
	int leap;
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		nian = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		yue = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		ri = Integer.parseInt(tempVar3);
	}
	switch (yue)
	{
	case 1:
		sum = 0;
	break;
	case 2:
		sum = 31;
	break;
	case 3:
		sum = 59;
	break;
	case 4:
		sum = 90;
	break;
	case 5:
		sum = 120;
	break;
	case 6:
		sum = 151;
	break;
	case 7:
		sum = 181;
	break;
	case 8:
		sum = 212;
	break;
	case 9:
		sum = 243;
	break;
	case 10:
		sum = 273;
	break;
	case 11:
		sum = 304;
	break;
	case 12:
		sum = 334;
	break;

	}
	sum = sum + ri;
	if ((nian % 400 == 0) || (nian % 4 == 0 && nian % 100 != 0))
	{
	leap = 1;
	}
	else
	{
	leap = 0;
	}
	if (leap == 1 && nian > 3 && yue > 2)
	{
	sum++;
	}
	System.out.print(sum);
	System.out.print("\n");

	return 0;
	}


}

