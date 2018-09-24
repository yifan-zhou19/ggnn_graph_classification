package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[26];
		int[] h = new int[26];
		int k;
		int i;
		int j;
		int t = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= k;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  h[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = 1;i <= k;i++)
	  {
						for (j = 1,t = 0;j < i;j++)
						{
											 if (h[j] >= h[i])
											 {
												 if (b[j] > t)
												 {
											  t = b[j];
												 }
											 }
						}
						if (t == 0)
						{
							b[i] = 1;
						}
						else
						{
							b[i] = t + 1;
						}
	  }
	  for (i = 1,t = 0;i <= k;i++)
	  {
							if (b[i] > t)
							{
							t = b[i];
							}
	  }
	  System.out.printf("%d",t);
	  System.in.read();
	  System.in.read();
	}
}

