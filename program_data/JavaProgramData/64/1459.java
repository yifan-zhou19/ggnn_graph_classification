package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][3]; //????????
		int n = 0; //??n??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0; //????????
		int j = 0;
		int k = 0;
		for (i = 0; i < n; i++) //??????
		{
			for (j = 0; j < 3; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		double[] distance = new double[100]; //???????????
		double dis = 0; //?????
		for (i = 0; i < n; i++) //??????
		{
			for (j = i + 1; j < n; j++)
			{
				for (k = 0; k < 3; k++)
				{
					dis = dis + (a[i][k] - a[j][k]) * (a[i][k] - a[j][k]);
				}
				distance[i * 10 + j] = Math.sqrt(dis);
				dis = 0;
			}
		}
		int[] b = new int[100]; //????????????
		for (i = 0; i < 100; i++)
		{
			b[i] = i;
		}
		for (i = 0; i < 99; i++) //?????
		{
			for (j = 0; j < 99 - i; j++)
			{
				if (distance[j] < distance[j + 1])
				{
					swap(distance[j], distance[j + 1]);
					swap(b[j], b[j + 1]);
				}
			}
		}
		for (i = 0; i < n * (n - 1) / 2; i++) //????????????
		{
			System.out.print("(");
			System.out.print(a[b[i] / 10][0]);
			System.out.print(",");
			System.out.print(a[b[i] / 10][1]);
			System.out.print(",");
			System.out.print(a[b[i] / 10][2]);
			System.out.print(")-(");
			System.out.print(a[b[i] % 10][0]);
			System.out.print(",");
			System.out.print(a[b[i] % 10][1]);
			System.out.print(",");
			System.out.print(a[b[i] % 10][2]);
			System.out.print(")=");
			System.out.printf("%.2f", distance[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

