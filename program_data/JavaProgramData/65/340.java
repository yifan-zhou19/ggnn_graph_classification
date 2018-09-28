package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int n = 0;
		int m = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		for (i = 0;i < l;i++)
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
			 if ((a - b == -1) || (a - b == 2))
			 {
				 m++;
			 }
			 if ((b - a == -1) || (b - a == 2))
			 {
				 n++;
			 }
		}
		if (m == n)
		{
			System.out.print("Tie");
		}
		if (m > n)
		{
			System.out.print("A");
		}
		if (m < n)
		{
			System.out.print("B");
		}
	}

}

