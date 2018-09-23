package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int c;
	  int ans = 0;
	  int flag = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		for (j = 1;j <= n;j++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = Integer.parseInt(tempVar2);
		  }
		  if (c == 0)
		  {
			if (flag != 0)
			{
			  ans = ans + j - flag - 1;
			  flag = 0;
			}
			else
			{
				flag = j;
			}
		  }
		}
		flag = 0;
	  }
	  System.out.printf("%d",ans);
	}
}

