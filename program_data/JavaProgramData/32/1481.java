package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		String b1 = new String(new char[101]);
		String b2 = new String(new char[101]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < n;k++)
		{
			b1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int l1 = b1.length();
			int l2 = b2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a2,0,(Integer.SIZE / Byte.SIZE));
			int j = 0;
			for (int i = l1 - 1;i >= 0;i--)
			{
				a1[j++] = b1.charAt(i) - '0';
			}
			j = 0;
			for (int i = l2 - 1;i >= 0;i--)
			{
				a2[j++] = b2.charAt(i) - '0';
			}
			for (int i = 0;i < 100;i++)
			{
				if (a1[i] < a2[i])
				{
					a1[i] = 10 + a1[i] - a2[i];
					a1[i + 1]--;
				}
				else
				{
					a1[i] = a1[i] - a2[i];
				}
			}
			int i = 99;
			while (a1[i] == 0)
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.print(a1[i]);
			}
				System.out.print("\n");
		}
		return 0;
	}
}

