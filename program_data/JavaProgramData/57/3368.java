package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int Strlen;
		char[][] word = new char[100][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		  for (i = 0;i < n;i++)
		  {
			  Strlen = String.valueOf(word[i]).length();
		  if (word[i][Strlen - 1] == 'g')
		  {
		  for (j = 0;j < Strlen - 3;j++)
		  {
			  System.out.printf("%c",word[i][j]);
		  }
		  }
		  else
		  {
		   for (j = 0;j < Strlen - 2;j++)
		   {
			  System.out.printf("%c",word[i][j]);
		   }
		  }
		   System.out.print("\n");
		  }
		  return 0;
	}

}

