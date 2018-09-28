package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float max;
		float[][] s = new float[11][11];
		float[][] z = new float[11][3];
		int i;
		int j;
		int n;
		int x;
		int y;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Float.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(z,0,(Float.SIZE / Byte.SIZE));
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i][1] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i][2] = Float.parseFloat(tempVar4);
			}
			for (j = 1;j < i;j++)
			{
				s[j][i] = Math.sqrt((z[i][0] - z[j][0]) * (z[i][0] - z[j][0]) + (z[i][1] - z[j][1]) * (z[i][1] - z[j][1]) + (z[i][2] - z[j][2]) * (z[i][2] - z[j][2]));
			}
		}
		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			max = s[1][2];
			x = 1;
			y = 2;
			for (j = 1;j < n;j++)
			{
				for (k = j + 1;k <= n;k++)
				{
					if (s[j][k] > max)
					{
						x = j;
						y = k;
						max = s[j][k];
					//printf("%.2f\n",max);
					}
				}
			}
			System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f\n",z[x][0],z[x][1],z[x][2],z[y][0],z[y][1],z[y][2],s[x][y]);
			s[x][y] = 0F;
		}


	}
}

