package <missing>;

public class GlobalMembers
{
	//???2010?12?15?

	//???1000010586_???

	//???2?N??

	public static void Jisuan(String num)
	{
		int i;
		num[49] = num[49] + num[49] - '0';
		for (i = 49 ; i >= 1 ; i--)
		{
			if (num[i].compareTo('9') > 0)
			{
				num[i] = num[i] - 10;
				num[i - 1] = num[i - 1] + num[i - 1] - '0' + 1;
			}
			else
			{
				num[i - 1] = num[i - 1] + num[i - 1] - '0';
			}
		}
	}
	public static int Main()
	{
		String num = new String(new char[50]);
		int N;
		int i;
		for (i = 0 ; i <= 49 ; i++)
		{
			num = tangible.StringFunctions.changeCharacter(num, i, '0');
		}
		num = tangible.StringFunctions.changeCharacter(num, 49, '2');
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print(1);
		}
		else
		{
			for (i = 1 ; i <= N - 1 ; i++)
			{
				Jisuan(num);
			}
			for (i = 0 ; i <= 49 ; i++)
			{
				if (num.charAt(i) != '0')
				{
					 System.out.print(num.charAt(i));
					 break;
				}
			}
			for (i = i + 1 ; i <= 49 ; i++)
			{
				System.out.print(num.charAt(i));
			}
		}
		return 0;
	}



}

