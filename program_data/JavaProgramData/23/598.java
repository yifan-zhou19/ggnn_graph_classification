package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char c;
		  int flag = 1;
		  char[][] word = new char[100][100];
		  int i = 0;
		  int j = 0;
		  int count = 0;
		  while ((c = System.in.read()) != '\n')
		  {
				if (c == ' ' && flag == 1)
				{
					flag = 0;
					word[i][j] = '\0';
					i++;
					j = 0;
					count++;
				}
				if (c != ' ' && c != '\n')
				{
					flag = 1;
					word[i][j] = c;
					j++;
				}
		  }

		  for (int t = count;t >= 0;t--)
		  {
			  if (t > 0)
			  {
				  System.out.printf("%s ",word[t]);
			  }
			  else
			  {
				  System.out.printf("%s",word);
			  }
		  }



	}

}
