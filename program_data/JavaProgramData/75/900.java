import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int total_num = 0;
		int num = 0;
		int minx;
		int maxy;
		int max_num = 0;
		int lenx;
		int leny;
		int mark = 0;
			//i?j??????total_num?????minx???????maxy????????max_num????????
		int[] x = new int[10000]; //??????
		int[] y = new int[10000];
		String strx = new String(new char[10000]); //????????
		String stry = new String(new char[10000]);
		strx = new Scanner(System.in).nextLine();
		stry = new Scanner(System.in).nextLine();
		lenx = strx.length();
		leny = stry.length();
		while (i <= lenx)
		{
			//??????????????
			if (strx.charAt(i) != ',' && strx.charAt(i) != '\0')
			{
				mark++;
			}
			else
			{
				if (mark == 1)
				{
					x[total_num] = strx.charAt(i - 1) - '0';
				}
				if (mark == 2)
				{
					x[total_num] = strx.charAt(i - 1) - '0' + (strx.charAt(i - 2) - '0') * 10;
				}
				if (mark == 3)
				{
					x[total_num] = strx.charAt(i - 1) - '0' + (strx.charAt(i - 2) - '0') * 10 + (strx.charAt(i - 3) - '0') * 100;
				}
				mark = 0;
				total_num++;
			}
			i++;
		}
		total_num = 0;
		i = 0;
		while (i <= leny)
		{
			////??????????????
			if (stry.charAt(i) != ',' && stry.charAt(i) != '\0')
			{
				mark++;
			}
			else
			{
				if (mark == 1)
				{
					y[total_num] = stry.charAt(i - 1) - '0';
				}
				if (mark == 2)
				{
					y[total_num] = stry.charAt(i - 1) - '0' + (stry.charAt(i - 2) - '0') * 10;
				}
				if (mark == 3)
				{
					y[total_num] = stry.charAt(i - 1) - '0' + (stry.charAt(i - 2) - '0') * 10 + (stry.charAt(i - 3) - '0') * 100;
				}
				mark = 0;
				total_num++;
			}
			i++;
		}
		System.out.print(total_num);
		System.out.print(" ");
		for (i = 0;i < total_num;i++)
		{
			//???????????????
			if (i == 0)
			{
				minx = x[i];
				maxy = y[i];
			}
			else
			{
				if (x[i] < minx)
				{
					minx = x[i];
				}
				if (y[i] > maxy)
				{
					maxy = y[i];
				}
			}
		}
		for (i = minx;i <= maxy;i++)
		{
			//??????????????????????
			for (j = 0;j <= total_num;j++)
			{
				if (x[j] <= i != 0 && y[j]> i)
				{
					num++;
				}
			}
			if (num >= max_num)
			{
				max_num = num;
			}
			num = 0;
		}
		System.out.print(max_num);
		System.out.print("\n");
		return 0;
	}
}
