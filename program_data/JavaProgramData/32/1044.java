import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] beijianshu = new int[200];
	public static int[] jianshu = new int[200];
	public static int[] cha = new int[200];
	public static int len1;
	public static int len2;
	public static int flag;
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static void reverse(String a, String b)
	{
		int i;
		for (i = 0;i < len1;i++)
		{
			beijianshu[i] = a[len1 - i - 1] - '0';
		}
		for (i = 0;i < len2;i++)
		{
			jianshu[i] = b[len2 - i - 1] - '0';
		}
	}
	public static int panduan()
	{
		if (len1 > len2)
		{
			return 1;
		}
		else if (len1 == len2)
		{
			for (int i = 0;i < len1;i++)
			{
				if (a.charAt(i) > b.charAt(i))
				{
					return 1;
				}
				else if (a.charAt(i) < b.charAt(i))
				{
					return -1;
				}
			}
			return 0;
		}
		else
		{
			return -1;
		}
	}
	public static void calculate()
	{
		int i;
		if (flag != 0)
		{
			for (i = 0;i < len1 || i < len2;i++)
			{
				cha[i] = beijianshu[i] - jianshu[i];
			}
			if (flag == 1)
			{
				for (i = 0;i < len1;i++)
				{
					if (cha[i] < 0)
					{
						cha[i + 1]--;
						cha[i] += 10;
					}
				}
			}
			else
			{
				for (i = 0;i <= len2;i++)
				{
					if (cha[i] > 0)
					{
						cha[i] -= 10;
						cha[i + 1]++;
					}
				}
			}
		}
	}
	public static void print()
	{
		int i;
		if (flag == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (i = 199;i >= 0;i--)
			{
				if (cha[i] != 0)
				{
					break;
				}
			}
			if (flag == 1)
			{
				for (;i >= 0;i--)
				{
					System.out.print(cha[i]);
				}
			}
			else
			{
				System.out.print('-');
				for (;i >= 0;i--)
				{
					System.out.print(0 - cha[i]);
				}
			}
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,'\0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(beijianshu,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(jianshu,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(cha,0,(Integer.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			System.in.read();
			len1 = a.length();
			len2 = b.length();
			reverse(a, b);
			flag = panduan();
			calculate();
			print();
		}
		return 0;
	}
}

