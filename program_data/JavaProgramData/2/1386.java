package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		char[][] s = new char[1000][26];
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
		}
		char x;
		int max = 0;
		char maxx;
		int l;
		for (x = 'A';x <= 'Z';x++)
		{
		   l = 0;
		   for (i = 0;i < m;i++)
		   {
			   for (j = 0;j < 26;j++)
			   {
				   if (s[i][j] == x)
				   {
					   break;
				   }
			   }
			   if (j != 26)
			   {
				   l++;
			   }
		   }
		   if (l > max)
		   {
			   max = l;
			   maxx = x;
		   }
		}
		System.out.printf("%c\n%d\n",maxx,max);
		for (i = 0;i < m;i++)
		{
			 for (j = 0;j < 26;j++)
			 {
				  if (s[i][j] == maxx)
				  {
					  break;
				  }
			 }
			   if (j != 26)
			   {
				   System.out.printf("%d\n",a[i]);
			   }
		}
		return 0;
	}

}

