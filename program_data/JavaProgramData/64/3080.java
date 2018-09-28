package <missing>;

public class GlobalMembers
{
	public static int[][] point = new int[10][3];
	public static float[][] dis = new float[10][10];
	public static float[] far = new float[45];

	public static void bubblesort(int k)
	{
		for (int i = 0;i <= k - 1;i++)
		{
			for (int j = k;j > i;j--)
			{
				float tmp;
				if (far[j] > far[j - 1])
				{
					tmp = far[j];
					far[j] = far[j - 1];
					far[j - 1] = tmp;
				}
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
			point[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k = 0;
		for (int i = 0;i <= n - 2;i++)
		{
			for (int j = i + 1;j <= n - 1;j++)
			{
				dis[i][j] = Math.sqrt((float)((point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2])));
				far[k] = dis[i][j];
				k++;
			}
		}
		bubblesort(k);
		for (int p = 0;p <= k - 1;)
		{
		for (int i = 0;i <= n;i++)
		{
			for (int j = i;j <= n - 1;j++)
			{
				if (dis[i][j] == far[p])
				{
					System.out.print("(");
					System.out.print(point[i][0]);
					System.out.print(",");
					System.out.print(point[i][1]);
					System.out.print(",");
					System.out.print(point[i][2]);
					System.out.print(")-(");
					System.out.print(point[j][0]);
					System.out.print(",");
					System.out.print(point[j][1]);
					System.out.print(",");
					System.out.print(point[j][2]);
					System.out.print(")=");
					System.out.printf("%.2f\n",far[p]);
					dis[i][j] = -1F;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	p++;
		}
	}

}

