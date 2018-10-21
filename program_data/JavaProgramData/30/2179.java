package <missing>;

public class GlobalMembers
{
	 public static int wuguan(int e)
	 {
		 if (e % 7 == 0)
		 {
			 return 0;
		 }
		  for (int t = e;t > 0;t = t / 10)
		  {
			  int q;
			  q = t % 10;
			  if (q == 7)
			  {
				  return 0;
			  }
		  }
	 return 1;
	 }

	public static int Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			if (wuguan(i) != 0)
			{
				sum += i * i;
			}
		}
		System.out.printf("%d",sum);
	}


}

