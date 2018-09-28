package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[300];
		int m;
		int i;
		int j;
		int k;
		int r;
		while (true)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   r = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   j = r;
		   if (r == 0 && m == 0)
		   {
			   break;
		   }
		   else
		   {
		   for (i = 0;i < r;i++)
		   {
			   n[i] = i + 1;
		   }
		   i = 0;
		   while (j > 1)
		   {
			   for (k = 1;k < m;k++)
			   {
						while (n[i] == 0)
						{
						if (i < r - 1)
						{
						i = i + 1;
						}
						else
						{
							i = 0;
						}
						}
						if (i < r - 1)
						{
						i = i + 1;
						}
						else
						{
							i = 0;
						}
			   }
					while (n[i] == 0)
					{
						if (i < r - 1)
						{
						i = i + 1;
						}
						else
						{
							i = 0;
						}
					}
						n[i] = 0;
						j = j - 1;
		   }

			   for (i = 0;i < r;i++)
			   {
					if (n[i] != 0)
					{
						System.out.printf("%d",n[i]);
					}
			   }
			   System.out.print("\n");

		   }
		}
	}

}

