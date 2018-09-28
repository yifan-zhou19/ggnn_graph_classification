package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] len = new int[100];
		char[][] danci = new char[100][100];

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
			  danci[i] = tempVar2.charAt(0);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  len[i] = String.valueOf(danci[i]).length();
		  if (danci[i][len[i] - 2] == 'l' || danci[i][len[i] - 2] == 'e')
		  {
			  danci[i][len[i] - 2] = '\0';
		  }
		  else if (danci[i][len[i] - 3] == 'i')
		  {
			  danci[i][len[i] - 3] = '\0';
		  }
		  System.out.printf("%s\n",danci[i]);
	  }
		  return 0;
	}

}

