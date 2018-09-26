import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[5000]); //????????????????
		String y = new String(new char[5000]);
		char[][] str_x = new char[5000][4];
		char[][] str_y = new char[5000][4];
		int[] time_x = new int[5000];
		int[] time_y = new int[5000];
		int[] num = new int[5000];

		int k = 0;
		int i = 0;
		int j = 0;
		int m;
		int sum = 1;
		int max = 0;

		x = new Scanner(System.in).nextLine(); //???????????
		y = new Scanner(System.in).nextLine();

		for (m = 0;m < x.length();m++) //????
		{
			if (x.charAt(m) == ',')
			{
				sum += 1;
			}
		}
		System.out.print(sum);
		System.out.print(" ");

		for (k = 0;k < x.length();k++) //?????????????????????
		{
			if (x.charAt(k) != ',')
			{
				str_x[i][j] = x.charAt(k);
				j++;
			}
			else
			{
				i++;
				j = 0;
			}
		}
		i = 0;
		j = 0;

		for (k = 0;k < y.length();k++)
		{
			if (y.charAt(k) != ',')
			{
				str_y[i][j] = y.charAt(k);
				j++;
			}
			else
			{
				i++;
				j = 0;
			}
		}

		for (i = 0;i < sum;i++) //?????????????
		{
			time_x[i] = Double.parseDouble(str_x[i]);
			time_y[i] = Double.parseDouble(str_y[i]);
		}

		for (i = 0;i < sum;i++) //????????????
		{
			while (time_x[i] < time_y[i])
			{
				num[time_x[i]]++;
				time_x[i]++;

			}
		}

		for (j = 0;j < 5000;j++) //???????????
		{
			if (num[j] > max)
			{
				max = num[j];
			}
		}
		System.out.print(max);

		return 0;
	}
}
