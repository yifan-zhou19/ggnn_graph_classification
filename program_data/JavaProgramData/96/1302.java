package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[105]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		int num = 0;
		int[] shang = new int[105];
		int j = 0;
		int sign = 0;
		int flag = 0;
		for (int i = 0; str.charAt(i) != '\0'; i++)
		{
			num += str.charAt(i) - '0';
			if (num >= 13)
			{
				flag = 1;
				shang[j++] = num / 13;
				if (str.charAt(i + 1) != '\0')
				{
					num = (num % 13) * 10;
				}
				else
				{
					num = num % 13;
				}
			}
			else if (str.charAt(i + 1) != '\0')
			{
				num *= 10;
				shang[j++] = 0;
			}
			else
			{
				shang[j++] = 0;
			}
		}
		if (flag == 0)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(num);
			System.out.print("\n");
		}
		else
		{
			for (int i = 0; i < j; i++)
			{
				if (sign == 0 && shang[i] == 0)
				{
					;
				}
				else
				{
					System.out.print(shang[i]);
					sign = 1;
				}
			}
		System.out.print("\n");
		System.out.print(num);
		}
		return 0;
	}




}

