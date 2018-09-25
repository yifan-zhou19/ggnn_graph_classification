package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int c;
		int big = 0;
		int[] num = new int[30];
		int[] a = new int[1000];
		char[][] name = new char[1000][20];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				name[i] = tempVar3.charAt(0);
			}
		}
		for (k = 0;k < 26;k++)
		{
		  for (i = 0;i < n;i++)
		  {
			for (j = 0;j < String.valueOf(name[i]).length();j++)
			{
				if (name[i][j] == k + 'A')
				{
				   num[k] = num[k] + 1;
				}
			}
		  }
		}
		for (i = 0;i < 26;i++)
		{
			if (big < num[i])
			{
				big = num[i];
			c = i + 'A';
			}
		}
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",big);
	   /* for(i=0;i<n;i++)
	    {
	        if(num[i]==big)
	          printf("%d\n",big);
	    }*/
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(name[i]).length();j++)
			{
				if (name[i][j] == c)
				{
				System.out.printf("%d\n",a[i]);
				}
			}
		}
		return 0;
	}

}

