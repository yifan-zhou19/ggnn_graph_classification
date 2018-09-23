package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			   switch (m)
			   {
			   case 1:
				   System.out.printf("%d",d);
				   break;
			   case 2:
				   System.out.printf("%d",31 + d);
				   break;
			   case 3:
				   System.out.printf("%d",60 + d);
				   break;
			   case 4:
				   System.out.printf("%d",91 + d);
				   break;
			   case 5:
				   System.out.printf("%d",121 + d);
				   break;
			   case 6:
				   System.out.printf("%d",152 + d);
				   break;
			   case 7:
				   System.out.printf("%d",182 + d);
				   break;
			   case 8:
				   System.out.printf("%d",213 + d);
				   break;
			   case 9:
				   System.out.printf("%d",244 + d);
				   break;
			   case 10:
				   System.out.printf("%d",274 + d);
				   break;
			   case 11:
				   System.out.printf("%d",305 + d);
				   break;
			   case 12:
				   System.out.printf("%d",335 + d);
				   break;
			   }
		}
		else
		{
			   switch (m)
			   {
			   case 1:
				   System.out.printf("%d",d);
				   break;
			   case 2:
				   System.out.printf("%d",31 + d);
				   break;
			   case 3:
				   System.out.printf("%d",59 + d);
				   break;
			   case 4:
				   System.out.printf("%d",90 + d);
				   break;
			   case 5:
				   System.out.printf("%d",120 + d);
				   break;
			   case 6:
				   System.out.printf("%d",151 + d);
				   break;
			   case 7:
				   System.out.printf("%d",181 + d);
				   break;
			   case 8:
				   System.out.printf("%d",212 + d);
				   break;
			   case 9:
				   System.out.printf("%d",243 + d);
				   break;
			   case 10:
				   System.out.printf("%d",273 + d);
				   break;
			   case 11:
				   System.out.printf("%d",304 + d);
				   break;
			   case 12:
				   System.out.printf("%d",334 + d);
				   break;
			   }
		}

	}

}

