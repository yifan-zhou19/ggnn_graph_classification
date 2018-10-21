package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int flag2;
		int flag;
		int j;
		int k;
		int lengtha;
		int lengthb;
		int n;
		int i;
		char temp;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		flag = 0;
		flag2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (flag2 != 0)
			{
				temp = System.in.read();
			}
			else
			{
				flag2 = 1;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			lengtha = a.length();
			lengthb = b.length();
			for (j = 1;j <= lengthb;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, lengtha - j, a.charAt(lengtha - j) - b.charAt(lengthb - j) + 48);
				k = lengtha - j;
				while (a.charAt(k) < 48)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) + 10);
					a.charAt(k - 1)--;
					k--;
				}
			}
			if (flag != 0)
			{
				System.out.print("\n");
			}
			else
			{
				flag = 1;
			}
			System.out.printf("%s",a);

		}
	}
}

