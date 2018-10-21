package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char[][] s = new char[100][100];
	  int n;
	  int[] len = new int[100];
	  int i;
	  int j;
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
		  s[i] = tempVar2.charAt(0);
	  }
	  len[i] = String.valueOf(s[i]).length();
	  if ((s[i][len[i] - 2] == 'e' && s[i][len[i] - 1] == 'r') || (s[i][len[i] - 2] == 'l' && s[i][len[i] - 1] == 'y'))
	  {
		 s[i][len[i] - 2] = 0;
		 s[i][len[i] - 1] = 0;
	  }
		 else if (s[i][len[i] - 3] == 'i' && s[i][len[i] - 2] == 'n' && s[i][len[i] - 1] == 'g')
		 {
				s[i][len[i] - 3] = 0;
				s[i][len[i] - 2] = 0;
				s[i][len[i] - 1] = 0;
		 }
	  }
			   for (i = 0;i < n - 1;i++)
			   {
						System.out.print(s[i]);
						System.out.print("\n");
			   }
						System.out.print(s[n - 1]);

	  return 0;
	}

}

