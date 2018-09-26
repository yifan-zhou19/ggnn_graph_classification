package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int m;
		int i;
		int k;
		int j;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long long int sum;
		long sum;
		final String z1 = "";
		final String z2 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			z1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		k = z1.length();
		for (sum = 0,i = 0;i < k;i++)
		{
			if (z1.charAt(i) >= '0' && z1.charAt(i) <= '9')
			{
				m = z1.charAt(i) - '0';
			}
			else if (z1.charAt(i) >= 'a' && z1.charAt(i) <= 'z')
			{
				m = z1.charAt(i) - 'a' + 10;
			}
			else
			{
				m = z1.charAt(i) - 'A' + 10;
			}

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: sum=sum+((unsigned long long int)pow(1.0*a,1.0*(k-i-1)))*m;
			sum = sum + ((long)Math.pow(1.0 * a,1.0 * (k - i - 1))) * m;

		}
		for (i = 0;sum > 0;i++)
		{
			if (sum % b <= 9)
			{
				z2 = tangible.StringFunctions.changeCharacter(z2, i, sum % b + '0');
			}
			else
			{
				z2 = tangible.StringFunctions.changeCharacter(z2, i, sum % b - 10 + 'A');
			}
			sum = sum / b;
		}
		for (j = z2.length() - 1;j >= 0;j--)
		{
			System.out.printf("%c",z2.charAt(j));
		}
		if (z1.charAt(0) == '0')
		{
			System.out.print("0");
		}
		return 0;
	}
}

