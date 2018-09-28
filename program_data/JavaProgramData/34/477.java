package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		if (s == 1)
		{
		System.out.print("End");
		}
		while (s != 1)
		{
		 if (s % 2 != 0)
		 {
		  t = s;
		  s = t * 3 + 1;
		  System.out.printf("%d*3+1=%d\n",t,s);
		 }
		 if (s % 2 == 0)
		 {
		  t = s;
		  s = t / 2;
		  System.out.printf("%d/2=%d\n",t,s);
		 }
		 if (s == 1)
		 {
		 System.out.print("End");
		 }
		}
		return 0;
	}
}

