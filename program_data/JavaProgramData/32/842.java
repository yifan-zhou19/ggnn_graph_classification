import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String numa = new String(new char[201]);
		String numb = new String(new char[201]);
		int[] a = new int[201];
		int[] b = new int[201];
		int[] result = new int[201];
		int n;
		int i;
		int j;
		int k;
		int la;
		int lb;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			k = 0;
			cin.ignore();
			numa = new Scanner(System.in).nextLine();
			numb = new Scanner(System.in).nextLine();
			la = numa.length();
			lb = numb.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(result, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 0; i < la; i++)
			{
				a[i] = numa.charAt(i) - '0';
			}
			for (j = 0; j < lb; j++)
			{
				b[j] = numb.charAt(j) - '0';
			}
			for (i = la - 1, j = lb - 1; i >= 0; i--, j--)
			{
				if (b[j] > a[i])
				{
					b[j - 1]++;
					result[i] = 10 + a[i] - b[j];
				}
				else
				{
					result[i] = a[i] - b[j];
				}
			}
			while (result[k] == 0)
			{
				k++;
			}
			for (i = k; i < la; i++)
			{
				System.out.print(result[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

