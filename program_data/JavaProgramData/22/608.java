package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		int[] f = new int[10000];
		int x;
		int count;
		int i;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		while (ch == ',')
		{
			f[x] = 1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				ch = tempVar4.charAt(0);
			}

		}
		f[x] = 1;
		count = 0;

		for (i = 9999;i >= 0;i--)
		{
		   if (f[i] > 0)
		   {
			 count++;

		   }
		   if (count == 2)
		   {
			 System.out.printf("%d",i);
			 return 0;
		   }
		}
		System.out.print("No");
		 return 0;
	}


}

