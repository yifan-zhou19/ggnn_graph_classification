package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  int flag = 1;
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = m;i > 0 && flag != 0;i /= 2)
	  {
	   for (j = n;j > 0 && flag != 0;j /= 2)
	   {
		if (i == j)
		{
			 System.out.print(i);
			 flag = 0;
		} //???????????????????????
	   }
	  }
	  return 0;
	}


}

