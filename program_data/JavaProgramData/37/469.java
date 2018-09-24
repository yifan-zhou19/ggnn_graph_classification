package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
		int[] a = new int[26];
		int i;
		int j;
		int n;
		int len;
		int flag = 1;
		int symbol = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (j = 0;j < n;j++)
		{
			symbol = 1;
			flag = 1;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (i = 0;i < len;i++)
			{
				a[str.charAt(i) - 97] += 1;
			}
			for (i = 0;i < 26;i++)
			{
				if (a[i] != 1)
				{
					flag *= 1;
				}
				else
				{
					flag *= 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.print("no\n");
			}
			else
			{
				for (i = 0;i < len;i++)
				{
					if (a[str.charAt(i) - 97] == 1)
					{
						System.out.printf("%c\n",str.charAt(i));
						break;
					}
				}
			}
			for (i = 0;i < 26;i++)
			{
				a[i] = 0;
			}
		}
		return 0;
	}



}

