package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xl = new int[1000];
		int n = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int i = 0;
		int j = 0;
		int a = 0;
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   xl[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (xl[i] + xl[j] == k)
				{
				   System.out.printf("%c%c%c",'y','e','s');
				   a = 1;
				   break;
				}
			}
			if (a == 1)
			{
			   break;
			}
		}
		if (a == 0)
		{
		   System.out.printf("%c%c",'n','o');
		}
		return 0;
	}
}

