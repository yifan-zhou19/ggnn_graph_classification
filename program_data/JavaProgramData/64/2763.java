package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[][] a = new int[10][3];
		int[][] b = new int[45][2];
		int i;
		int j;
		int k = 0;
		int t;
		float[] c = new float[45];
		float s;
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[k][0] = i;
				b[k][1] = j;
				c[k] = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));
				k++;
			}
		}
		for (j = 0;j < k - 1;j++)
		{
			for (i = 0;i < k - 1 - j;i++)
			{
				if (c[i] < c[i + 1])
				{
					s = c[i];
					c[i] = c[i + 1];
					c[i + 1] = s;
					t = b[i][0];
					b[i][0] = b[i + 1][0];
					b[i + 1][0] = t;
					t = b[i][1];
					b[i][1] = b[i + 1][1];
					b[i + 1][1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[b[i][0]][0],a[b[i][0]][1],a[b[i][0]][2],a[b[i][1]][0],a[b[i][1]][1],a[b[i][1]][2],c[i]);
		}
	}

}

