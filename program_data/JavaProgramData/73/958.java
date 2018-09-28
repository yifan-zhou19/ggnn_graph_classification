package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int an;
	 int hang;
	 int lie;
	 int i;
	 int r;
	 int[][] a = new int[5][5];
	 int paohuierhao = 0;
	 for (i = 0;i < 5;i++)
	 {
	  for (r = 0;r < 5;r++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i][r] = Integer.parseInt(tempVar);
	  }
	  }
	 }
	 for (i = 0;i < 5;i++)
	 {
	  int paohui = 0;
	  an = a[i][0];
	  hang = i + 1;
	  lie = 1;
	  for (r = 0;r < 5;r++)
	  {
	   if (an < a[i][r])
	   {
		an = a[i][r];
		lie = r + 1;
	   }
	  }
	  for (r = 0;r < 5;r++)
	  {
	   if (an > a[r][lie-1])
	   {
		paohui++;
		break;
	   }
	  }
	  if (paohui == 0)
	  {
	   System.out.printf("%d %d %d",hang,lie,an);
	   paohuierhao++;
	  }
	 }
	if (paohuierhao == 0)
	{
	System.out.print("not found");
	}
	return 0;
	}
}

