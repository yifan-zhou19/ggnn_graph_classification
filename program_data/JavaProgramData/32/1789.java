package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String cint1 = new String(new char[101]);
		String cint2 = new String(new char[101]);
		String result = new String(new char[101]);
		int length1;
		int length2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
		{
			System.in.read();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cint1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cint2 = tempVar3.charAt(0);
			}
			length1 = cint1.length();
			length2 = cint2.length();
			int k0 = length1 - 1;
			int i = length1 - 1;
			int k = k0;
			int j;
			for (j = length2 - 1;j >= 0;j--)
			{
				result = tangible.StringFunctions.changeCharacter(result, k--, cint1.charAt(i--) - cint2.charAt(j) + '0');
			}
			while (i >= 0)
			{
				result = tangible.StringFunctions.changeCharacter(result, k--, cint1.charAt(i--));
			}
			for (k = k0;k > 0;k--)
			{
				if (result.charAt(k) < '0')
				{
					result.charAt(k) += 10;
					result.charAt(k - 1)--;
				}
			}
			for (k = 0;k < k0;k++)
			{
				if (result.charAt(k) != '0')
				{
					break;
				}
			}
			while (k <= k0)
			{
				System.out.printf("%c",result.charAt(k++));
			}
			System.out.print("\n");
		}
	}

}

