import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t1 = new int[1000];
		int p = 0;
		int max = 0;
		int n;
		int[] t2 = new int[1000];
		String time1 = new String(new char[100000]);
		String time2 = new String(new char[100000]);
		int i = 1;
		int j;
		int k;
		int l;
		int m = 0;
		int ct = 0;
		time1 = new Scanner(System.in).nextLine();
		time2 = new Scanner(System.in).nextLine();
		for (l = 0; time1.charAt(l) > 0; l++)
		{
			if (time1.charAt(l) == ',')
			{
				m++;
				p++;
			}
			else
			{
				t1[m] = t1[m] * 10 + time1.charAt(l) - 48;
			}
		}
		m = 0;
		for (l = 0; time2.charAt(l) > 0; l++)
		{
			if (time2.charAt(l) == ',')
			{
				m++;
			}
			else
			{
				t2[m] = t2[m] * 10 + time2.charAt(l) - 48;
			}
		}
		for (j = 0; j <= 999; j++)
		{
			n = 0;
			for (k = 0; k <= p; k++)
			{
				if (j < t2[k] && j >= t1[k])
				{
					n++;
				}
			}
			if (max < n)
			{
				max = n;
			}
		}
		System.out.print(p + 1);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}
