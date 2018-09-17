package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int m;
		int day;
		int i;
		int x;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 switch (m)
		 {
		 case 1:
			 i = 0;
			 break;
		 case 2:
			 i = 31;
			 break;
		 case 3:
			 i = 31 + 28;
			 break;
		 case 4:
			 i = 31 + 28 + 31;
			 break;
		 case 5:
			 i = 31 + 28 + 31 + 30;
			 break;
		 case 6:
			 i = 31 + 28 + 31 + 30 + 31;
			 break;
		 case 7:
			 i = 31 + 28 + 31 + 30 + 31 + 30;
			 break;
		 case 8:
			 i = 31 + 28 + 31 + 30 + 31 + 30 + 31;
			 break;
		 case 9:
			 i = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			 break;
		 case 10:
			 i = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			 break;
		 case 11:
			 i = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			 break;
		 case 12:
			 i = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			 break;
		 default:
			 System.out.print("error");
			 System.out.print("\n");
		 }
		 if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		 {
			 if ((m != 1) && (m != 2))
			 {
			 x = i + day + 1;
			 }
			 else
			 {
				 x = i + day;
			 }
		 }
		 else
		 {
			 x = i + day;
		 }
		 System.out.print(x);
		 System.out.print("\n");
		 return 0;
	}



}

