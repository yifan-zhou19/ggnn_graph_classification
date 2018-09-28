package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[102]);
		String str2 = new String(new char[102]);
		int[] result = new int[102];
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			int borrow = 0;
			int len1 = str1.length();
			int len2 = str2.length();
			int len;
			len = len1;
			for (j = len2 - 1; j >= 0;j--)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j + len1 - len2, str2.charAt(j));
			}
			for (j = 0;j < len1 - len2;j++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, j, '0');
			}
			for (k = len - 1; k >= 0; k--)
			{
				int temp = (str1.charAt(k) - '0') - (str2.charAt(k) - '0') - borrow;
				if (temp < 0)
				{
					borrow = 1;
					result[k] = temp + 10;
				}
							   else
							   {
					borrow = 0;
					result[k] = temp;
							   }
			}
			int k;
			for (k = 0; result[k] == 0; k++)
			{
				;
			}
			for (k = 0;k < len; k++)
			{
				System.out.printf("%d", result[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

