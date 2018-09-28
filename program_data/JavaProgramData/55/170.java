package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[50];
		int i;
		int z1;
		int z2;
		int n;
		int x;
		int z;
		String s1 = new String(new char[3]);
		String s2 = new String(new char[50]);
		String s3 = new String(new char[3]);
		String s = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s3 = tempVar3.charAt(0);
		}
		z1 = Integer.parseInt(s1);
		z2 = Integer.parseInt(s3);
		z = 1;
		x = 0;
			 n = s2.length();
		for (i = 0;i < n;i++)
		{
			if ((s2.charAt(i) >= 'A') && (s2.charAt(i) <= 'Z'))
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (s2.charAt(i) <= '9')
			{
				a[i] = s2.charAt(i) - '0';
			}
			else
			{
				a[i] = s2.charAt(i) - 'a' + 10;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			x = x + a[i] * z;
			z = z * z1;
		}
		i = 0;
		while (x != 0)
		{
			a[i] = x % z2;
			i++;
			x = (x - x % z2) / z2;
		}
		if (i == 0)
		{
			System.out.print("0");
		}
		else
		{
		n = i - 1;
		for (i = n;i >= 0;i--)
		{
					   if (a[i] < 10)
					   {
						   s = tangible.StringFunctions.changeCharacter(s, n - i, '0' + a[i]);
					   }
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, n - i, 'A' + a[i] - 10);
			}
		}
			s = tangible.StringFunctions.changeCharacter(s, n + 1, '\0');
			System.out.println(s);
		}
	}

}

