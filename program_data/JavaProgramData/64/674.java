package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l = 0;
		int num;
		double temp = 0;
		int[][] pos = new int[100][3];
		double[] distance = new double[9900];
		int[] latter = new int[9900];
		int[] former = new int[9900];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < num; i++)
		{
			for (j = 0; j < 3; j++)
			{
				  pos[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < num; i++)
		{
			for (j = i + 1; j < num; j++)
			{
				for (k = 0; k < 3; k++)
				{
					former[l] = i;
					latter[l] = j;
					distance[l] += (pos[i][k] - pos[j][k]) * (pos[i][k] - pos[j][k]);
				}
				distance[l] = Math.sqrt(distance[l]);
				l++;
			}
		}
		l = (num - 1) * num / 2;
		for (i = 0; i < l - 1; i++)
		{
			for (j = 0; j < l - i - 1; j++)
			{
				if (distance[j] < distance[j + 1])
				{
					temp = distance[j];
					distance[j] = distance[j + 1];
					distance[j + 1] = temp;
					temp = latter[j];
					latter[j] = latter[j + 1];
					latter[j + 1] = temp;
					temp = former[j];
					former[j] = former[j + 1];
					former[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < l; i++)
		{
			System.out.print("(");
			System.out.print(pos[former[i]][0]);
			System.out.print(",");
			System.out.print(pos[former[i]][1]);
			System.out.print(",");
			System.out.print(pos[former[i]][2]);
			System.out.print(")-(");
			System.out.print(pos[latter[i]][0]);
			System.out.print(",");
			System.out.print(pos[latter[i]][1]);
			System.out.print(",");
			System.out.print(pos[latter[i]][2]);
			System.out.print(")=");
			System.out.printf("%.2f", distance[i]);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

