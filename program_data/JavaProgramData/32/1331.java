package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int cnt = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		String num1 = new String(new char[101]);
		String num2 = new String(new char[101]);
		while (cnt < n)
		{
			num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len1 = num1.length();
			int len2 = num2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c, 0, (Integer.SIZE / Byte.SIZE));
			j = 0;
			for (i = len1 - 1; i >= 0; i--)
			{
				a[j++] = num1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1; i >= 0; i--)
			{
				b[j++] = num2.charAt(i) - '0';
			}
			for (i = 0; i < len2; i++)
			{
				if (a[i] < b[i])
				{
					if (a[i] == -1)
					{
						a[i] = 9;
					}
					else
					{
						a[i] += 10;
					}
					a[i + 1]--;
				}
				c[i] = a[i] - b[i];
			}
			if (len1 > len2)
			{
				for (i = len2; i < len1; i++)
				{
					c[i] = a[i];
				}
			}
			for (i = len1 - 1 ; i >= 0; i--)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
			cnt++;
		}
		return 0;
	}

}

