package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String str = new String(new char[Maxlength + 2]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		int len = str.length();
		int[] number = new int[len - n + 1];
		//printf("1.0");
		for (int i = 0;i < len - n + 1;i++)
		{
			number[i] = 1;
			int t = 1;
			//printf("1.1");
			while (t <= (len - n - i))
			{
				//printf("1.2");
				for (int j = 0;j < n;j++)
				{
					//printf("1.3");
					if (*(str.Substring(i) + j) != *(str.Substring(i) + j + t))
					{
						t++;
						//printf("1.4");
						break;
					}
					else if (j == (n - 1) && *(str.Substring(i) + j) == *(str.Substring(i) + j + t))
					{
						//printf("1.5\n");
						//printf("%s %s",(str+i),(str+i+t));
						t++;
						number[i]++;

					}
				}
			}
		}

		int maxtimes = 1;
		for (int j = 1;j <= (len - n + 1);j++)
		{
			if (maxtimes != 1)
			{
				//printf("3");
				break;
			}
			for (int i = 0;i < len - n + 1;i++)
			{
				if (j < number[i])
				{
					//printf("2");
					break;
				}
				if (i == len - n)
				{
					for (int k = 0;k < len - n + 1;k++)
					{
						if (j == number[k])
						{
							maxtimes = j;
							break;
						}
					}
				}
			}
		}

		if (maxtimes == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",maxtimes);
			for (int i = 0;i < len - n + 1;i++)
			{
				if (maxtimes == number[i])
				{
					for (int j = 0;j < n;j++)
					{
						System.out.printf("%c",*(str.Substring(i) + j));
					}
					System.out.print("\n");
				}
			}
		}
		return 1;
	}
}

