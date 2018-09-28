package <missing>;

public class GlobalMembers
{
	public static int countnum(String a)
	{
		int num = 0;
		while (!a[num].equals('\0'))
		{
			num++;
		}
		return num;
	}

	public static void clean(String a)
	{
		 int num = 0;
		 int lenth = 0;
		 while (!a[lenth].equals('\0'))
		 {
		 lenth++;
		 }
		 while (a[num].equals('0'))
		 {
		 num++;
		 }
		 for (int i = 0;i <= (lenth - num);i++)
		 {
			 a[i] = a[i + num];
		 }
	}


	public static void sort(String a, int la, int max)
	{
		int count = la;
		int differ = max - la;
		for (;count >= 0;count--)
		{
			a[count + differ] = a[count];
		}
		for (int i = 0;i < differ;i++)
		{
			a[i] = '0';
		}
	}

	public static void entire(String a, int la)
	{
		String aa = new String(new char[1000]);
		int count = la;
		for (;count >= 0;count--)
		{
			aa = tangible.StringFunctions.changeCharacter(aa, la - count, a[count]);
		}
		aa = tangible.StringFunctions.changeCharacter(aa, la + 1, '\0');
		for (int i = 0;i <= la + 1;i++)
		{
			a[i] = aa.charAt(i);
		}
	}
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		//printf("%d",strlen(a));

		if ((a.length() == 1) && (b.length() == 1) && (a.charAt(0) == '0') && (b.charAt(0) == '0'))
		{
			;
		}
		else
		{
		clean(a);
		clean(b);
		}
		//printf("%s\n%s\n",a,b);

		int la = countnum(a);
		int lb = countnum(b);
		int max = la;
		if (la < lb)
		{
			max = lb;
		}
		max = max + 1;
		sort(a, la, max);
		sort(b, lb, max);
		max = max - 1;
		entire(a, max);
		entire(b, max);
		int sign = 0;
		String c = new String(new char[1000]);
		for (int i = 0;i <= max;i++)
		{
			int temp = sign + a.charAt(i) - '0' + b.charAt(i) - '0';
			if (temp > 9)
			{
				sign = 1;
				temp = temp - 10;
			}
			else
			{
				sign = 0;
			}
			c = tangible.StringFunctions.changeCharacter(c, i, temp + '0');
		}
		c = tangible.StringFunctions.changeCharacter(c, max + 1, '\0');
		max = max;
		entire(c, max);
		if (c.charAt(0) == '0')
		{
			for (int j = 1;j <= max;j++)
			{
				System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
		}
		else
		{
		System.out.printf("%s\n",c);
		}


	}

}

