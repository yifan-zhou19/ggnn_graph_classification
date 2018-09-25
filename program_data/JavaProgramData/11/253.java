package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] a = new int[5];
		int i = 1;
	  while (i <= 5)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }
	  if (y % 4 != 0 || y % 100 == 0 && y % 400 != 0)
	  {
		  switch (m)
		  {
		case 1:
			a[i] = d;
			break;
		case 2:
			a[i] = d + 31;
			break;
		case 3:
			a[i] = d + 31 + 28;
			break;
		case 4:
			a[i] = d + 62 + 28;
			break;
		case 5:
			a[i] = d + 62 + 28 + 30;
			break;
		case 6:
			a[i] = d + 31 * 3 + 30 + 28;
			break;
		case 7:
			a[i] = d + 31 * 3 + 30 * 2 + 28;
			break;
		case 8:
			a[i] = d + 31 * 4 + 30 * 2 + 28;
			break;
		case 9:
			a[i] = d + 31 * 5 + 30 * 2 + 28;
			break;
		case 10:
			a[i] = d + 31 * 5 + 30 * 3 + 28;
			break;
		case 11:
			a[i] = d + 31 * 6 + 30 * 3 + 28;
			break;
		case 12:
			a[i] = d + 31 * 6 + 30 * 4 + 28;
			break;
		  }
	  }
	   else
	   {
		   switch (m)
		   {
		case 1:
			a[i] = d;
			break;
		case 2:
			a[i] = d + 31;
			break;
		case 3:
			a[i] = d + 31 + 29;
			break;
		case 4:
			a[i] = d + 62 + 29;
			break;
		case 5:
			a[i] = d + 62 + 29 + 30;
			break;
		case 6:
			a[i] = d + 31 * 3 + 30 + 29;
			break;
		case 7:
			a[i] = d + 31 * 3 + 30 * 2 + 29;
			break;
		case 8:
			a[i] = d + 31 * 4 + 30 * 2 + 29;
			break;
		case 9:
			a[i] = d + 31 * 5 + 30 * 2 + 29;
			break;
		case 10:
			a[i] = d + 31 * 5 + 30 * 3 + 29;
			break;
		case 11:
			a[i] = d + 31 * 6 + 30 * 3 + 29;
			break;
		case 12:
			a[i] = d + 31 * 6 + 30 * 4 + 29;
			break;
		   }
	   }
	   i = i + 1;
	  }
	   System.out.printf("%d\n%d\n%d\n%d\n%d\n%",a[1],a[2],a[3],a[4],a[5]);
	   return 0;
	}



}

