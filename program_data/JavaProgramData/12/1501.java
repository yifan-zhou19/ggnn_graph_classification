package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int s;
		int t;
		for (;;)
		{
				s = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1;;i++)
			{
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 a[i] = Integer.parseInt(tempVar2);
					 }
				  if (a[i] == 0)
				  {
					  break;
				  }
			}
			t = i;
			for (i = 0;i < t;i++)
			{
				for (j = 0;j < t;j++)
				{
					if (a[j] == (2 * a[i]))
					{
						s += 1;
					}
				}
			}
			 System.out.printf("%d\n",s);
		}
	}
}

