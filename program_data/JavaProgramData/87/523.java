package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sc = 0;
		int A = 1;
		int i;
		int j;
		int[][] s = new int[200][6];
		for (i = 0;i < A;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (s[i][0] + s[i][1] + s[i][2] + s[i][3] + s[i][4] + s[i][5] == 0)
			{
				break;
			}
			else
			{
				A++;
			}
		}
		for (i = 0;i < A - 1;i++)
		{
			a = s[i][0];
			b = s[i][1];
			c = s[i][2];
			d = s[i][3];
			e = s[i][4];
			f = s[i][5];
			sc = ((d + 12) * 3600 + e * 60 + f) - (a * 3600 + b * 60 + c);
			System.out.printf("%d\n",sc);
		}
		return 0;
	}



}

