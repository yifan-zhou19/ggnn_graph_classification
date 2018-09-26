package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int m;
		int n;
		int e;
		int x;
		int[] s = new int[100];
		int[] t = new int[100];
		int v = 0;
		char[][] zfc = new char[100][10];
		char[][] jg = new char[100][10];
		char[][] h = new char[100][10];
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
				zfc[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
		   if (s[i] >= 60)
		   {
			  t[j] = i;
			  j++;
		   }
		}
		for (i = j;i >= 0;i--)
		{
			for (k = 0;k < i - 1;k++)
			{
			   if (s[t[k]] < s[t[k + 1]])
			   {
				 m = t[k + 1];
				 t[k + 1] = t[k];
				 t[k] = m;
			   }
			}
		}
		for (i = 0;i < j;i++)
		{
		  System.out.println(zfc[t[i]]);
		}
		for (i = 0;i < n;i++)
		{
		  if (s[i] < 60)
		  {
			 System.out.println(zfc[i]);
		  }
		}
		return 0;
	}

}

