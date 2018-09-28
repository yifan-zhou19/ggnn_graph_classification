package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int j;
		int t = 0;
		int A;
		int B;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{
			t = 0;
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
		for (i = 0;i <= 100;i++)
		{
			if (a.charAt(i) == 0)
			{
				break;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
			}
		}
		A = i - 1;
		for (i = 0;i <= 100;i++)
		{
			if (b.charAt(i) == 0)
			{
				break;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - '0');
			}
		}
		B = i - 1;
		for (i = B;i >= 0;i--)
		{
			if (a.charAt(A - B + i) >= b.charAt(i))
			{
				a = tangible.StringFunctions.changeCharacter(a, A - B + i, a.charAt(A - B + i) - b.charAt(i));
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, A - B + i, a.charAt(A - B + i) - b.charAt(i) + 10);
				a = tangible.StringFunctions.changeCharacter(a, A - B + i - 1, a.charAt(A - B + i - 1) - 1);
			}
		}
		for (j = 0;j <= A;j++)
		{
			if (a.charAt(j) != 0)
			{
				break;
			}
			else
			{
				t++;
			}
		}

		if (t == 0)
		{
			for (i = 0;i <= A;i++)
			{
			if (i == A)
			{
				System.out.printf("%d\n",a.charAt(i));
			}
			else
			{
				System.out.printf("%d",a.charAt(i));
			}
			}
		}
		else
		{
			for (i = 0;i <= A - t;i++)
			{
			if (i == A - t)
			{
				System.out.printf("%d\n",a.charAt(i + t));
			}
			else
			{
				System.out.printf("%d",a.charAt(i));
			}
			}
		}
		}
	}
}

