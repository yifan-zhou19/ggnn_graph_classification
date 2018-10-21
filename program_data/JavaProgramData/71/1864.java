package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] month = {0, 3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 c = Integer.parseInt(tempVar4);
			 }
			 int d = 0;
			 if (b > c)
			 {
				   e = b;
				   b = c;
				   c = e;
			 }
			 for (j = b;j < c;j++)
			 {
				   d += month[j];
			 }
			 if (((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) && b <= 2)
			 {
				   d++;
			 }
			 if (d % 7 == 0)
			 {
				   System.out.print("YES\n");
			 }
			 else
			 {
				   System.out.print("NO\n");
			 }
		}
		return 0;
	}
}

