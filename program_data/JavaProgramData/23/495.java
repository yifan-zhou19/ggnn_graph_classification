package <missing>;

public class GlobalMembers
{
	//7. ???? ??? 20121109

	public static char[][] Str = new char[100][100]; //?????

	public static int Main()
	{
		  int wordCount = 0;
		  int i = 0;
		  char a; //??????
		  cin.get(a);

		  while (a != '\n')
		  {
			  while (a != ' ' && a != '\n')
			  {
				  Str[wordCount][i] = a;
				  i++;
				  cin.get(a);
			  }
			  wordCount++;
			  i = 0;
			  if (a != '\n')
			  {
				  cin.get(a);
			  }
		  }

		  for (i = 99;i > 0;i--)
		  {
			if (Str[i][0] != '\0')
			{
				break;
			}
		  }

		  for (;i > 0;i--)
		  {
		  System.out.print(Str[i]);
		  System.out.print(' ');
		  }

		  System.out.print(Str[0]);

		  return 0;
	}

}
