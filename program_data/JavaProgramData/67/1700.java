package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double jw;
		double othr;
		double othf;
		double oths;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				othr = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				othf = Double.parseDouble(tempVar3);
			}
			if (i == 0)
			{
				jw = othf / othr;
			}
			else
			{
				   oths = othf / othr;
				   if ((oths - jw) <= 0.05 && (jw - oths) <= 0.05)
				   {
					  System.out.print("same\n");
				   }
				   else if (oths < jw)
				   {
					  System.out.print("worse\n");
				   }
				   else
				   {
					   System.out.print("better\n");
				   }
			}
		}
		return 0;
	}
}

