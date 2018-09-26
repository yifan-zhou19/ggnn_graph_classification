import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] c = new int[251];
		int[] d = new int[251];
		int[] sum = new int[251];
		int len = 0;
		int temp = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum, 0, (Integer.SIZE / Byte.SIZE));
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0; i < a.length() - 1; i++)
		{
			if (a.charAt(i) != '0')
			{
				break;
			}
		}
		temp = i;
		for (i = 0; i < a.length() - temp; i++)
		{
			c[i] = a.charAt(a.length() - 1 - i) - '0';
		}
		len = i;
		i = 0;
		for (i = 0; i < b.length() - 1; i++)
		{
			if (b.charAt(i) != '0')
			{
				break;
			}
		}
		temp = i;
		for (i = 0; i < b.length() - temp; i++)
		{
			d[i] = b.charAt(b.length() - 1 - i) - '0';
		}
		if (i > len)
		{
			len = i;
		}
		for (i = 0; i < len; i++)
		{
			sum[i] = sum[i] + c[i] + d[i];
			if (sum[i] >= 10)
			{
				sum[i] -= 10;
				sum[i + 1]++;
			}
		}
		if (sum[len] != 0)
		{
			len++;
		}
		for (i = len - 1; i >= 0; i--)
		{
			System.out.print(sum[i]);
		}
		return 0;
	}
}
