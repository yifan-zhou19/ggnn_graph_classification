package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int c;
		int j;
		char[][] a = new char[300][100];
		int[] l = new int[300];
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
				a[i] = tempVar2.charAt(0);
			}
			l[i] = String.valueOf(a[i]).length();
		}
		c = l[0];
		j = 0;
	//	for (i=0;i<n;i++)
	//		printf("%d ",l[i]);
		while (j < n)
		{
			 while ((c <= 80) && (j < n))
			 {
	 // 		 if (c+l[j]<=80) printf("%s ",a[j]);
				if (c == l[j])
				{
					System.out.printf("%s",a[j]);
				}
				else
				{
					System.out.printf(" %s",a[j]);
				}
				  c++;
				  j++;
				  c = c + l[j];
			 }
			   System.out.print("\n");
			 c = l[j];
		}
		return 0;
	}

}

