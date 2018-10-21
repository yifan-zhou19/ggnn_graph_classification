package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int k;
		int l;
		int[] num = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100000]);
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (j = 0;j < l;j++)
			{
				num[j] = 1;
			}
			for (j = 0;j < l - 1;j++)
			{
				for (k = j + 1;k < l;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						num[j] += 1;
						num[k] = num[j];
					}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (num[j] == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
				if (j == l - 1 && num[j] != 1)
				{
					System.out.print("no\n");
				}
			}
		}
	}

}

