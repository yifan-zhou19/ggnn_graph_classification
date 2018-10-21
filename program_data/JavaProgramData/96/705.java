import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int[] result = new int[1000];
		int remainder;
		int[] x = new int[1000];
		int k;
		int[] b = new int[1000];
		int i;
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			x[i] = a.charAt(i) - '0';
		}
		if (i == 1)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(x[0]);
		}
		else if (i == 2 && (10 * x[0] + x[1] < 13))
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(10 * x[0] + x[1]);
		}
		else
		{
			for (i = 1; a.charAt(i) != '\0'; i++)
			{
				b[i] = (10 * x[i - 1] + x[i]) / 13;
				x[i] = (10 * x[i - 1] + x[i]) % 13;
				k = i;
			}
			remainder = x[k];
			for (i = k; i >= 1; i--)
			{
				if (b[i] < 10)
				{
					result[i] = b[i];
				}
				else
				{
					result[i] = b[i] % 10;
					result[i - 1] = result[i - 1] + b[i] / 10;
				}
			}
			if (result[1] != 0)
			{
				System.out.print(result[1]);
			}
			for (i = 2; i <= k; i++)
			{
				System.out.print(result[i]);
			}
			System.out.print("\n");
			System.out.print(remainder);
		}
		return 0;
	}
}
