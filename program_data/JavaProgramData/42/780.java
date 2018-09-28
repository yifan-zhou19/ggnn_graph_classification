package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[100000];
		int m;
		int i;
		int tmp = 0;
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
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
		   if ((s[i] != m) && (tmp == 0))
		   {
			   System.out.printf("%d",s[i]);
			   tmp = 1;
		   }
		   else if ((s[i] != m) && (tmp == 1))
		   {
			   System.out.printf(" %d",s[i]);
		   }

		}
	   return 0;
	}
}

