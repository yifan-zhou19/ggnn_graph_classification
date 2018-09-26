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
	 int t;
	 int s;
	 for (s = 1;s = 1000;s++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 c = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 d = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 e = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ");
	 if (tempVar6 != null)
	 {
		 f = Integer.parseInt(tempVar6);
	 }
	 if (a == 0)
	 {
	 break;
	 }
	 else
	 {
		 int m;
		 int n;
		 int p;
	 m = (d + 12) - a;
	 if (b >= e)
	 {
	  n = b - e;
	  if (c >= f)
	  {
	  p = c - f;
	  t = m * 3600 - n * 60 - p;
	  }
	  else
	  {
	  p = f - c;
	  t = m * 3600 - n * 60 + p;
	  }
	 }
	 else
	 {
			n = e - b;
	  if (c >= f)
	  {
		  p = c - f;
	  t = m * 3600 + n * 60 - p;
	  }
	  else
	  {
		  p = f - c;
	  t = m * 3600 + n * 60 + p;
	  }
	 }
	 System.out.printf("%d\n", t);
	 }
	 }
	 return 0;
	}
}

