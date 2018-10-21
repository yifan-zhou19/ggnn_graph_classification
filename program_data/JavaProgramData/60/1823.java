package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[5000];
		int n;
		int i;
		int j;
		int k;
		int u;
		int s = 0;
		int l = 0;
		m[0] = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3,j = 1;i <= n;i++)
		{
			   for (k = 0;m[k] * m[k] < i;k++)
			   {
			   if (i % m[k] == 0)
			   {
				   break;
			   }
			   }
			   if (m[k] * m[k] > i)
			   {
				 m[j] = i;
				 j++;
			   }
		}
		while (s < i / 2)
		{
		  u = m[s + 1] - m[s];
		  if (u == 2)
		  {
			 System.out.printf("%d %d\n",m[s],m[s + 1]);
			 l = l + 1;
		  }
		  s++;
		}
		if (l == 0)
		{
		System.out.print("empty\n");
		}
		return 0;
	}

}

