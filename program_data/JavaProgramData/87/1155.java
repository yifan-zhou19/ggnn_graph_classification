package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int b1;
		int c1;
		int a2;
		int b2;
		int c2;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			c2 = Integer.parseInt(tempVar6);
		}
		while (a1 != 0 || b1 != 0 || c1 != 0 || a2 != 0 || b2 != 0 || c2 != 0)
		{
			 s += (a2 + 12 - (a1 + 1)) * 3600;
			 s += 3600 - (b1 * 60 + c1);
			 s += 60 * b2 + c2;
			 System.out.printf("%d\n",s);
			 s = 0;
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 a1 = Integer.parseInt(tempVar7);
			 }
			 String tempVar8 = ConsoleInput.scanfRead(" ");
			 if (tempVar8 != null)
			 {
				 b1 = Integer.parseInt(tempVar8);
			 }
			 String tempVar9 = ConsoleInput.scanfRead(" ");
			 if (tempVar9 != null)
			 {
				 c1 = Integer.parseInt(tempVar9);
			 }
			 String tempVar10 = ConsoleInput.scanfRead(" ");
			 if (tempVar10 != null)
			 {
				 a2 = Integer.parseInt(tempVar10);
			 }
			 String tempVar11 = ConsoleInput.scanfRead(" ");
			 if (tempVar11 != null)
			 {
				 b2 = Integer.parseInt(tempVar11);
			 }
			 String tempVar12 = ConsoleInput.scanfRead(" ");
			 if (tempVar12 != null)
			 {
				 c2 = Integer.parseInt(tempVar12);
			 }
		}

		return 0;
	}
}

