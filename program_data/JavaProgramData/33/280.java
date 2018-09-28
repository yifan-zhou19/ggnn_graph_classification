package <missing>;

public class GlobalMembers
{
	public static char[][] s = new char[1000][256];
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int k;

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
				s[i] = tempVar2.charAt(0);
			}

		}
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(s[i]).length();
			for (k = 0;k < a[i];k++)
			{
				if (s[i][k] == 'A')
				{
					s[i][k] = 'T';
				}
				else
				{
					if (s[i][k] == 'T')
					{
					   s[i][k] = 'A';
					}
					else
					{
						if (s[i][k] == 'C')
						{
						   s[i][k] = 'G';
						}
						else
						{
						   s[i][k] = 'C';
						}
					}

				}
			}
		}
	  for (i = 0;i < n;i++)
	  {
		  a[i] = String.valueOf(s[i]).length();
		  for (k = 0;k < a[i];k++)
		  {
			  if (k < (a[i] - 1))
			  {
				  System.out.printf("%c",s[i][k]);
			  }
				  else
				  {
				   System.out.printf("%c\n",s[i][k]);
				  }
		  }
	  }
	   System.out.printf("%s",s[n]);
	  return 0;
	}
}

