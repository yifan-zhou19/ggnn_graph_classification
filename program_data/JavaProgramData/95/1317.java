package <missing>;

public class GlobalMembers
{
	//??????????

	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //????????
		int a = str1.length();
		int b = str2.length();
		int i;
		for (i = 0;i <= a;i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1.charAt(i) -= 32;
			}
			if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
			{
				str2.charAt(i) -= 32; //??????????
			}
			if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print('>');
				break;
			}
			else if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print('<');
				break;
			} //??????????????????
			else if (str1.charAt(i) == str2.charAt(i) && i == a)
			{
				System.out.print('=');
				break;
			} //????????????????
			else
			{
				continue;
			}
		}
		 return 0;
	}
}
