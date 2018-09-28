package <missing>;

public class GlobalMembers
{
	public static int function(int[] _a, int[] _b, int num) //?????????????????
	{
		int i;
		int j;
		int max;
		int[] count = new int[1000];
		for (i = 0;i < num;i++) //??????????
		{
			for (j = 0;j < 1000;j++)
			{
				if (_a[i] <= j != 0 && _b[i] >= j + 1)
				{
					count[j]++;
				}
			}
		}
		max = count[0];
		for (i = 0;i < 1000;i++) //?????
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		return max;
	}


	public static int Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int[] _a = new int[10000];
		int[] _b = new int[10000];
		int max;
		int len1;
		int len2;
		int i;
		int j = 0;
		int num = 1;
		int temp = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len2 = b.length();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ',')
			{
				num++;
			}
		}
		for (i = 0;i <= len1;i++) //????a???int?
		{
			  if (a.charAt(i) != ',' && a.charAt(i) != '\0')
			  {
				  temp++;
			  }
			  else
			  {
					switch (temp)
					{
					case 1:
					{
						_a[j] = a.charAt(i - 1) - '0';
						break;
					}
					case 2:
					{
						_a[j] = 10 * (a.charAt(i - 2) - '0') + a.charAt(i - 1) - '0';
						break;
					}
					case 3:
					{
						_a[j] = 100 * (a.charAt(i - 3) - '0') + 10 * (a.charAt(i - 2) - '0') + a.charAt(i - 1) - '0';
						break;
					}
					}
					temp = 0;
					j++;
					continue;
			  }
		}
		j = 0;
		temp = 0;
		for (i = 0;i <= len2;i++) //????b???int?
		{
				if (b.charAt(i) != ',' && b.charAt(i) != '\0')
				{
					temp++;
				}
				else
				{
					switch (temp)
					{
					case 1:
					{
						_b[j] = b.charAt(i - 1) - '0';
						break;
					}
					case 2:
					{
						_b[j] = 10 * (b.charAt(i - 2) - '0') + b.charAt(i - 1) - '0';
						break;
					}
					case 3:
					{
						_b[j] = 100 * (b.charAt(i - 3) - '0') + 10 * (b.charAt(i - 2) - '0') + b.charAt(i - 1) - '0';
						break;
					}
					}
					temp = 0;
					j++;
					continue;
				}
		}
		max = function(_a, _b, num);
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

