import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int len1;
		int len2;
		int i;
		int j;
		int n;
		int k;
		String a1 = new String(new char[101]);
		String b1 = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			System.in.read();
			a1 = new Scanner(System.in).nextLine();
			b1 = new Scanner(System.in).nextLine();

			len1 = a1.length();
			len2 = b1.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
			j = 0;
			for (i = len1 - 1; i >= 0; i--)
			{
				a[j++] = a1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1; i >= 0; i--)
			{
				b[j++] = b1.charAt(i) - '0';
			}
			for (i = 0; i < 100; i++)
			{
				a[i] = a[i] - b[i];
				if (a[i] < 0)
				{
					a[i] = 10 + a[i];
					a[i + 1]--;
				}
			}
			i = 99;
			while (a[i] == 0)
			{
				i--;
			}
			for (; i >= 0; i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

