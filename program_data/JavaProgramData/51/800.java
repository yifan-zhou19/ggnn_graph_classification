package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int A;
		int M = 0;
		String a = new String(new char[500]);
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
		A = a.length();
		char[][] b = new char[500][5];
		int[] c = new int[500];
		if (n == 2)
		{
			for (i = 0;i <= A - n;i++)
			{
				b[i][0] = a.charAt(i);
				b[i][1] = a.charAt(i + 1);
				b[i][2] = 0;
			}
		}
		if (n == 3)
		{
			for (i = 0;i <= A - n;i++)
			{
				b[i][0] = a.charAt(i);
				b[i][1] = a.charAt(i + 1);
				b[i][2] = a.charAt(i + 2);
				b[i][3] = 0;
			}
		}
		if (n == 4)
		{
			for (i = 0;i <= A - n;i++)
			{
				b[i][0] = a.charAt(i);
				b[i][1] = a.charAt(i + 1);
				b[i][2] = a.charAt(i + 2);
				b[i][3] = a.charAt(i + 3);
				b[i][4] = 0;
			}
		}
		/*for(i=0;i<=A-n;i++)
		{printf("%s ",b[i]);}*/
		for (j = 0;j <= A - n;j++)
		{
			c[j] = 0;
			for (k = j;k <= A - n;k++)
			{
				if (strcmp(b[k],b[j]) == 0)
				{
					c[j] = c[j] + 1;
				}
			}
			if (M < c[j])
			{
				M = c[j];
			}
		}
		if (M > 1)
		{
			System.out.printf("%d\n",M);
			for (j = 0;j <= A - n;j++)
			{
				if (c[j] == M)
				{
					System.out.printf("%s\n",b[j]);
				}
			}
		}
		else
		{
			System.out.print("NO\n");
		}


	}
}

