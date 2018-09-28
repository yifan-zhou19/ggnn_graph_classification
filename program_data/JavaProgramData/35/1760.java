package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	 int a;
	 int b;
	 int i;
	 int x;
	 int y;
	 int[][] sz = new int[8][8];
	 int tag;
	 int col;
	 int row;
	 int p;

	 char c;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar2 != null)
	 {
		 c = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }

	 for (x = 0;x < a;x++)
	 {

	  for (y = 0;y < b;y++)
	  {

	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   sz[x][y] = Integer.parseInt(tempVar4);
	   }

	  }

	 }

	 for (x = 0;x < a;x++)
	 {

	  i = sz[x][0];

	  col = 0;

	  row = 0;

	  tag = 0;

	  for (y = 0;y < b;y++)
	  {

	   if (sz[x][y] > i)
	   {

		i = sz[x][y];

		col = x;

		row = y;

	   }

	  }

	  for (p = 0;p < a;p++)
	  {

	   if (i > sz[p][row])
	   {

		break;
	   }

	   else
	   {

		tag = tag + 1;
	   }

	  }

	  if (tag == a)
	  {

	   System.out.printf("%d+%d",col,row);

	   break;

	  }

	 }

	 if (x == a)
	 {

	  System.out.print("No");

	 }



	 return 0;

	}


}

