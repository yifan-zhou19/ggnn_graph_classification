package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int m = 1;
		int a;
		int j;

		while (n != 0 && m != 0)
		{
			a = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}

			int i;
			int[] p = new int[(n + 1)];
			for (i = 1;i <= n;i++)
			{
				p[i] = i;
			}
			int k = n;

			while (k > 1)
			{ //k\n??
				for (i = 1;i <= n;i++)
				{
					if (p[i] != 0)
					{
						 a++;
						 if (a % m == 0)
						 {
							  p[i] = 0;
						   k--;
						 if (k == 1)
						 {
							break;
						 }
						   a = 0;
						 }
					}
				}
			}

		   for (j = 1;j <= n;j++)
		   {
			   if (p[j] != 0)
			   {
			   System.out.printf("%d\n",p[j]);
			   }
		   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		   free(p);
		}

		return 0;
	}
}

