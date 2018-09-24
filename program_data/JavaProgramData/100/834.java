package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String ss = "0";
		final String zimu = "abcdefghijklmnopqrstuvwxyz";
		int count = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ss = tempVar.charAt(0);
		}
		int n = ss.length();
		for (int j = 0;j <= 27;j++)
		{
			  for (int i = 0;i < n;i++)
			  {
				  if (ss.charAt(i) == zimu.charAt(j))
				  {
					  count += 1;
				  }


			  }
			  if (count != 0)
			  {
					  System.out.printf("%c=%d\n",zimu.charAt(j),count);

			  }
				  if (count == 0)
				  {
					  s += 1;
					  continue;
				  }
	count = 0;

		}
		if (s == 28)
		{
			System.out.print("No");
		}
		return 0;
	}

}

