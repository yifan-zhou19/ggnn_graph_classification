package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		String num = new String(new char[100]);
		int sum = 0;
		int temp;
		String ans = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		int len;
		len = num.length();
		for (i = 0;i < len;i++)
		{
			if ((num.charAt(i) >= '0') && (num.charAt(i) <= '9'))
			{
				sum *= a;
				sum += num.charAt(i) - '0';
			}
			if ((num.charAt(i) >= 'A') && (num.charAt(i) <= 'Z'))
			{
				sum *= a;
				sum += num.charAt(i) - 'A' + 10;
			}
			if ((num.charAt(i) >= 'a') && (num.charAt(i) <= 'z'))
			{
				sum *= a;
				sum += num.charAt(i) - 'a' + 10;
			}
		}
		for (i = 0;;i++)
		{
			temp = sum % b;
			sum = sum / b;
			if (temp < 10)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, temp + '0');
			}
			else
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, temp - 10 + 'A');
			}
			if (sum == 0)
			{
				break;
			}
		}
		for (int j = i;j >= 0;j--)
		{
			System.out.printf("%c",ans.charAt(j));
		}









		return 0;
	}




}

