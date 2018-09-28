package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] h = new int[50];
		char[][] s = new char[50][255];
		char[][] sz = new char[50][255];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s[i] = tempVar2.charAt(0);
			 }
			 h[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
		if (s[i][h[i] - 1] == 'r')
		{
			for (k = 0;k < h[i] - 2;k++)
			{
				sz[i][k] = s[i][k];
			}
		}
		if (s[i][h[i] - 1] == 'y')
		{
			for (k = 0;k < h[i] - 2;k++)
			{
				sz[i][k] = s[i][k];
			}
		}
		if (s[i][h[i] - 1] == 'g')
		{
			for (k = 0;k < h[i] - 3;k++)
			{
				sz[i][k] = s[i][k];
			}
		}
		}
		 for (i = 0;i < n;i++)
		 {
						  System.out.println(sz[i]);
		 }
						  return 0;
	}

}

