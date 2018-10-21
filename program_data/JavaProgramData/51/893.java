package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[1000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		char[][] s = new char[1000][100];
		int i;
		int len;
		int z;
		int[] a = new int[10000];
		len = str.length();
		int k;
		for (i = 0;i <= len - n;i++)
		{
			for (k = 0;k < n;k++)
			{
			  s[i][k] = str.charAt(i + k);
			}
			s[i][n] = '\0';
		}
		String base = new String(new char[100]);
		for (k = 0;k <= len - n;k++)
		{
			base = s[k];
			for (i = 0;i <= len - n;i++)
			{
			   if (strcmp(base,s[i]) == 0)
			   {
				   a[k]++;
			   }
			}
		}
		int temp = 1;
		for (k = 0;k <= len - n;k++)
		{
			if (a[k] > temp)
			{
				temp = a[k];
			}
		}
		final String ch = "AMA";
		if (temp == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",temp);
			for (k = 0;k <= len - n;k++)
			{
				if (strcmp(ch,s[k]) == 0)
				{
					continue;
				}
				else
				{
				  if (a[k] == temp)
				  {
					System.out.printf("%s\n",s[k]);
					for (z = k + 1;z <= len - n;z++)
					{
						if (strcmp(s[k],s[z]) == 0)
						{
							s[z] = ch;
						}
					}
				  }
				}
			}
		}
	}

}

