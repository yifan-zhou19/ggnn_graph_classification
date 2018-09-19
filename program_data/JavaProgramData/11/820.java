package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int b;
		 int c;
		 int d;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 b = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 c = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 d = Integer.parseInt(tempVar3);
		 }
		 if ((b % 4 == 0 && b % 100 != 0) || (b % 100 == 0 && b % 400 == 0))
		 {
					 a[2] = 29;
		 }
		 for (i = 1;i < c;i++)
		 {
			 d = d + a[i];
		 }
		 System.out.printf("%d",d);
	}


}

