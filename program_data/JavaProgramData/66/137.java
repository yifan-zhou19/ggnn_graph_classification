package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m;
		int n;
		int t;
		int w;
			 int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
			 if (a % 400 != 0)
			 {
				 m = a / 400 * 400 + 1;
		for (;m < a;m++)
		{
			   if (!((m % 4 == 0 && m % 100 != 0) || m % 400 == 0))
			   {
			   continue;
			   }
			   i = i + 1;
		}
			 }
			 else
			 {
			 m = a - 399;
			 }
			 for (;m < a;m++)
			 {
			   if (!((m % 4 == 0 && m % 100 != 0) || m % 400 == 0))
			   {
			   continue;
			   }
			   i = i + 1;
			 }

			 if (a % 400 != 0)
			 {
				 n = 365 * (a - a / 400 * 400 - 1) + i;
			 }
			 else
			 {
			 n = 365 * 399 + i;
			 }
			 switch (b)
			 {
		case 1:
			t = c;
			break;
		case 2:
			t = c + 31;
			break;
		case 3:
			t = c + 31 + 28;
			break;
		case 4:
			t = c + 31 + 28 + 31;
			break;
		case 5:
			t = c + 31 + 28 + 31 + 30;
			break;
		case 6:
			t = c + 31 + 28 + 31 + 30 + 31;
			break;
		case 7:
			t = c + 31 + 28 + 31 + 30 + 31 + 30;
			break;
			 case 8:
				 t = c + 31 + 28 + 31 + 30 + 31 + 30 + 31;
				 break;
			 case 9:
				 t = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				 break;
			 case 10:
				 t = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				 break;
		case 11:
			t = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			t = c + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			 }
			 if (((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) && (b >= 3))
			 {
			 t = t + 1;
			 }
		w = (n + t) % 7;
			 switch (w)
			 {
		case 0:
			System.out.print("Sun.\n");
			break;
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
			 default:
				 System.out.print("error\n");
			 }
		return 0;
	}
}

