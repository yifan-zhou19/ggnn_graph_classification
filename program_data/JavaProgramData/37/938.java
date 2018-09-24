package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int count;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[100000]);
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			int len = s.length();
			int sum = 0;
			for (j = 0;j < len;j++)
			{
				int count = 0;
				for (k = 0;k < len;k++)
				{
					if (s.charAt(j) != s.charAt(k))
					{
						count++;
					}
				}
				if (count == len - 1)
				{
					sum++;
				}
			}
			if (sum == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;j < len;j++)
				{
					count = 0;
					for (k = 0;k < len;k++)
					{
						if (s.charAt(j) != s.charAt(k))
						{
							count++;
						}
					}
					if (count == len - 1)
					{
						System.out.printf("%c\n",s.charAt(j));
						break;
					}
				}
			}
		}

	}


}

