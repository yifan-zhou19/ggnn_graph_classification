package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String str = new String(new char[100000]);
		int i;
		int j;
		int k = 0;
		int flag = 0;
		int len = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			k = 0;
			len = 0;
			j = 0;
			flag = 0;
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (j = 0;j < len;j++,flag = 0)
			{
				for (k = 0;k < len;k++)
				{
					if (str.charAt(k) == str.charAt(j))
					{
						flag++;
					}
				}
				if (flag == 1)
				{
					System.out.printf("%c\n",str.charAt(j));
					break;
				}
				else
				{
					if (j == len - 1)
					{
						System.out.print("no\n");
						break;
					}
				}
			}
		}
	}

}

