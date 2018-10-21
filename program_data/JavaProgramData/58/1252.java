package <missing>;

public class GlobalMembers
{
	public static int qualification(String a) //???????????????????????????
	{
		int result = 0;
		int flag = 0;
		int i = 0;
		int l = 0;
		if (a[0].equals(95) || (a[0].compareTo(64) > 0 && a[0].compareTo(91) < 0) || (a[0].compareTo(96) > 0 && a[0].compareTo(123) < 0)) //??????????ASCII????????????????????
		{
			flag = 0; //????????????0
		}
		else
		{
			flag = 1; //?????????????1
			return 1;
		}

		l = a.length();
		for (i = 1;i < l;i++) //???????????????????????????
		{
			if (a[i].equals(95) || (a[i].compareTo(64) > 0 && a[i].compareTo(91) < 0) || (a[i].compareTo(96) > 0 && a[i].compareTo(123) < 0) || (a[i].compareTo(47) > 0 && a[i].compareTo(58) < 0))
			{
				flag = 0; //????
				continue;
			}
			else
			{
				flag = 1;
				break;
			}
		}

		if (flag == 1) //????
		{
			result = 1;
		}
		else if (flag == 0)
		{
			result = 2;
		}
		return result;
	}

	public static int Main()
	{
		String a = new String(new char[90]);
		int n = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++) //????????
		{
			a = new Scanner(System.in).nextLine();
			System.out.print(qualification(a) - 1);
			System.out.print("\n");
		}
		return 0;
	}

}

