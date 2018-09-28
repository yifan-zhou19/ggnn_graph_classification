package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int b;
		int[] s = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		b = 0;
		for (l = 0;l < n;l++)
		{
			s[l] = 0;
		}
		while ((i != 0) || (j != 0))
		{
							 s[j]++;
							 if (s[j] == n - 1)
							 {
								System.out.printf("%d\n",j);
								b++;
							 }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  i = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead(" ");
			  if (tempVar5 != null)
			  {
				  j = Integer.parseInt(tempVar5);
			  }
		}
		if (b == 0)
		{
		   System.out.print("NOT FOUND");
		}
	}

}

