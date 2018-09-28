package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
		String[][] p;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(n * sizeof(String));
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			p[i] = (String)malloc(2 * sizeof(String));
			for (j = 0;j < 2;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p[i][j] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][j] = tempVar2.charAt(0);
				}
				if (j == 0)
				{
					scanf("\n");
				}
				else if (j == 1 && i == n - 1)
				{
				}
				else
				{
					scanf("\n\n");
				}
			}
		}
		int tuiwei;
		for (i = 0;i < n;i++)
		{
			int a = String.valueOf(p[i][0]).length();
			int b = String.valueOf(p[i][1]).length();
			for (j = a - 1,tuiwei = 0;j >= 0;j--)
			{
				if (j >= a - b)
				{
					k = j - (a - b);
					if (p[i][0][j] >= p[i][1][k] + tuiwei)
					{
						p[i][0][j] = p[i][0][j] - p[i][1][k] - tuiwei + '0';
						tuiwei = 0;
					}
					else
					{
						p[i][0][j] = p[i][0][j] + 10 - p[i][1][k] - tuiwei + '0';
						tuiwei = 1;
					}
				}
				else
				{
					if (p[i][0][j] >= tuiwei)
					{
						p[i][0][j] = p[i][0][j] - tuiwei;
						tuiwei = 0;
					}
					else
					{
						p[i][0][j] = p[i][0][j] + 10 - tuiwei;
						tuiwei = 1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i <= n - 2)
			{
			System.out.printf("%s\n",p[i][0]);
			}
			else
			{
			System.out.printf("%s",p[i][0]);
			}
		}
	}

}

