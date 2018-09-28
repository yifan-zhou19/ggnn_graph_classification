package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int l1;
		int l2;
		for (int i = 0;i < n;i++)
		{
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a2,0,(Integer.SIZE / Byte.SIZE));
			l1 = str1.length();
			l2 = str2.length();
			int k1 = 0;
			int k2 = 0;
			for (int j = l1 - 1;j >= 0;j--)
			{
				a1[k1++] = str1.charAt(j) - '0';
			}
			for (int j = l2 - 1;j >= 0;j--)
			{
				a2[k2++] = str2.charAt(j) - '0';
			}
			for (int j = 0;j < 100;j++)
			{
				a1[j] = a1[j] - a2[j];
				if (a1[j] < 0)
				{
					a1[j] += 10;
					a1[j + 1]--;
				}
			}
			int k = 99;
			while (a1[k] == 0)
			{
				k--;
			}
			for (;k >= 0;k--)
			{
				System.out.print(a1[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

