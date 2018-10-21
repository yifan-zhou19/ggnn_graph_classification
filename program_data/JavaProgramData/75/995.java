import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] time = new int[1001];
		String x = new String(new char[10000]);
		char ch;
		int[] tem = new int[1001];
		int max = 0;
		int count = 1;
		int len;
		int[] come = new int[1001];
		int[] go = new int[1001];
		int i;
		int j;
		x = new Scanner(System.in).nextLine();
		len = x.length();
		for (i = 0; i <= 1000;i++)
		{
			time[i] = 0;
		}
		for (i = 0 ; i <= len - 1 ; i++)
		{
			if (x.charAt(i) == ',')
			{
				tem[count] = i;
				count++;
			}
			tem[count] = len;
			tem[0] = -1;
		}
		for (i = 1 ; i <= count ; i++)
		{
			if ((tem[i] - tem[i - 1]) == 2)
			{
				come[i] = x.charAt(tem[i] - 1) - 48;
			}
			if ((tem[i] - tem[i - 1]) == 3)
			{
				come[i] = x.charAt(tem[i] - 1) - 48 + 10 * (x.charAt(tem[i] - 2) - 48);
			}
			if ((tem[i] - tem[i - 1]) == 4)
			{
				come[i] = x.charAt(tem[i] - 1) - 48 + 10 * (x.charAt(tem[i] - 2) - 48) + 100 * (x.charAt(tem[i] - 3) - 48);
			}
		}
		for (i = 1 ; i <= count - 1 ; i++)
		{
			go[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		go[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= count ; i++)
		{
			for (j = come[i] ; j < go[i] ; j++)
			{
				time[j]++;
			}
		}
		for (i = 0 ; i <= 999 ; i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(count);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

