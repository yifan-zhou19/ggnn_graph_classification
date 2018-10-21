package <missing>;

public class GlobalMembers
{
	public static String[] name = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat.", "Sun."};
	public static int Main()
	{
	  int D;
	  int M;
	  int Y;
	  int A;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  Y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  M = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  D = Integer.parseInt(tempVar3);
	  }
	  if ((M == 1) || (M == 2))
	  {
		M += 12;
		Y--;
	  }
	  A = (D + 2 * M + 3 * (M + 1) / 5 + Y + Y / 4 - Y / 100 + Y / 400) % 7;
	  System.out.printf("%s\n",name[A]);
	}

}

