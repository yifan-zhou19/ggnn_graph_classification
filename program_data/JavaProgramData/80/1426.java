package <missing>;

public class GlobalMembers
{
	public static final int[][] dom =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int Main()
	{
	  int sy;
	  int sm;
	  int sd;
	  int ey;
	  int em;
	  int ed;
	  int ans;
	  int i;
	  int flag;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  sy = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sm = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  sd = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  ey = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  em = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  ed = Integer.parseInt(tempVar6);
	  }
	  ans = 365 * (ey - sy + 1);
	  for (i = sy;i <= ey;i++)
	  {
		if (!(i % 4) && (i % 100) || !(i % 400))
		{
			ans++;
		}
	  }
	  if (sm > 1)
	  {
		if (!(sy % 4) && (sy % 100) || !(sy % 400))
		{
			flag = 1;
		}
		else
		{
			flag = 0;
		}
		for (i = 1;i < sm;i++)
		{
		  ans -= dom[flag][i];
		}
	  }
	  if (em < 12)
	  {
		if (!(ey % 4) && (ey % 100) || !(ey % 400))
		{
			flag = 1;
		}
		else
		{
			flag = 0;
		}
		for (i = em + 1;i <= 12;i++)
		{
		  ans -= dom[flag][i];
		}
	  }
	  ans -= sd;
	  if (!(ey % 4) && (ey % 100) || !(ey % 400))
	  {
		  flag = 1;
	  }
	  else
	  {
		  flag = 0;
	  }
	  ans -= dom[flag][em] - ed;
	  System.out.printf("%d",ans);
	}

}

