package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[251]);
		String str2 = new String(new char[251]);
		int i = 0;
		int j = 0;
		int len1;
		int len2;
		int[] a = new int[251];
		int[] b = new int[251];
		int[] c = new int[251];
		int pos = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
	//    memset(c,0,sizeof(c));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str1.length();
		len2 = str2.length();
		for (i = len1 - 1;i >= 0;i--)
		{
			a[j++] = str1.charAt(i) - '0';
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			b[j++] = str2.charAt(i) - '0';
		}
		for (i = 0;i < len1 || i < len2;i++)
		{
			a[i] = a[i] + b[i];
			if (a[i] >= 10)
			{
				a[i] = a[i] - 10;
				a[i + 1] = a[i + 1] + 1;
			}
		}
		for (i = 250; i >= 0;i--)
		{
			if (a[i] != 0)
			{
				pos = i;
				break;
			}
		}
		for (i = pos;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

