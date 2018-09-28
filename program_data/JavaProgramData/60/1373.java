package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			   System.out.print("empty");
		}
		else
		{
			for (i = 5;i <= n;i++)
			{
					  for (a = 2;a < (i - 2);a++)
					  {
									  if (i % a == 0 || (i - 2) % a == 0)
									  {
									  break;
									  }
									  if (a == i - 3)
									  {
												x = i - 2,y = i;
												System.out.printf("%d %d\n",x,y);
									  }
					  }
			}
		}
	}
}

