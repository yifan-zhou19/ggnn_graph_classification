package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static String b = new String(new char[1000]);
	public static int[] c = new int[1000];
	public static int[] d = new int[1000];
	public static int[] result = new int[1000];
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1;
		int len2;
		int i;
		int j = 0;
		len1 = a.length();
		len2 = b.length();
		for (i = len1 - 1;i >= 0;i--)
		{
			c[j] = a.charAt(i) - '0';
			j++;
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			d[j] = b.charAt(i) - '0';
			j++;
		}
		for (i = 0;i < len1 || i < len2;i++)
		{
			result[i] = c[i] + d[i] + result[i];
			if (result[i] >= 10)
			{
				result[i + 1]++;
				result[i] = result[i] - 10;
			}
		}
		i = 999;
		while (result[i] == 0 && i >= 0)
		{
			i--;
		}
		if (i < 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			for (j = i;j >= 0;j--)
			{
				System.out.print(result[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}









}

