package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int m = 0;
			int n = 0;
			int i = 0;
			int pre = 0;
			int numberOut = 0;
			int[] in = new int[300];
			int count = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			while (!(m == 0 && n == 0))
			{
				   for (i = 0; i < n; i++)
				   {
						   in[i] = 1;
				   }
				   i = 0;
				   while (numberOut < n - 1)
				   {
						   while (count < m)
						   {
								   if (in[i] == 1)
								   {
										  count++;
								   }
								   pre = i;
								   i = (i + 1) % n;
						   }
						   in[pre] = 0;
						   numberOut++;
						   count = 0;
				   }
				   for (i = 0; i < n; i++)
				   {
						   if (in[i] == 1)
						   {
								   System.out.printf("%d\n", i + 1);
						   }
				   }
				   numberOut = 0;
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   n = Integer.parseInt(tempVar3);
				   }
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   m = Integer.parseInt(tempVar4);
				   }
			}
			return 0;
	}
}

