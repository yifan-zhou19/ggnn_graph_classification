import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int p(int a)
	{
		int sum = 1;
		for (int i = 0;i < a;i++)
		{
				sum = sum * 10;
		}
		return sum;
	}
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int[] num = new int[30];
		int j = 0;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		for (int i = len - 1;i >= 0;i--)
		{
				if ((str.charAt(i) <= '9') && (str.charAt(i) >= '0'))
				{
					   num[k] = num[k] + (str.charAt(i) - '0') * p(j);
					   j++;
				}
				else if ((str.charAt(i + 1) <= '9') && (str.charAt(i + 1) >= '0'))
				{
														 j = 0;
														 k++;
				}
					 else
					 {
						 continue;
					 }
		}
		if ((str.charAt(0) > '9') || (str.charAt(0) < '0'))
		{
			k--;
		}
		for (int i = k;i >= 0;i--)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
