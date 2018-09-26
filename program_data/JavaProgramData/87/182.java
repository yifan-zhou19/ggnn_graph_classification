package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  int i;
	  int time = 0;
	  for (i = 0;i < 10000;i++)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 d = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 e = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 f = Integer.parseInt(tempVar6);
		 }
		 time = time + (d + 12 - a) * 60 * 60;
		 time = time + (e - b) * 60;
		 time = time + f - c;

		 if (time == 12 * 60 * 60)
		 {
		 break;
		 }
		 if (time != 0)
		 {
		 System.out.printf("%d\n",time);
		 time = 0;
		 }
	  }
		return 0;
	}
}

