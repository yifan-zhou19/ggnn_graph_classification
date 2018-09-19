package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int num;
	  int b1;
	  int b2;
	  int b3;
	  int b4;
	  int b5;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  num = Integer.parseInt(tempVar);
	  }
	  b1 = num / 10000;
	  b2 = (num - 10000 * b1) / 1000;
	  b3 = (num - 10000 * b1 - 1000 * b2) / 100;
	  b4 = (num - 10000 * b1 - 1000 * b2 - 100 * b3) / 10;
	  b5 = (num - 10000 * b1 - 1000 * b2 - 100 * b3 - 10 * b4);
	  if (b1 != 0)
	  {
		 System.out.printf("%d%d%d%d%d",b5,b4,b3,b2,b1);
	  }
	  else if (b2 != 0)
	  {
		 System.out.printf("%d%d%d%d",b5,b4,b3,b2);
	  }
	  else if (b3 != 0)
	  {
		 System.out.printf("%d%d%d",b5,b4,b3);
	  }
	  else if (b4 != 0)
	  {
		 System.out.printf("%d%d",b5,b4);
	  }
	  else
	  {
		 System.out.printf("%d",b5);
	  }
	}

}

