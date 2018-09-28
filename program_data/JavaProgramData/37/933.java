package <missing>;

public class GlobalMembers
{
	public static void find(tangible.RefObject<String> str)
	{
		int i;
		int j;
		int k;
		int len;
		int count = 0;
		int[] num = new int[26];

		len = str.argValue.length();
		for (i = 0; i < len; i++)
		{
			num[count] = (int) * (str.argValue.Substring(i));
			count++;

			if (count > 1)
			{
				for (j = 0; j < count - 1; j++)
				{
					if (num[j] == num[count - 1])
					{
						for (k = j; k < count - 2; k++)
						{
							num[k] = (num + k + 1);
						}
						count -= 2;
					}
				}
			}
		}

		if (count == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%c\n", num[0]);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		String str = new String(new char[100000]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			str = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			find(tempRef_str);
			str = tempRef_str.argValue;
		}

		return 0;
	}
}

