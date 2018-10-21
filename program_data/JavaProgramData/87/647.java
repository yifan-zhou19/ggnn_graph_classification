package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		int i;
		int j;
		int s;
		int t = 0;
		for (i = 0;i < 100;i++)
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a1 = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a2 = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a3 = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a4 = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 a5 = Integer.parseInt(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 a6 = Integer.parseInt(tempVar6);
			 }

			 s = (a4 + 12) * 3600 + a5 * 60 + a6 - a1 * 3600 - a2 * 60 - a3;
			 if (a1 != 0)
			 {
				   System.out.printf("%d\n",s);
			 }
			 if (a1 == 0 && 2 == 0)
			 {

				 break;
			 }
		}


		return 0;
	}
}

