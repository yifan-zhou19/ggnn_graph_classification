import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[max]);
		String s2 = new String(new char[max]);
		int[] a1 = new int[max];
		int[] a2 = new int[max];
		int i;
		int j;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0;i < max;i++)
		{
			a1[i] = 0;
			a2[i] = 0;
		}
		int len1 = s1.length();
		int len2 = s2.length();
		for (i = 0;i < len1;i++)
		{
			a1[i] = s1.charAt(len1 - 1 - i) - '0';
		}
		for (i = 0;i < len2;i++)
		{
			a2[i] = s2.charAt(len2 - 1 - i) - '0';
		}
		for (i = 0;i < max;i++)
		{
			a1[i] = a1[i] + a2[i];
			if (a1[i] >= 10)
			{
				a1[i + 1]++;
				a1[i] -= 10;
			}
		}
		for (i = max - 1;i >= 0;i--)
		{
			if (a1[i] != 0)
			{
				break;
			}
		}
		if (i == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
		for (j = i;j >= 0;j--)
		{
			System.out.print(a1[j]);
		}
		}
		return 0;
	}

}
