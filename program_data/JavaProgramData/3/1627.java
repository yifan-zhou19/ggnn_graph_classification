package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int a;
		int b;
		int[] sz = new int[1000];
		int[] zz = new int[1000];
			 b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
			  for (i = 0;i < n;i++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  sz[i] = Integer.parseInt(tempVar3);
				  }
			  }
			 i = 0;
			 j = 0;
			 while (i < n && j < n)
			 {
				  zz[j] = sz[i];
				  i++;
				  j++;
			 }
			 for (i = 0;i < n;i++)
			 {
				 for (j = 0;j < n;j++)
				 {
					 if (i == j)
					 {
						 continue;
					 }
					if (sz[i] + zz[j] == k)
					{
									a = 1;
					}
					else
					{
									a = 0;
					}
					if (a == 1 || b == 1)
					{
						b = 1;
					}
					else
					{
						b = 0;
					}
				 }
			 }
			 if (b == 1)
			 {
			   System.out.print("yes");
			 }
			 else
			 {
			   System.out.print("no");
			 }
	return 0;
	}

}

