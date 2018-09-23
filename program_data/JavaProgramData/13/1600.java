package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		int[] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[n];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",p[0]);
		for (i = 1;i <= n - 1;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p[i] = Integer.parseInt(tempVar3);
			 }
			 for (j = 0;j < i;j++)
			 {
				  if (p[i] == p[j])
				  {
				  flag = 1;
				  }
			 }
			 if (flag == 0)
			 {
			 System.out.printf(" %d",p[i]);
			 }
			 flag = 0;
		}
		return 0;
	}



}

