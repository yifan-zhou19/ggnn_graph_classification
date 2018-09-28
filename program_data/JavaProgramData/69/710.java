import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void add(String str1, String str2)
	{
		int[] a1 = new int[260];
		int[] a2 = new int[260];
		int[] sum = new int[260];
		int i;
		int j;
		int la;
		int lb;
		la = str1.length();
		lb = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
		i = la - 1;
		j = 0;
		while (i >= 0)
		{
			a1[j++] = str1[i--] - '0';
		}
		i = lb - 1;
		j = 0;
		while (i >= 0)
		{
			a2[j++] = str2[i--] - '0';
		}
		for (i = 0;i < la && i < lb;i++)
		{
			sum[i] += a1[i] + a2[i];
			if (sum[i] >= 10)
			{
				sum[i] = sum[i] - 10;
				sum[i + 1] += 1;
			}
		}
		if (i == la)
		{
			for (i = la;i < lb;i++)
			{
				sum[i] += a2[i];
				if (sum[i] >= 10)
				{
					sum[i] -= 10;
					sum[i + 1] += 1;
				}
			}
		}
		else
		{
			for (i = lb;i < la;i++)
			{
				sum[i] += a1[i];
				if (sum[i] >= 10)
				{
					sum[i] -= 10;
					sum[i + 1] += 1;
				}
			}
		}
		i = 259;
		while (sum[i] == 0)
		{
			i--;
		}
		if (i == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (;i >= 0;i--)
			{
				System.out.print(sum[i]);
			}
		}
	}
	public static int Main()
	{
		String str1 = new String(new char[260]);
		String str2 = new String(new char[260]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		add(str1, str2);
		return 0;
	}


}
