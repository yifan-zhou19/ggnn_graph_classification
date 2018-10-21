import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int maxi(int a,int b)
	{
		if (a < b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		char flag = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int[] na = new int[260];
		int[] nb = new int[260];
		int[] sum = new int[260];
		int i;
		int j = 0;
		int lena = a.length();
		int lenb = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(na,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(nb,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		for (i = lena - 1;i >= 0;i--)
		{
			na[j++] = a.charAt(i) - '0';
		}
		j = 0;
		for (i = lenb - 1;i >= 0;i--)
		{
			nb[j++] = b.charAt(i) - '0';
		}
		int m = maxi(lena, lenb);
		for (i = 0;i < m;i++)
		{
			sum[i] += na[i] + nb[i];
			if (sum[i] >= 10)
			{
				sum[i] -= 10;
				sum[i + 1]++;
			}
		}
		i = m;
		while (sum[i] == 0)
		{
			i--; //???????0??
		}
		if (i == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		for (;i >= 0; i--)
		{
			System.out.print(sum[i]);
		}
		return 0;
	}


}
