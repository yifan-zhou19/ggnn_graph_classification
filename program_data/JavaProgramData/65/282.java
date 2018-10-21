package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int[][] caiquan = new int[max][2];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < 2;j++)
		  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				caiquan[i][j] = Integer.parseInt(tempVar2);
			}
		  }
	  }
	  int a = 0;
	  int b = 0;
	  for (i = 0;i < n;i++)
	  {
		  if ((caiquan[i][0] == 0 && caiquan[i][1] == 1) || (caiquan[i][0] == 1 && caiquan[i][1] == 2) || (caiquan[i][0] == 2 && caiquan[i][1] == 0))
		  {
			  a++;
		  }
		  if ((caiquan[i][1] == 0 && caiquan[i][0] == 1) || (caiquan[i][1] == 1 && caiquan[i][0] == 2) || (caiquan[i][1] == 2 && caiquan[i][0] == 0))
		  {
			  b++;
		  }

	  }
	  if (a > b)
	  {
		  System.out.print("A\n");
	  }
	  else if (a < b)
	  {
		  System.out.print("B\n");
	  }
	  else if (a = b)
	  {
		  System.out.print("Tie\n");
	  }
	  return 0;
	}

}

