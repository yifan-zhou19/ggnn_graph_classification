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
	 int i;
	 int result = 0;
	 for (i = 0;;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 a2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 b2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 c2 = Integer.parseInt(tempVar6);
	 }
	 if (a1 == 0 && b1 == 0 && c1 == 0 && a2 == 0 && b2 == 0 && c2 == 0)
	 {
	   break;
	 }
	  else
	  {
	   result += (a2 + 12 - a1) * 3600;
	   result += b2 * 60 + c2;
	   result = result - b1 * 60 - c1;
	   System.out.printf("%d\n",result);
	   result = 0;
	  }
	 }
	  return 0;
	}

}

