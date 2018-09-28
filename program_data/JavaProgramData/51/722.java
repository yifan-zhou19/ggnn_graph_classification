package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //c???????
		int i;
		int j = 0;
		int k;
		int m = 0;
		int[] c = new int[500];
		int r;
		int u = 0;
		String a = new String(new char[500]); //a???????b???????
		char[][] b = new char[500][6];
		String temp = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
			  b[u][j] = a.charAt(i + j);
			}
			b[u][n] = '\0';
			  u++;
			if (u == (a.length() - n + 1))
			{
				  break;
			}
		}
		for (i = 0;i < u - 1;i++)
		{
			int count = 0;
			for (k = i;k < u;k++)
			{
				if (strcmp(b[i],b[k]) == 0) //????????????1?
				{
					c[i]++;
				}
			}
		}
		for (i = 0;i < u;i++)
		{
			for (k = u - 1;k > i;k--)
			{
				if (c[k] > c[k - 1])
				{
						r = c[k];
						c[k] = c[k - 1];
						c[k - 1] = r;
						temp = b[k];
						b[k] = b[k - 1];
						b[k - 1] = temp;
				}
			}
		}
			if (c[0] == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.printf("%d\n",c[0]);
				System.out.printf("%s",b[0]);
				System.out.print("\n");
				for (i = 1;i < u;i++)
				{
					if (c[i] == c[0])
					{
						System.out.printf("%s",b[i]);
					System.out.print("\n");
					}
					else
					{
						break;
					}
				}
			}
			return 0;
	}

}

