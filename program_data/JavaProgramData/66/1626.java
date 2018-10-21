package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		int w;
		int ye;
		int da;
		int mo;
		int re;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ye = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mo = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			da = Integer.parseInt(tempVar3);
		}
		ye = ye % 2800;
		k = ye / 400;
		j = ye % 400;
		if (mo == 1 || mo == 2)
		{
			mo = mo + 12;
			ye = ye-1;
		}
		w = (da + 1 + 2 * mo + 3 * (mo + 1) / 5 + ye + ye / 4 - ye / 100 + ye / 400) % 7;

	 switch (w)
	 {
	 case 0:
	  System.out.print("Sun.\n");
	  break;
	 case 1:
	  System.out.print("Mon.\n");
	  break;
	 case 2:
	  System.out.print("Tue.\n");
	  break;
	 case 3:
	  System.out.print("Wed.\n");
	  break;
	 case 4:
	  System.out.print("Thu.\n");
	  break;
	 case 5:
	  System.out.print("Fri.\n");
	  break;
	 case 6:
	  System.out.print("Sat.\n");
	  break;
	 }
	return 0;
	}
}

