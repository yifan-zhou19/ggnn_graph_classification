package <missing>;

public class GlobalMembers
{
	/*????????m?10 ? m ? 999??????????n?2 ? n ? 26?
	????????????????m?????????1?999???????????'A'?'Z'??
	??????????????????????????????*/

	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] x = new int[26];
		int y = 0;
		int z;
		char[][] a = new char[100][4];
		char[][] b = new char[100][10];
		char c;
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(b[i]).length();
			for (j = 0;j < m;j++)
			{
				x[b[i][j] - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (y < x[i])
			{
				y = x[i];
				z = i;
			}
		}
		c = z + 65;
		System.out.printf("%c\n%d\n",c,y);
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(b[i]).length();
			y = 0;
			for (j = 0;j < m;j++)
			{
				if (b[i][j] == c)
				{
					y = 1;
				}
			}
			if (y == 1)
			{
				System.out.printf("%s\n",a[i]);
			}
		}
	}
}

