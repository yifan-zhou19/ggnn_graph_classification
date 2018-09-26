package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int x;

		int[] a = new int[10];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		 System.out.printf("%d\n",f(a[i]));
		}
	return 0;
	}
		 public static int f(int x)

		 {
		 int f1 = 1;
		 int f2 = 1;
		 int f3;
		 int b;
		 int i;
		 if (x == 1 || x == 2)
		 {
			 return (1);
		 }
		 else
		 {
			 for (i = 2;i < x;i++)
			 {
			 f3 = f1 + f2;
			 f1 = f2;
			 f2 = f3;
			 }
		 b = f3;
		 return (b);
		 }
		 }




}

