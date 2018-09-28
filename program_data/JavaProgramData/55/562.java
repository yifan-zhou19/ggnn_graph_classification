package <missing>;

public class GlobalMembers
{
	public static int fun(int a,int n)
	{
		int z;
		if (n == 0)
		{
			z = 1;
		}
		else
		{
			z = a * fun(a, n - 1);
		}
		return z;
	}
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int j;
		int sum = 0;
		String line = new String(new char[100]);
		String huan = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			line = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = line.length();
		for (i = n - 1;i >= 0;i--)
		{
			if (line.charAt(i) >= '0' && line.charAt(i) <= '9')
			{
				sum += (line.charAt(i) - '0') * fun(a, n - 1 - i);
			}
			if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z')
			{
				sum += (line.charAt(i) - 'A' + 10) * fun(a, n - 1 - i);
			}
			if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z')
			{
				sum += (line.charAt(i) - 'a' + 10) * fun(a, n - 1 - i);
			}
		}
		i = 0;
		if ((sum % b + '0') >= '0' && (sum % b + '0') <= '9')
		{
			huan = tangible.StringFunctions.changeCharacter(huan, 0, sum % b + '0');
		}
		else if ((sum % b + '0' + 7) >= 'A' && (sum % b + '0' + 7) <= 'Z')
		{
			huan = tangible.StringFunctions.changeCharacter(huan, 0, sum % b + '0' + 7);
		}
		while ((sum / b) != 0)
		{
			i++;
			sum = sum / b;
			if ((sum % b + '0') >= '0' && (sum % b + '0') <= '9')
			{
				huan = tangible.StringFunctions.changeCharacter(huan, i, sum % b + '0');
			}
			else if ((sum % b + '0' + 7) >= 'A' && (sum % b + '0' + 7) <= 'Z')
			{
				huan = tangible.StringFunctions.changeCharacter(huan, i, sum % b + '0' + 7);
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.printf("%c",huan.charAt(j));
		}
		return 0;
	}

}

