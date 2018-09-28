import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a = 0;
		int lenth;
		int max = 0;
		String come1 = new String(new char[20000]);
		String leave1 = new String(new char[20000]);
		come1 = new Scanner(System.in).nextLine();
		leave1 = new Scanner(System.in).nextLine();
		lenth = come1.length();
		for (i = 0; i < lenth; i++)
		{
			if (come1.charAt(i) == ',')
			{
				a++;
			}
		}
		a++;
		System.out.print(a);
		System.out.print(" ");
		int[] come = new int[a];
		int[] leave = new int[a];
		int[] at = new int[1000];
		come[0] = Integer.parseInt(come1);
		a = 1;
		for (i = 0; i < lenth; i++)
		{
			if (come1.charAt(i) == ',')
			{
				come[a] = Integer.parseInt(come1.Substring(i) + 1);
				a++;
			}
		}
		lenth = leave1.length();
		leave[0] = Integer.parseInt(leave1);
		a = 1;
		for (i = 0; i < lenth; i++)
		{
			if (leave1.charAt(i) == ',')
			{
				leave[a] = Integer.parseInt(leave1.Substring(i) + 1);
				a++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			at[i] = 0;
		}
		for (i = 0; i < a; i++)
		{
			for (j = come[i]; j < leave[i]; j++)
			{
				at[j]++;
			}
		}
		max = at[0];
		for (i = 1; i < 1000; i++)
		{
			if (at[i] > max)
			{
				max = at[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}
