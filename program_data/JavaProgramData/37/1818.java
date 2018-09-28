package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
		int t;
		int i;
		int k;
		int cnt = 0;
		int flag1 = 0;
		int flag2 = 0;
		int[] a = new int[100000];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (cnt < t)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			flag1 = 0, flag2 = 0;
			int len = str.length();
			a[0] = 1;
			for (i = 1; i < len; i++)
			{
				for (k = 0; k < i; k++)
				{
					flag1 = 0;
					if (str.charAt(i) == str.charAt(k))
					{
							a[k]++;
							flag1 = 1;
							break;
					}
				}
				if (flag1 == 0)
				{
					a[i]++;
				}
			}
			for (i = 0; i < len; i++)
			{
				if (a[i] == 1)
				{
				System.out.print(str.charAt(i));
				System.out.print("\n");
				flag2 = 1;
				break;
				}
			}
			if (flag2 == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			cnt++;
		}
		return 0;
	}

}

