import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int m(int[] c, int p)
	{
		if (c[p] >= 10) //?c[p]???10??????????c[p+1],p+1
		{
			c[p] -= 10;
			c[p + 1]++;
			return (c[p + 1],p + 1);
		}
		else //????1
		{
			return 1;
		}
	}
	public static int Main()
	{
		final int MAX_LEN = 251;
		int[] an1 = new int[MAX_LEN];
		int[] an2 = new int[MAX_LEN];
		int n;
		char[] seLine1 = {0};
		char[] seLine2 = {0};
			int p = 0;
			seLine1 = new Scanner(System.in).nextLine();
			seLine2 = new Scanner(System.in).nextLine();
			int nLen1 = seLine1.length();
			int nLen2 = seLine2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an2, 0,(Integer.SIZE / Byte.SIZE));
			int i;
			int j = 0;
			for (i = nLen1 - 1; i >= 0; i--)
			{
				an1[j++] = seLine1[i] - '0'; //???????????????
			}
			j = 0;
			for (i = nLen2 - 1; i >= 0;i--)
			{
				an2[j++] = seLine2[i] - '0';
			}
			for (i = 0; i < MAX_LEN ;i++)
			{
				an1[i] += an2[i];
				p = i;
				if (m(an1, p) != 0) //??????
				{
					continue;
				}
			}
			i = MAX_LEN - 1;
			while (an1[i] == 0 && i > 0)
			{
				i--; //???????0??
			}
			for (;i >= 0; i--)
			{
				System.out.print(an1[i]);
			}
	}
}
