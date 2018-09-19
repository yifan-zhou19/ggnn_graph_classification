package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[101]);
	  String aword = new String(new char[101]);
	  String bword = new String(new char[101]);
	  char[][] words = new char[101][101];
	  str = new Scanner(System.in).nextLine();
	  aword = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  bword = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  int i;
	  int j;
	  int num = 0;
	  int len = str.length();
	  for (i = 0;i < len;i++)
	  {
		j = 0;
		while (str.charAt(i) != ' ')
		{
		 words[num][j] = str.charAt(i);
		 j++;
		 i++;
		}
		 words[num][j] = '\0';
		 num++;
	  }
	  for (i = 0;i < num;i++)
	  {
	   if (strcmp(words[i],aword) == 0)
	   {
		 words[i] = bword;
		 continue;
	   }
	  }


	  for (j = 0;j < num - 1;j++)
	  {
		System.out.print(words[j]);
		System.out.print(" ");
	  }
	  System.out.print(words[num - 1]);
	  System.out.print("\n");
	  return 0;

	}

}

