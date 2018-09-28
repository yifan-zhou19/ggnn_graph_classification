package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static int a;
	public static int b;
	public static int num;
	public static int tmp;
	public static int i;
	public static int Main()
	{
		while (scanf("%d%s %d", a, str, b) != EOF)
		{
			num = 0;
			for (i = 0; str.charAt(i); i++)
			{
				if (str.charAt(i) >= 'a')
				{
					str.charAt(i) -= 32;
				}
				tmp = (str.charAt(i) >= 'A' ? str.charAt(i) - 'A' + 10:str.charAt(i) - '0');
				//tmp = str[i]  
				num = num * a + tmp;
			}
			int cnt = 0;
			if (num == 0)
			{
				System.out.println("0");
				continue;
			}
			while (num != 0)
			{
				if (num % b <= 9)
				{
					str = tangible.StringFunctions.changeCharacter(str, cnt++, num % b + '0');
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, cnt++, num % b - 10 + 'A');
				}
				num = num / b;
			}
			for (i = cnt - 1; i >= 0; i--)
			{
				System.out.printf("%c",str.charAt(i));
			}
			System.out.println("");
		}
		return 0;
	}

}

