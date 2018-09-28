package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct point
	//  {
	//	int hen,shu,shumu;
	//  }
	//  s[81];
	  int a;
	  int b;
	  int i;
	  int j;
	  int k;
	  int[][] m = new int[4][81];
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
	  for (i = 0;i <= 8;i++)
	  {
		for (j = 0;j <= 8;j++)
		{
		  s[9 * i + j].hen = i;
		  s[9 * i + j].shu = j;
		  s[9 * i + j].shumu = 0;
		}
	  }
	  s[40].shumu = a;
	  for (i = 0;i <= b - 1;i++)
	  {
		for (j = 0;j <= 80;j++)
		{
		  if (s[j].shumu != 0)
		  {
			for (k = 0;k <= 80;k++)
			{
			   if ((s[k].hen == s[j].hen - 1 || s[k].hen == s[j].hen + 1 || s[k].hen == s[j].hen) && (s[k].shu == s[j].shu + 1 || s[k].shu == s[j].shu - 1 || s[k].shu == s[j].shu))
			   {
				  m[i][k] = m[i][k] + s[j].shumu;
			   }
			}
		  }
		}
		for (k = 0;k <= 80;k++)
		{
		  s[k].shumu = s[k].shumu + m[i][k];
		}
	  }
	  for (i = 0;i <= 8;i++)
	  {
		for (j = 0;j <= 8;j++)
		{
		  if (j == 8)
		  {
			System.out.printf("%d\n",s[9 * i + j].shumu);
		  }
		  else
		  {
			System.out.printf("%d ",s[9 * i + j].shumu);
		  }
		}
	  }
	}
}

