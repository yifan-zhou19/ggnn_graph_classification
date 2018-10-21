package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x1;
		int x2;
		int[] n = new int[15];
		int y;
		int i;
		int t;
		while (true)
		{
			 //?0?8?0?1?0?8?0?5?0?1?0?7?0?4?0?4?0?8?0?5?0?6?0?6 
			 i = 0;
			 while (true)
			 {
				   String tempVar = ConsoleInput.scanfRead();
				   if (tempVar != null)
				   {
					   t = Integer.parseInt(tempVar);
				   }
				   if (t == -1)
				   {

				   }
				   if (t == 0)
				   {
					   break;
				   }
				   else
				   {
					   n[i] = t;
					   i++;
				   }
			 }
			 y = 0;
			 for (x1 = i - 1;x1 >= 0;x1--)
			 {
				for (x2 = x1 - 1;x2 >= 0;x2--)
				{
				  if (n[x1] == n[x2] * 2 || n[x2] == n[x1] * 2)
				  {
					y += 1;
				  }
				}
			 }
			 System.out.printf("%d\n",y);
		}

	}
}

