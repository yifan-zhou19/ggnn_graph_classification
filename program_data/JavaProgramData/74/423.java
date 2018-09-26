package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int flag = 1;
		for (i = 2;i < n / 2;i++)
		{
			if (n % i == 0)
			{
				flag = 0;
				break;
			}
		}
		return (flag);
	}
	public static int huiwen(int n)
	{
		String a = new String(new char[10]);
		int i = 0;
		int flag = 0;
		int j;
			while (n != 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, n % 10);
				n = n / 10;
				i++;
			}
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		for (j = 0;j < i / 2;j++)
		{
			if (a.charAt(j) != a.charAt(i - j - 1))
			{
				break;
			}
		}
		if (j == i / 2)
		{
			flag = 1;
		}
		return (flag);
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) != 0)
			{
			   if (huiwen(i) != 0)
			   {
				   if (flag == 0)
				   {
					   System.out.printf("%d",i);
					   flag++;
				   }
				   else
				   {
					   System.out.printf(",%d",i);
				   }
			   }
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
	}
}

