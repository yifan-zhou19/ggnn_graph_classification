package <missing>;

public class GlobalMembers
{
	public static int yes(int p)
	{
		if (p % 2 == 0)
		{
			if (p == 2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		for (int i = 3;i <= Math.sqrt(p);i += 2)
		{
			if (p % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;i = i + 2)
	  {
	  for (j = 3;j <= i / 2;j = j + 2)
	  {
			if (yes(j) != 0 && yes(i - j) != 0)
			{
		  System.out.printf("%d=%d+%d\n",i,j,i - j);
	  break;
			}
		else
		{
			continue;
		}
	  }
	  }

	}


}

