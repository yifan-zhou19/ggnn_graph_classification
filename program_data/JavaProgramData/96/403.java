import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int MAX_LEN = 100;
		int[] num = new int[MAX_LEN + 1];
		int[] result = new int[MAX_LEN];
		int i;
		int r = 0;
		int flag = 0;
		int k;
		String str = new String(new char[MAX_LEN]);
		str = new Scanner(System.in).nextLine();
		int nlen = str.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0, (Integer.SIZE / Byte.SIZE));
		if (nlen == 1)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(str);
		}
		else if (nlen == 2 && str.charAt(0) == '1' && str.charAt(1) < '3')
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(str);
		}
		else
		{
			for (i = 0; i < nlen; i++)
			{
				num[i] = str.charAt(i) - '0';
			}
			for (i = 0; i < nlen; i++)
			{
				result[i] = (r * 10 + num[i]) / 13;
				r = (r * 10 + num[i]) % 13;
				k = r;
				if (r < 0)
				{
					break;
				}
			}
			for (i = 0; i < nlen; i++)
			{
				if (result[i] == 0 && flag == 0)
				{
					continue;
				}
				else
				{
					flag = 1;
					System.out.print(result[i]);
				}
			}
			System.out.print("\n");
			System.out.print(k);
		}
		return 0;
	}

}
