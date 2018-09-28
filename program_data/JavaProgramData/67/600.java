package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int p;
	 int q;
	 int a;
	 int b;
	 float r;
	 float s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 p = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 q = Integer.parseInt(tempVar3);
	 }
	 r = (float)q / (float)p;
	 for (int i = 1;i <= n - 1;i++)
	 {
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 a = Integer.parseInt(tempVar4);
				 }
				 String tempVar5 = ConsoleInput.scanfRead(" ");
				 if (tempVar5 != null)
				 {
					 b = Integer.parseInt(tempVar5);
				 }
				 s = (float)b / (float)a;
				 if (r > s + 0.05)
				 {
						   System.out.print("worse\n");
				 }
				 else if (s > r + 0.05)
				 {
						   System.out.print("better\n");
				 }
				 else
				 {
					 System.out.print("same\n");
				 }
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}
}

