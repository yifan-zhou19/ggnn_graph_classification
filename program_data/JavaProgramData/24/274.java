package <missing>;

public class GlobalMembers
{
	public static int zimu(char c)
	{
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String str = new String(new char[500]);
		int max1 = 0;
		int max2 = 0;
		int min1 = 0;
		int min2 = 0;
		int max = 0;
		int min = 51;
		int flag = 0;
		int i;
		int k;
		int len = 0;
		str = new Scanner(System.in).nextLine();
		k = str.length();
		if (k > 50)
		{
			k = 50;
		}
		flag = 0;
		for (i = 0;i < k;i++)
		{
			if (zimu(str.charAt(i)) == 1 && flag == 0)
			{
				if (i != k - 1)
				{
				len = 1;
				flag = 1;
				}
				else if (i == k - 1)
				{
					if (max < 1)
					{
						max1 = i;
						max2 = i + 1;
					}

					if (min > 1)
					{
						min1 = i;
						min2 = i + 1;
					}
				}


			}
			else if (zimu(str.charAt(i)) == 1 && flag == 1 && (i != k - 1))
			{
				len++;
			}
			else if (zimu(str.charAt(i)) == 1 && flag == 1 && (i == k - 1))
			{
				len++;
				if (len > max)
				{
					max1 = i - len + 1;
					max2 = i + 1;
					max = len;
				}
				if (len < min)
				{
					min1 = i - len + 1;
					min2 = i + 1;
					min = len;
				}
			}
			else if (zimu(str.charAt(i)) == 0 && flag == 1)
			{
				flag = 0;
				if (len > max)
				{
					max1 = i - len;
					max2 = i;
					max = len;
				}
				if (len < min)
				{
					min1 = i - len;
					min2 = i;
					min = len;
				}
			}
		}
		for (i = max1;i < max2;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		for (i = min1;i < min2;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
	  return 0;
	}
}
