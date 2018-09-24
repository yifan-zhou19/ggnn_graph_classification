package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int i;
		int j;
		int l;
		int k;
		int sum = 0;
		int out = 0;
		String s = new String(new char[51]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = s.length();
		//printf("%d\n",l);
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
			}
		}
	//	printf("%s\n",s);
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				k = s.charAt(i) - 55; //printf("%d\n",k);
			}
			else
			{
				k = s.charAt(i) - 48; //printf("=%d\n",k);
			}
			for (j = 0;j < l - i - 1;j++)
			{
				k = k * a; //printf("%d\n",k);
			}
		//	printf("+%d\n",k);
			sum = sum + k;
		}
		for (i = 50;i >= 0;i--)
		{
			if (sum % b >= 0 && sum % b <= 9)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, sum % b + 48);
			}
			if (sum % b >= 10)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, sum % b + 55);
			}
			sum = (sum - sum % b) / b;
			if (sum == 0)
			{
				break;
			}
		}
		for (j = i;j < 51;j++)
		{
			System.out.printf("%c",s.charAt(j));
		}
		System.out.print("\n");
	}
}

