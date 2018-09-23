package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] shu = new int[1000];
		int[] num = new int[26];
		int[] length = new int[1000];
		char[][] author = new char[1000][26];
		char maxauthor;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < m;i++)
		{
		  shu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  author[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  length[i] = String.valueOf(author[i]).length();
		  for (int j = 0;j < length[i];j++) //??????????
		  {
		  num[author[i][j] - 'A'] += 1;
		  }
		}
		int maxnum = 0;
		for (int i = 0;i < 26;i++)
		{
		  if (maxnum < num[i])
		  {
		  maxnum = num[i]; //???????????
		  }
		}
		for (int i = 0;i < 26;i++)
		{
		  if (num[i] == maxnum) //???????????
		  {
			 maxauthor = (char)('A' + i);
			 System.out.print(maxauthor);
			 System.out.print("\n");
			 System.out.print(maxnum);
			 System.out.print("\n");
			 break;
		  }
		}
		for (int i = 0;i < m;i++)
		{
		  for (int j = 0;j < length[i];j++)
		  {
			 if (author[i][j] == maxauthor) //????????
			 {
			 System.out.print(shu[i]);
			 System.out.print("\n");
			 }
		  }
		}
		return 0;
	}


}

