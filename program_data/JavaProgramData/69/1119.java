import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[260];
		int[] a2 = new int[260];
		String l1 = new String(new char[260]);
		String l2 = new String(new char[260]);
		l1 = new Scanner(System.in).nextLine();
		l2 = new Scanner(System.in).nextLine();
		int len1 = l1.length();
		int len2 = l2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
		int i;
		int j = 0;
		for (i = len1 - 1;i >= 0;i--)
		{
			a1[j++] = l1.charAt(i) - '0';
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			a2[j++] = l2.charAt(i) - '0';
		}
		int max = (len1 > len2 != 0?len1:len2);
		for (int i = 0;i < max;i++)
		{
			a1[i] += a2[i];
			if (a1[i] > 9)
			{
				a1[i] -= 10;
				a1[i + 1]++;
			}
		}
		i = max;
		while (a1[i] == 0 && i > 0)
		{
			i--;
		}
		if (i == 0)
		{
			System.out.print(0);
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(a1[i]);
			}
		}
		return 0;
	}
}
