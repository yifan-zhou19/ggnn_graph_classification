package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[10000];
	  char[][] v = new char[1000][10000];
	  int m = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 0;i <= n - 1;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			v[i] = tempVar2.charAt(0);
		}
	  }
	 for (int i = 0;i <= n - 1;i++)
	 {
	   for (int j = 0;j <= String.valueOf(v[i]).length() - 1;j++)
	   {
		a[j] = 0;
		 for (int k = 0;k <= String.valueOf(v[i]).length() - 1;k++)
		 {
			if (v[i][j] == v[i][k])
			{
			  a[j]++;
			}
		 }
	   }
	   for (int t = 0;t <= String.valueOf(v[i]).length() - 1;t++)
	   {
		  if (a[t] != 1)
		  {
			  m++;
		  }
	   }
		if (m == String.valueOf(v[i]).length())
		{
			System.out.print("no\n");
			m = 0;
		}
		else
		{
			for (int t = 0;t <= String.valueOf(v[i]).length() - 1;t++)
			{
			if (a[t] == 1)
			{
			System.out.printf("%c\n",v[i][t]);
			m = 0;
			break;
			}
			}

		}
	 }
	 return 0;

	}

}

