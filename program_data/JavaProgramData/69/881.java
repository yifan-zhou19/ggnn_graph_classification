import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static final int maxlen = 250;
	public static int Main()
	{
		String num1 = new String(new char[maxlen + 1]);
		String num2 = new String(new char[maxlen + 1]);
		int[] a = new int[maxlen];
		int[] b = new int[maxlen];
		int len1;
		int len2;
		num1 = new Scanner(System.in).nextLine();
		num2 = new Scanner(System.in).nextLine();
		len1 = num1.length();
		len2 = num2.length();
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (int i = len1 - 1;i >= 0;i--)
		{
			a[j] = num1.charAt(i) - '0';
			j++;
		}
		j = 0;
		for (int i = len2 - 1;i >= 0;i--)
		{
			b[j] = num2.charAt(i) - '0';
			j++;
		}
		for (int i = 0;i < maxlen;i++)
		{
			a[i] += b[i];
			if (a[i] >= 10)
			{
					a[i] -= 10;
					a[i + 1]++;
			}
		}
	   int i = maxlen - 1;
	while (a[i] == 0)
	{
		i--;
	}
	if (i >= 0)
	{
	for (;i >= 0;i--)
	{
		System.out.print(a[i]);
	}
	}
	else
	{
		System.out.print("0");
	}
	System.out.print("\n");
	return 0;
	}
}
