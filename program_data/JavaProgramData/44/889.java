package <missing>;

public class GlobalMembers
{
	public static void fanxu(tangible.RefObject<String> p, int n)
	{
		int i;
		int j;
		char temp;
		if ((p.argValue == '-' && *(p.argValue.Substring(1)) == '0') || p.argValue == '0')
		{
			p.argValue = '0';
			*(p.argValue.Substring(1)) = '\0';
			return;
		}
	else if (p.argValue == '-' && *(p.argValue.Substring(1)) != '0')
	{
			  for (i = n - 1;i >= 0;i--)
			  {
				 if (*(p.argValue.Substring(i)) != '0')
				 {
				 *(p.argValue.Substring(i) + 1) = '\0';
				 break;
				 }
			  }
			j = i;
			for (i = 1;i <= j / 2;i++)
			{
				   temp = (p.argValue.Substring(i));
				   *(p.argValue.Substring(i)) = *(p.argValue.Substring(j) + 1 - i);
				   *(p.argValue.Substring(j) + 1 - i) = temp;
			}

	}
	else
	{
		for (i = n - 1;i >= 0;i--)
		{
				 if (*(p.argValue.Substring(i)) != '0')
				 {
				 *(p.argValue.Substring(i) + 1) = '\0';
				 break;
				 }
		}
			j = i;
			for (i = 0;i <= j / 2;i++)
			{
				   temp = (p.argValue.Substring(i));
				   *(p.argValue.Substring(i)) = *(p.argValue.Substring(j) - i);
				   *(p.argValue.Substring(j) - i) = temp;
			}

	}
	}


	public static int Main()
	{
		int i;
		int len;
		String str = new String(new char[300]);
		for (i = 0;i < 6;i++)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		fanxu(tempRef_str, len);
		str = tempRef_str.argValue;
		System.out.printf("%s\n",str);
		}
		return 0;
	}
}

