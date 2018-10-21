import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static int[] sex = new int[100];
	public static int[] flag = new int[100];
	public static int requeue(int n)
	{
		if (n == 0)
		{
		return 0;
		}
		int i;
		int t;
		int l;
		for (i = 0;i < n - 1;i++)
		{
			if (sex[i] == 0 && sex[i + 1] == 1)
			{
				System.out.print(i + flag[i]);
				System.out.print(" ");
				System.out.print(i + 1 + flag[i + 1]);
				System.out.print("\n");
				if (i == n - 2)
				{
				break;
				}
				else
				{
					for (t = i + 2; t < n; t++)
					{
						sex[t - 2] = sex[t];
						flag[t] += 2;
					}
					for (t = i;t < n - 2;t++)
					{
						flag[t] = flag[t + 2];
					}
					break;
				}
			}
		}
		return requeue(n - 2);
	}
	public static int Main()
	{
		int j;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (j = 1; j < len; j++)
		{
			if (str.charAt(j) == str.charAt(0))
			{
				sex[j] = 0;
			}
			else
			{
				sex[j] = 1;
			}
		}
		requeue(len);
		return 0;
	}

}
