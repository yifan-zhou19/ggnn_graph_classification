package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int f = 0;
		int c;
		int d;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct aut
	//	{
	//		int num;
	//	  char wrt[26];
	//	}
	//	a[999];
		char[] wr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] g = new int[26];
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
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].wrt = tempVar3;
			}
			c = String.valueOf(a[i].wrt).length();
			for (j = 0;j < c;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (a[i].wrt[j] == wr[k])
					{
						g[k] = g[k] + 1;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
		  if (f < g[i])
		  {
			  f = g[i];
			  d = i;
		  }
		}

		System.out.printf("%c\n%d\n",wr[d],f);
		for (i = 0;i < n;i++)
		{
			c = String.valueOf(a[i].wrt).length();
			for (j = 0;j < c;j++)
			{
				if (a[i].wrt[j] == wr[d])
				{
					System.out.printf("%d\n",a[i].num);
					break;
				}
			}
		}
		return 0;
	}


}

