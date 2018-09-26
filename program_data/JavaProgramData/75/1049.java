package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100000]);
		String str2 = new String(new char[100000]);
		int i;
		int j = 0;
		int num = 0;
		int count = 0;
		int max = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int len;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str1,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str2,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(x,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y,0,(Integer.SIZE / Byte.SIZE));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < str1.length();i++) //?str1???????x?
		{
			if (str1.charAt(i) != ',')
			{
				num = num * 10 + str1.charAt(i) - '0';
				if (i == str1.length() - 1)
				{
					x[j] = num;
				}
				continue;
			}
			if (str1.charAt(i) == ',')
			{
				x[j++] = num;
			}
			num = 0;
		}
		num = 0;
		j = 0;
		for (i = 0;i < str2.length();i++) //?str2???????y?
		{
			if (str2.charAt(i) != ',')
			{
				num = num * 10 + str2.charAt(i) - '0';
				if (i == str2.length() - 1)
				{
					y[j] = num;
				}
				continue;
			}
			if (str2.charAt(i) == ',')
			{
				y[j++] = num;
			}
			num = 0;
		}
		len = j + 1; //??????
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (x[j] == i)
				{
					count++;
				}
				if (y[j] == i)
				{
					count--;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}
		System.out.print(len);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

