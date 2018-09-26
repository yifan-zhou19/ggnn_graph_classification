import java.util.*;

package <missing>;

public class GlobalMembers
{
	//  **********************************
	//  ****  ?????.cpp  ****
	//  ****  Author ???           ****
	//  ****  ID  1000012895          ****
	//  ****  Date 2010 / 11 / 24     ****
	//  **********************************
	public static int Main()
	{
		int i;
		int j;
		int cou;
		int sum = 1;
		int max = 0;
		int sub;
		int[] num = new int[1000];
		String stra = new String(new char[99999]);
		String strb = new String(new char[99999]);
		int[] a = new int[5000];
		int[] b = new int[5000];
		stra = new Scanner(System.in).nextLine();
		strb = new Scanner(System.in).nextLine();
		for (cou = 0; strb.charAt(cou) != '\0'; cou++)
		{
			if (strb.charAt(cou) == ',')
			{
				sum++;
			}
		}
		i = 0;
		j = 0;
		for (sub = 0; sub <= cou; sub++)
		{
			if (stra.charAt(sub) == ',' || stra.charAt(sub) == '\0')
			{
				a[i] = (stra.charAt(sub - 1) - '0') * 1;
				if (stra.charAt(sub - 2) != ',' && sub - 2 >= 0)
				{
					a[i] += (stra.charAt(sub - 2) - '0') * 10;
					if (stra.charAt(sub - 3) != ',' && sub - 3 >= 0)
					{
						a[i] += (stra.charAt(sub - 3) - '0') * 100;
						if (stra.charAt(sub - 4) != ',' && sub - 4 >= 0)
						{
							a[i] += (stra.charAt(sub - 4) - '0') * 1000;
						}
					}
				}
				i++;
			}
			if (strb.charAt(sub) == ',' || strb.charAt(sub) == '\0')
			{
				b[j] = (strb.charAt(sub - 1) - '0') * 1;
				if (strb.charAt(sub - 2) != ',' && sub - 2 >= 0)
				{
					b[j] += (strb.charAt(sub - 2) - '0') * 10;
					if (strb.charAt(sub - 3) != ',' && sub - 3 >= 0)
					{
						b[j] += (strb.charAt(sub - 3) - '0') * 100;
						if (strb.charAt(sub - 4) != ',' && sub - 4 >= 0)
						{
							b[j] += (strb.charAt(sub - 4) - '0') * 1000;
						}
					}
				}
				j++;
			}
		}
		for (j = 0; j < 1000; j++)
		{
			num[j] = 0;
			for (i = 0; i < sum; i++)
			{
				if (a[i] <= j != 0 && b[i] > j)
				{
					num[j]++;
				}
			}
			if (num[j] > max)
			{
				max = num[j];
			}
		}
		System.out.print(sum);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}
