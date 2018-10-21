package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum;
		int u;
		int j;
		int k;
		String a = new String(new char[1000]);
		char[][] b = new char[1000][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		sum = a.length();
		for (i = 0;i <= sum - n;i++)
		{
						   for (j = i,k = 0;j < i + n;j++,k++)
						   {
										b[i][k] = a.charAt(j);
						   }
		}
		int[] c = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i <= sum - n;i++)
		{
							 for (j = i;j <= sum - n;j++)
							 {
												 if (strcmp(b[i],b[j]) == 0)
												 {
																		  c[i]++;
												 }
							 }
		}
		int max = c[0];
		for (i = 0;i <= sum - n;i++)
		{
								if (max < c[i])
								{
								max = c[i];
								}
		}
		if (max >= 2)
		{
				  System.out.printf("%d\n",max);
				  for (i = 0;i <= sum - n;i++)
				  {
									   if (c[i] == max)
									   {
													System.out.println(b[i]);
									   }
				  }
		}
		else
		{
		System.out.print("NO");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			u = Integer.parseInt(tempVar3);
		}
		return 0;
	}


}

