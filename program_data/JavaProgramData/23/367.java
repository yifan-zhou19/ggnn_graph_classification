package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int j = 0;
		int count = 1;
		while (cin.get(a[i][j])) //????
		{
		  if (a[i][j] == ' ')
		  {
			  i++;
			  j = 0;
			  count++;
		  } //????????????
		  else if (a[i][j] == '\n')
		  {
			  break; //?????????
		  }
		  else
		  {
			  j++;
		  }
		} //???a????????????
		if (count == 1) //??
		{
			for (i = 0;i < 10;i++)
			{
			if (a[count - 1][i] == '\n')
			{
				break;
			}
		 else
		 {
			 System.out.print(a[count - 1][i]);
		 }
			}
		}
		if (count != 1)
		{
			for (i = 0;i < 10;i++) //????????
			{
			if (a[count - 1][i] == '\n')
			{
				break;
			}
		 else
		 {
			 System.out.print(a[count - 1][i]);
		 }
			}
		 System.out.print(" ");
		}
		for (i = count - 2;i > 0;i--) //??????
		{
			  for (j = 0;j < 10;j++)
			  {
				System.out.print(a[i][j]);
				if (a[i][j] == ' ')
				{
					break;
				}
			  }
		}
		if (count != 1) //???????
		{
			for (i = 0;i < 10;i++)
			{
		  if (a[0][i] == ' ')
		  {
			  break;
		  }
		  else
		  {
			  System.out.print(a[0][i]);
		  }
			}
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}


}

