package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int[] num = new int[100];
		//????????i?????l????????num? ??????????
		String str = new String(new char[100]); //????
		str = new Scanner(System.in).nextLine(); //?????
		l = str.length(); //???????
		for (i = 0;i < l;i++) //???????????num???1
		{
			if ((str.charAt(i) < 'A' || str.charAt(i)>'z' || (str.charAt(i) > 'Z' && str.charAt(i) < 'a')) && (str.charAt(i) != '.') && (str.charAt(i) != ','))
			{
			num[i] = num[i]++;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (num[i] == 0)
			{
				System.out.print(str.charAt(i));
			}
			else if (num[i] == 1 && num[i + 1] == 0) //???????????????
			{
			System.out.print(str.charAt(i));
			}
			else if (num[i] == 1 && num[i + 1] == 1)
			{
			continue;
			}

		}
		return 0;
	}
}
