package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int j = 0;
		int temp;
		int yu;
		int num = 0;
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a = tempVar.charAt(0);
			   }
		n = a.length();
		for (int i = 1;i < n;i++)
		{
			if (i == 0)
			{
				temp = a.charAt(0) - '0';
			}
			if (i == 1)
			{
				temp = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
			}
			else
			{
				temp = yu * 10 + a.charAt(i) - '0';
			}
			b = tangible.StringFunctions.changeCharacter(b, j, temp / 13 + '0');
			j++;
			yu = temp % 13;
		}
		if (n == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d",(a.charAt(0) - '0') % 13);
		}
		else
		{
		for (int i = 0;i < j;i++)
		{
			if (b.charAt(i) == '0' && j > 1)
			{
				num++;
			}
			else
			{
				break;
			}
		}
		for (int i = num;i < j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		System.out.print("\n");
		System.out.printf("%d",yu);
		}

	}












}

