package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                            **
	//*????? 1100013004                     **
	//*???2010.11.13                          **
	//****************************************
	public static int a;
	public static int b;
	public static int i;
	public static int j;
	public static int n;
	public static int sum = 0;
	public static int mi;
	public static int k = 1;
	public static String num = new String(new char[100]);
	public static String input = new String(new char[100]);
	public static void calc()
	{
	for (i = n - 1; i >= 0 ;i--)
	{
			if (num.charAt(i) <= '9')
			{
				sum += (num.charAt(i) - '0') * k;
			}
			else
			{
				if (num.charAt(i) <= 'Z')
				{
					sum += ((num.charAt(i) - 'A') + 10) * k;
				}
				else
				{
					sum += ((num.charAt(i) - 'a') + 10) * k;
				}
			}
		   k *= a;
	}
	}
	public static int Main()
	{

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		cin.getline(num,100,' ');
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; num.charAt(i) != 0;i++)
		{
			;
		}
		n = i;
		calc();
		i = 0;
		do
		{
			mi = sum % b;
			if (mi < 10)
			{
				input = tangible.StringFunctions.changeCharacter(input, i, mi + '0');
			}
			else
			{
				input = tangible.StringFunctions.changeCharacter(input, i, 'A' + mi - 10);
			}
			sum = sum / b;
			i++;
		}while (sum > 0);
		for (j = i - 1;j >= 0;j--)
		{
			System.out.print(input.charAt(j));
		}
		return 0;
	}



}

