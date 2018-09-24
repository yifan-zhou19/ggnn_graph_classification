package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[20];
		b[0] = 1;
		b[1] = 1;
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   if (a == 1)
		   {
			   System.out.printf("%d\n",b[0]);
		   }
		   else if (a == 2)
		   {
			   System.out.printf("%d\n",b[1]);
		   }
		   else if (a > 2)
		   {
				for (j = 2;j < a;j++)
				{
				b[j] = b[j - 1] + b[j - 2];
				}
		   System.out.printf("%d\n",b[a - 1]);
		   }
		}
		System.in.read();
		System.in.read();
	}

}

