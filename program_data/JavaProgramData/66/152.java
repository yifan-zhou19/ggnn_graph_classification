package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long y,m,d,t;
	  int y;
	  int m;
	  int d;
	  int t;
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
	  if (m == 1 || m == 2)
	  {
		  m += 12;
		  y--;
	  }
	  t = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400 + 1) % 7;
	  switch (t)
	  {
		case 0:
			P("Sun.");
			B;
		case 1:
			P("Mon.");
			B;
		case 2:
			P("Tue.");
			B;
		case 3:
			P("Wed.");
			B;
		case 4:
			P("Thu.");
			B;
		case 5:
			P("Fri.");
			B;
		case 6:
			P("Sat.");
			B;
	  }
	}
}

