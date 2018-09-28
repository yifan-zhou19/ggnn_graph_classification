package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] pp;
		  pp = new int[n];
		  for (i = 0;i < n;i++)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  pp[i] = (int)malloc(20 * (Integer.SIZE / Byte.SIZE));
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  pp[i][0] = Integer.parseInt(tempVar2);
			  }
			  if (pp[i][0] != 0)
			  {
			  for (j = 1;j <= pp[i][0];j++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  pp[i][j] = Integer.parseInt(tempVar3);
				  }
			  }
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			if (pp[i][0] != 0)
			{
			 for (j = pp[i][0];;)
			 {
				 if (pp[i][j] + 3 * j <= 60)
				 {
				   System.out.printf("%d\n",60 - j * 3);
				   break;
				 }
			  else if (pp[i][j] + 3 * j - 3 < 60)
			  {
				   System.out.printf("%d\n",pp[i][j]);
				   break;
			  }
			  else
			  {
				  j--;
			  }
			 }
			}
			else
			{
				System.out.print("60\n");
			}

		  }
	}

}

