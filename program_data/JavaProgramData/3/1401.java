package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] szone = new int[999];
		int[] sztwo = new int[999];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				szone[i] = Integer.parseInt(tempVar3);
			}
			sztwo[i] = szone[i];
		}
		for (i = 0;i < n;i++)
		{
		   for (a = 0;a < n;a++)
		   {
			   if (szone[i] + sztwo[a] == k)
			   {
				  break;
			   }
		   }
		   if (szone[i] + sztwo[a] == k)
		   {
			   System.out.print("yes");
			   break;
		   }
		   else
		   {
			   if (i != n - 1)
			   {
				   continue;
			   }
			   else
			   {
				System.out.print("no");
			   }
		   }
		}
		return 0;
	}


}

