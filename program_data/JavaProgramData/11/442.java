package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int a;
			 int b;
			 int c;
			 int d;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 b = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 c = Integer.parseInt(tempVar3);
			 }
			 if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			 {
				 switch (b)
				 {
				 case 1:
				 {
				 d = c;
			 break;
				 }
				 case 2:
				 {
						 d = 31 + c;
					 break;
				 }
				 case 3:
				 {
						 d = 31 + 29 + c;
					 break;
				 }
				 case 4:
				 {
						 d = 31 + 29 + 31 + c;
					 break;
				 }
				 case 5:
				 {
						 d = 31 + 29 + 31 + 30 + c;
					 break;
				 }
				 case 6:
				 {
						 d = 31 + 29 + 31 + 30 + 31 + c;
					 break;
				 }
				 case 7:
				 {
						 d = 31 + 29 + 31 + 30 + 31 + 30 + c;
					 break;
				 }
				 case 8:
				 {
						 d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + c;
					 break;
				 }
				 case 9:
				 {
						 d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + c;
					 break;
				 }
				case 10:
				{
						d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
					break;
				}
				case 11:
				{
						d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
					break;
				}
				case 12:
				{
						d = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
					break;
				}
				 }
			 System.out.printf("%d",d);
			 }
			 else
			 {
				 switch (b)
				 {
				 case 1:
				 {
				 d = c;
			 break;
				 }
				 case 2:
				 {
						 d = 31 + c;
					 break;
				 }
				 case 3:
				 {
						 d = 31 + 28 + c;
					 break;
				 }
				 case 4:
				 {
						 d = 31 + 28 + 31 + c;
					 break;
				 }
				 case 5:
				 {
						 d = 31 + 28 + 31 + 30 + c;
					 break;
				 }
				 case 6:
				 {
						 d = 31 + 28 + 31 + 30 + 31 + c;
					 break;
				 }
				 case 7:
				 {
						 d = 31 + 28 + 31 + 30 + 31 + 30 + c;
					 break;
				 }
				 case 8:
				 {
						 d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + c;
					 break;
				 }
				 case 9:
				 {
						 d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + c;
					 break;
				 }
				case 10:
				{
						d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c;
					break;
				}
				case 11:
				{
						d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c;
					break;
				}
				case 12:
				{
						d = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c;
					break;
				}
				 }
				 System.out.printf("%d",d);
			 }
	return 0;
	}

}

