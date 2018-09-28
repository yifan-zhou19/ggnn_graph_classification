package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long y,w;
	 int y;
	 int w;
	 int m;
	 int d;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 d = Integer.parseInt(tempVar3);
	 }
	 if (m == 1)
	 {
		 m = 13;
		 y = y - 1;
	 }
	 if (m == 2)
	 {
		 m = 14;
		 y = y - 1;
	 }
	 w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400 + 1) % 7;
	 switch (w)
	 {
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
	  case 6:
		  System.out.print("Sat.");
		  break;
	  case 0:
		  System.out.print("Sun.");
		  break;
	 }
	 if (w > 6 || w < 0)
	 {
		 System.out.printf("%d",w);
	 }
	}
}

