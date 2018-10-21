package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[n];
		for (int k = 0;k < n;k++)
		{
			p[k] = 0;
		}
		for (;;)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   i = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   j = Integer.parseInt(tempVar3);
		   }
		if ((i == 0) && (j == 0))
		{
		break;
		}
		p[j] += 1;
		}
		for (int o = 0;o < n;o++)
		{
		   if (p[o] == n - 1)
		   {
			System.out.printf("%d\n",o);
		 flag += 1;
		   }
		}
	   if (flag == 0)
	   {
	   System.out.print("NOT FOUND");
	   }
	}
}

