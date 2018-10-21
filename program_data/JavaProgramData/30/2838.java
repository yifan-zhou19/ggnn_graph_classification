package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int a;
	 s = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	for (i = 1;i <= n;i++)
	{
			a = (i - i % 10) / 10;
		if (i % 7 == 0)
		{
		  continue;
		}
		else if (i % 10 == 7)
		{
		continue;

		}
		else if (a == 7)
		{
			continue;
		}
		s = s + i * i;
	}
	   System.out.printf("%d",s);
		return 0;
	}


}

