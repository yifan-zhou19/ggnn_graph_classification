import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[maxx];
	public static int[] b = new int[maxx];
	public static int[] c = new int[maxx];
	public static String temp = new String(new char[maxx]);
	public static int Main()
	{
		int n;
		int mm;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		temp = new Scanner(System.in).nextLine();
		a[0] = temp.length();
		for (int i = a[0]; i >= 1; --i)
		{
			a[a[0] - i + 1] = temp.charAt(i - 1) - '0';
		}
		while (a[a[0]] == 0 && a[0] > 1)
		{
			a[0]--;
		}
		temp = new Scanner(System.in).nextLine();
		b[0] = temp.length();
		for (int i = b[0]; i >= 1; --i)
		{
			b[b[0] - i + 1] = temp.charAt(i - 1) - '0';
		}
		while (b[b[0]] == 0 && b[0] > 1)
		{
			b[0]--;
		}
		int len = Math.max(a[0],b[0]);
		int temp = 0;
		int tempsum;
		for (int i = 1; i <= len; ++i)
		{
			tempsum = a[i] + b[i] + temp;
			c[i] = (tempsum) % 10;
			if (tempsum >= 10)
			{
				temp = 1;
			}
			else
			{
				temp = 0;
			}
		}
		if (temp == 1)
		{
			c[len + 1] += 1;
			len = len + 1;
		}

		for (int i = len; i >= 1; --i)
		{
			System.out.print(c[i]);
		}

		return 0;
	}
}
