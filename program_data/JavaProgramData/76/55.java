package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k;
		int m;
		int a;
		int t;
		int[][] s = new int[1300][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s[i][2] = Integer.parseInt(tempVar3);
		}
		}
		 for (i = 0;i < n;i++)
		 {
		  for (j = i + 1;j < n;j++)
		  {
		  if (s[i][1] > s[j][1])
		  {
							  a = s[i][1];
							  s[i][1] = s[j][1];
							  s[j][1] = a;
							   a = s[i][2];
							  s[i][2] = s[j][2];
							  s[j][2] = a;
		  }
		  }
		 }
		  t = s[0][2];
		  for (i = 0;i < n - 1;i++)
		  {
		  if (t < s[i + 1][1])
		  {
							   System.out.print("no");
							   System.exit(0);
		  }
		  else if (t < s[i + 1][2])
		  {
			  t = s[i + 1][2];
		  }
		  }
			   System.out.printf("%d %d",s[0][1],t);

					 return 0;
	}


}

