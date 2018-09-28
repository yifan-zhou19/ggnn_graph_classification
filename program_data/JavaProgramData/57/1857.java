package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 char[][] danci = new char[2000][2000];
		int n;
		int i;
		int[] len = new int[2000];
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
			danci[i] = tempVar2.charAt(0);
		}
		len[i] = String.valueOf(danci[i]).length();
		}
		 for (i = 0;i < n;i++)
		 {
		if (danci[i][len[i] - 1] != 'g')
		{
			danci[i][len[i] - 2] = '\0';
		}
		   else
		   {
		   danci[i][len[i] - 3] = '\0';
		   }
		 }
	for (i = 0;i < n;i++)
	{
		 System.out.printf("%s\n",danci[i]);
	}
		return 0;
	}

}

