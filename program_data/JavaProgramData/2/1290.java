package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		int c = 0;
		int[] A = new int[25];
		final String g = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//	 int a;
	//	 char s[80];
	//	 }
	//	 tope[1000];
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
				tope[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				tope[i].s = tempVar3;
			}
		}
		   for (k = 0;k < 26;k++)
		   {
					 A[k] = 0;
			for (i = 0;i < n;i++)
			{
			for (j = 0;tope[i].s[j] != '\0';j++)
			{
					 if (tope[i].s[j] == g.charAt(k))
					 {
						A[k]++;
					 }
			}
			}
		   }
		 for (i = 0;i < 26;i++)
		 {
			  if (A[i] > t)
			  {
				  t = A[i];
				  c = i;
			  }
		 }
		System.out.printf("%c\n%d\n",g.charAt(c),t);
	   for (i = 0;i < n;i++)
	   {
		  for (j = 0;tope[i].s[j] != '\0';j++)
		  {
				if (tope[i].s[j] == g.charAt(c))
				{
					System.out.printf("%d\n",tope[i].a);
				}
		  }
	   }
	   return 0;
	}


}

