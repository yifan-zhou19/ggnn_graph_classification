import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] t1 = new int[1000];
	public static int[] t2 = new int[1000];
	public static int num = 0;
	public static int m = 0;
	public static void judge(int x)
	{
		int count = 0;
		for (int i = 0;i < num;i++)
		{
			if (x >= t1[i] != 0 && x < t2[i])
			{
				count++;
			}
		}
		if (count > m)
		{
			m = count;
		}
	}
	public static int Main()
	{
		String start = new String(new char[10000]);
		String end = new String(new char[10000]);
		int i = 0;
		int k = 0;
		start = new Scanner(System.in).nextLine();
		end = new Scanner(System.in).nextLine();
		while (start.charAt(i) != '\0')
		{
			if (start.charAt(i) == ',')
			{
				num++;
			}
			i++;
		}
		num = num++;
		System.out.print(num);
		System.out.print(' ');
		i = 0;
		while (start.charAt(i) != '\0')
		{
			if (start.charAt(i) == ',')
			{
				k++;
			}
			else
			{
				t1[k] = 10 * t1[k] + (start.charAt(i) - '0');
			}
			i++;
		}
		i = 0,k = 0;
		while (end.charAt(i) != '\0')
		{
			if (end.charAt(i) == ',')
			{
				k++;
			}
			else
			{
				t2[k] = 10 * t2[k] + (end.charAt(i) - '0');
			}
			i++;
		}
		for (int j = 0;j < 1001;j++)
		{
			judge(j);
		}
		System.out.print(m);
		return 0;
	}

}
