package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int l;
		int[] b = new int[500];
		int i;
		int j;
		int k;
		int max;
		String a = new String(new char[500]);
		char[][] c = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
			   c[i][j] = a.charAt(i + j);
			}
			c[i][j] = '\0';
		}
		for (i = 0;i < l - n;i++)
		{
			  if (b[i] != -1)
			  {
				   for (j = i + 1;j < l - n + 1;j++)
				   {
				   if (b[j] != -1)
				   {
				   if (strcmp(c[i],c[j]) == 0)
				   {
					   b[i]++;
					   b[j] = -1;
				   }
				   }
				   }
			  }
		}
		max = b[0];
		for (i = 1;i < l - n + 1;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
			for (i = 0;i < l - n + 1;i++)
			{
				if (b[i] == max)
				{
					System.out.printf("%s\n",c[i]);
				}
			}
		}
	}
}

