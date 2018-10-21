package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int nian;
	  int yue;
	  int ri;
	  int t;
	  int tt;
	  int a;
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
	   tt = (nian - 1) * (365 % 7) + (nian - 1) / 4 - (nian - 1) / 100 + (nian - 1) / 400;
	   if (nian % 4 == 0 || (nian % 400 == 0 && nian % 100 != 0))
	   {
		   t = 29;
	   }
		 else
		 {
			   t = 28;
		 }
		switch (yue)
		{
		case 1:
			a = ri;
			break;
		case 2:
			a = 31 + ri;
			break;
		case 3:
			a = 31 + t + ri;
			break;
		case 4:
			a = 31 * 2 + t + ri;
			break;
		case 5:
			a = 31 * 2 + 30 + t + ri;
			break;
		case 6:
			a = 31 * 3 + 30 + t + ri;
			break;
		case 7:
			a = 31 * 3 + 30 * 2 + t + ri;
			break;
	case 8:
		a = 31 * 4 + 30 * 2 + t + ri;
		break;
	case 9:
		a = 31 * 5 + 30 * 2 + t + ri;
		break;
	case 10:
		a = 31 * 5 + 30 * 3 + t + ri;
		break;
	case 11:
		a = 31 * 6 + 30 * 3 + t + ri;
		break;
	default:
		a = 31 * 6 + 30 * 4 + t + ri;
		}


	switch ((a + tt) % 7)
	{
	case 0:
		System.out.print("sun.");
		break;
	case 1:
		System.out.print("Mon.");
		break;
	case 2:
		System.out.print("Tue.");
		break;
	case 3:
		System.out.print("Wed.");
		break;
	case 4:
		System.out.print("Thu.");
		break;
	case 5:
		System.out.print("Fri.");
		break;
	default:
		System.out.print("Sat.");
	}
	return 0;

	}

}

