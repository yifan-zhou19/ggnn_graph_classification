package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[50]);
	public static String ans = new String(new char[50]);
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int length;
		int num;
		int x;
		int m;
		int n;
		int ten = 0;
		int ten2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		length = str.length();
		for (i = 0;i < length;i++)
		{
			x = 1;
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
			{
				num = str.charAt(i) - 87;
			}
			else if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
			{
				num = str.charAt(i) - 55;
			}
			else
			{
				num = str.charAt(i) - 48;
			}
			for (j = 0;j < (length - i - 1);j++)
			{
				x = x * n;
			}
			ten = ten + x * num;
		}
		if (ten == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			for (k = 0;(ten != 0);k++)
			{
				ten2 = ten;
				ten = ten / m;
				ans = tangible.StringFunctions.changeCharacter(ans, k, ten2 - ten * m + 48);
			}
			for (l = 0;l < k;l++)
			{
				if (l != (k - 1))
				{
					if (ans.charAt(k - l - 1) > '9')
					{
						ans = tangible.StringFunctions.changeCharacter(ans, k - l - 1, ans.charAt(k - l - 1) + 7);
						System.out.printf("%c",ans.charAt(k - l - 1));
					}
					else
					{
						System.out.printf("%c",ans.charAt(k - l - 1));
					}
				}
				else
				{
					if (ans.charAt(k - l - 1) > '9')
					{
						ans = tangible.StringFunctions.changeCharacter(ans, k - l - 1, ans.charAt(k - l - 1) + 7);
						System.out.printf("%c\n",ans.charAt(k - l - 1));
					}
					else
					{
						System.out.printf("%c\n",ans.charAt(k - l - 1));
					}
				}
			}
		}
		return 0;
	}

}

