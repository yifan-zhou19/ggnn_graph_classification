package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int[] sum = new int[500];
		int p;
		int max = 0;
		String temp = new String(new char[5]);
		String a = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, a.charAt(i + j));
			}
			for (j = i;j < len - n + 1;j++)
			{
				p = 0;
				for (k = 0;k < n;k++)
				{
					if (temp.charAt(k) == a.charAt(j + k))
					{
						p = 1;
					}
					else
					{
						p = 0;
						break;
					}
				}
				if (p != 0)
				{
					sum[i]++;
				}
			}
		}
		for (i = 0;i < len - n + 1;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < len - n + 1;i++)
			{
				if (sum[i] == max)
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",a.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

