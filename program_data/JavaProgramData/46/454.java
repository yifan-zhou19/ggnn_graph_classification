package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int r;
		int c;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		l = 0;
		k = 1;
		if (r == 1 && c == 1)
		{
			System.out.printf("%d",a[0][0]);
		}
		else
		{
		for (j = 0;;)
		{
			switch (k)
			{
			case 1:
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto p1;
				break;
			case 2:
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto p2;
				break;
			case 3:
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto p3;
				break;
			case 4:
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto p4;
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	p1:
	{
			for (i = l;i < c - l;i++)
			{
				System.out.printf("%d\n",a[l][i]);
				j++;
				if (j == r * c)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	p2:
	{
			for (i = l + 1;i < r - l - 1;i++)
			{
				System.out.printf("%d\n",a[i][c - l - 1]);
				j++;
				if (j == r * c)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	p3:
	{
			for (i = c - l - 1;i >= l;i--)
			{
				System.out.printf("%d\n",a[r - l - 1][i]);
				j++;
				if (j == r * c)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	p4:
	{
			for (i = r - l - 2;i > l;i--)
			{
				System.out.printf("%d\n",a[i][l]);
				j++;
				if (j == r * c)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto out;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	{
			k++;
			if (k > 4)
			{
				k = 1;
				l++;
			}
	}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	out:
	;
		return 0;
	}

}

