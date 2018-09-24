import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void Sum(int[] a1, int[] a2)
	{
		int i;
		for (i = 0; i < 250; i++)
		{
			a1[i] += a2[i];
			if (a1[i] >= 10)
			{
				a1[i + 1]++;
				a1[i] -= 10;
			}
		}
		for (i = 250; i >= 0; i--)
		{
			if (a1[i] != 0)
			{
				break;
			}
		}
		if (i < 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (; i >= 0; i--)
			{
				System.out.print(a1[i]);
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		String a1 = new String(new char[300]);
		String a2 = new String(new char[300]);
		int[] b1 = new int[300];
		int[] b2 = new int[300];
		int len1;
		int len2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b2, 0, (Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		a1 = new Scanner(System.in).nextLine();
		len1 = a1.length();
		a2 = new Scanner(System.in).nextLine();
		len2 = a2.length();
		j = 0;
		for (i = len1 - 1; i >= 0; i--)
		{
			b1[j++] = a1.charAt(i) - '0';
		}
		j = 0;
		for (i = len2 - 1; i >= 0; i--)
		{
			b2[j++] = a2.charAt(i) - '0';
		}
		Sum(b1, b2);
		return 0;
	}
}
