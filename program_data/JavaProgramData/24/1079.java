import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] spa = new int[100];
		int[] length = new int[100];
		int i;
		int j = 0;
		int max;
		int min;
		int max_i;
		int min_i;
		int size;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) == ' ')
			{
				spa[j] = i;
				j++;
			}
		}
		size = i;
		for (i = 1;i < j;i++)
		{
			length[i] = spa[i] - spa[i - 1] - 1;
		}
		length[0] = spa[0];
		length[j] = size - spa[j - 1] - 1;
		max = min = length[0];
		max_i = min_i = 0;
		for (i = 0;i <= j;i++)
		{
			if (length[i] > max)
			{
				max = length[i], max_i = i;
			}
			if (length[i] < min)
			{
				min = length[i], min_i = i;
			}
		}
		if (max_i == 0)
		{
			for (i = 0;i < spa[0];i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		else if (max_i < j)
		{
			for (i = spa[max_i - 1] + 1;i < spa[max_i];i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		else if (max_i == j)
		{
			for (i = spa[j - 1] + 1;i < size;i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.print("\n");
		if (min_i == 0)
		{
			for (i = 0;i < spa[0];i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		else if (min_i < j)
		{
			for (i = spa[min_i - 1] + 1;i < spa[min_i];i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		else if (min_i == j)
		{
			for (i = spa[j - 1] + 1;i < size;i++)
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}
}
