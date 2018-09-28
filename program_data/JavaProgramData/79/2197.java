package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[10000];
		int[] m = new int[10000];
		int i = 0;
		int[] s = new int[10000];
		int k;
		int l;
		int j;
		int r = 0;
		while (true)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n[i] = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m[i] = Integer.parseInt(tempVar2);
		 }
		  if (m[i] == 0 && n[i] == 0)
		  {
			 break;
		  }
			  k = n[i];
		  for (j = 2; j <= k; j++)
		  {
		   s[i] = (s[i] + m[i]) % j;
		  }
		  i++;
		  r++;
		}
		for (l = 0;l < r;l++)
		{
			 System.out.printf("%d\n",s[l] + 1);
		}
		return 0;
	}
}

