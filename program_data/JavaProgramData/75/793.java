package <missing>;

public class GlobalMembers
{
	public static int p(int n)
	{
		int sum = 1;
		for (int i = 0;i < n;i++)
		{
			sum = sum * 10;
		}
		return sum;
	}
	public static void change(int[] time, String str)
	{
		int j = 0;
		int k = 0;
		for (int i = str.length() - 1;i >= 0;i--)
		{
				if (!str[i].equals(','))
				{
							   time[k] = time[k] + (str[i] - '0') * p(j);
							   j++;
				}
				else
				{
					j = 0;
					k++;
				}
		}
		return;
	}
	public static int length(String str)
	{
		int count = 1;
		for (int i = 0;i < str.length();i++)
		{
				if (str[i].equals(','))
				{
				count++;
				}
		}
		return count;
	}
	public static int Main()
	{
		String str1 = new String(new char[100000]);
		String str2 = new String(new char[100000]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] time1 = new int[1000];
		int[] time2 = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(time1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(time2,0,(Integer.SIZE / Byte.SIZE));
		change(time1, str1);
		change(time2, str2);
		int len1;
		int len2;
		len2 = len1 = length(str1);
		System.out.print(len1);
		System.out.print(' ');
		int[] time = new int[1001];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(time,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < len1;i++)
		{
				for (int j = time1[i];j < time2[i];j++)
				{
					time[j]++;
				}
		}
		int max = 0;
		for (int i = 0;i < 1001;i++)
		{
				if (max < time[i])
				{
					max = time[i];
				}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

