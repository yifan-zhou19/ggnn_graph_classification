import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[300]);
	public static String b = new String(new char[300]);
	public static int[] c = new int[300];
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int num1;
		int num2;
		int num = 0;
		int flag = 0;
		num1 = a.length();
		num2 = b.length();
		if (num1 >= num2)
		{
			for (int j = num2 - 1;j >= 0;j--)
			{
				c[num] += a.charAt(j + num1 - num2) - '0' + b.charAt(j) - '0';
				if (c[num] >= 10)
				{
					c[num] -= 10;
					c[num + 1] += 1;
				}
				num++;
			}
			for (int i = num1 - num2 - 1;i >= 0;i--)
			{
				c[num] += a.charAt(i) - '0';
				if (c[num] >= 10)
				{
					c[num] -= 10;
					c[num + 1] += 1;
				}
				num++;
			}
			if (c[num] == 0)
			{
				for (int i = (num - 1);i >= 0;i--)
				{
					if (c[i] != 0)
					{
						flag = 1;
					}
					if (flag == 1)
					{
						System.out.print(c[i]);
					}
				}
				if (flag == 0)
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
			else
			{
				for (int i = (num);i >= 0;i--)
				{
					System.out.print(c[i]);
				}
			}
		}
		else
		{
			for (int j = num1 - 1;j >= 0;j--)
			{
				c[num] += b.charAt(j + num2 - num1) - '0' + a.charAt(j) - '0';
				if (c[num] >= 10)
				{
					c[num] -= 10;
					c[num + 1] += 1;
				}
				num++;
			}
			for (int i = num2 - num1 - 1;i >= 0;i--)
			{
				c[num] += b.charAt(i) - '0';
				if (c[num] >= 10)
				{
					c[num] -= 10;
					c[num + 1] += 1;
				}
				num++;
			}
			if (c[num] == 0)
			{
				for (int i = (num - 1);i >= 0;i--)
				{
					if (c[i] != 0)
					{
						flag = 1;
					}
					if (flag == 1)
					{
						System.out.print(c[i]);
					}
				}
			}
			else
			{
				for (int i = (num);i >= 0;i--)
				{
					System.out.print(c[i]);
				}
			}
		}
		return 0;
	}
}
