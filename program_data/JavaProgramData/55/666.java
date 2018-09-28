package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //????a?b?????i?j?????temp
		int b;
		int i = 0;
		int j = 0;
		int s = 0;
		int temp;
		String str1 = new String(new char[32]); //?????str1,str2
		String str2 = new String(new char[32]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
		i++;
		} while (str1.charAt(i) != '\0'); //?????str1???
		for (int k = 0;k < i;k++)
		{
			if (str1.charAt(k) > 96)
			{
				str1.charAt(k) -= 'a' - 10;
			}
			else if (str1.charAt(k) > 64)
			{
				str1.charAt(k) -= 'A' - 10;
			}
			else
			{
				str1.charAt(k) -= '0'; //??????????????????
			}
			s += str1.charAt(k) * (int)Math.pow((double)a,i - 1 - k); //??str1?????
		}
		do
		{
		j++;
		} while (s > Math.pow((double)b,j)); //????????
		for (int l = 0;l < j;l++)
		{
			temp = s / Math.pow((double)b,j - l - 1);
			if (temp < 10)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, l, temp + '0');
			}
			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, l, temp - 10 + 'A');
			}
			s -= temp * Math.pow((double)b,j - l - 1);
		} //?????????????
		str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0'); //?str2????????\0????????
		System.out.print(str2);
		return 0;
	}
}

