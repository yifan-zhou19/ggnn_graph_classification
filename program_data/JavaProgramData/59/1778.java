package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char y;
		char[][] a = new char[100][100];
		String c = new String(new char[100]);

		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					(a[i][j]) = tempVar3.charAt(0);
				}
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				(c.charAt(i)) = tempVar4;
			}
		}

		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Integer.parseInt(tempVar5);
		}



		for (k = 1;k < m;k++)
		{

		   for (i = 0;i < n;i++)
		   {
			  for (j = 0;j < n;j++)
			  {
				  if (a[i][j] == '@')
				  {
					  if (i > 0)
					  {
						if (a[i - 1][j] == '.')
						{
							a[i - 1][j] = '$';
						}
					  }
					  if (j > 0)
					  {
						if (a[i][j - 1] == '.')
						{
							a[i][j - 1] = '$';
						}
					  }

					  if (a[i][j + 1] == '.')
					  {
						  a[i][j + 1] = '$';
					  }
					  if (a[i + 1][j] == '.')
					  {
						  a[i + 1][j] = '$';
					  }

				  }
			  }
		   }

		  for (i = 0;i < n;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
				  if (a[i][j] == '$')
				  {
					  a[i][j] = '@';
				  }
			  }
		  }


		}

		 int t;
		 t = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					t = t + 1;
				}
			}
		}

		System.out.printf("%d",t);




		return 0;
	}



}

