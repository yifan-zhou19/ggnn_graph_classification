package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int l;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
			   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= 4; i++)
		{
			for (j = 0;j <= 4; j++)
			{
			  for (l = 0;l <= 4; l++)
			  {
				  if (l != j && a[i][l] >= a[i][j] != 0 || l != i && a[i][j] >= a[l][j])
				  {
					  break;
				  }
			  }
				  if (l <= 4)
				  {
					  continue;
				  }
				  System.out.print(i + 1);
				  System.out.print(" ");
				  System.out.print(j + 1);
				  System.out.print(" ");
				  System.out.print(a[i][j]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto end;
			}
		}
		System.out.print("not found");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
		return 0;
	}
}

