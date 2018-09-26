import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len1;
		int len2;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
	System.in.read();
			len1 = 0;
			len2 = 0;
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			while (str1.charAt(len1) != 0)
			{
				len1++;
			}
			while (str2.charAt(len2) != 0)
			{
				len2++;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = len1 - 1;i >= 0;i--)
			{
				a[len1 - 1 - i] = str1.charAt(i) - '0';
			}
			for (i = len2 - 1;i >= 0;i--)
			{
				b[len2 - 1 - i] = str2.charAt(i) - '0';
			}
			for (i = 0;i < len1 || i < len2;i++)
			{
				if (a[i] >= b[i])
				{
					a[i] -= b[i];
				}
				else
				{
					a[i] = a[i] + 10 - b[i];
					a[i + 1]--;
				}
			}
			int count = 99;
			while (a[count] == 0)
			{
				count--;
			}
			for (i = count;i >= 0;i--)
			{
			System.out.print(a[i]);
			}
	System.out.print("\n");
		}
	return 0;
	}
}

