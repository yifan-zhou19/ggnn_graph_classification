package <missing>;

public class GlobalMembers
{
	public static int trans(int len, int[] a, int b)
	{
		int x;
		if (len == 1)
		{
			return (a[len - 1]);
		}
		else
		{
			x = a[len - 1] + b * trans(len - 1, a, b);
		}
		return (x);
	}
	public static void Main()
	{
		int ori;
		int fin;
		int len0;
		int i;
		int len3;
		int j;
		int ten;
		String num0 = new String(new char[100]);
		String num3 = new String(new char[100]);
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ori = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num0 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			fin = Integer.parseInt(tempVar3);
		}
		len0 = num0.length();
		for (i = 0;i < len0;i++)
		{
			if (num0.charAt(i) >= 'A' && num0.charAt(i) <= 'Z')
			{
				num1[i] = num0.charAt(i) - 'A' + 10;
			}
			else if (num0.charAt(i) >= 'a' && num0.charAt(i) <= 'z')
			{
				num1[i] = num0.charAt(i) - 'a' + 10;
			}
			else
			{
				num1[i] = num0.charAt(i) - '0';
			}
		}
		ten = trans(len0, num1, ori);
		if (ten == 0)
		{
			System.out.print("0\n");
		}
		else
		{
		for (i = 0;ten != 0;i++)
		{
			num2[i] = ten % fin;
			ten = ten / fin;
		}
		len3 = i;
		for (j = 0;j <= len3;j++,i--)
		{
			if (num2[i - 1] <= 9)
			{
				num3 = tangible.StringFunctions.changeCharacter(num3, j, num2[i - 1] + '0');
			}
			else
			{
				num3 = tangible.StringFunctions.changeCharacter(num3, j, num2[i - 1] + 'A' - 10);
			}
		}
		num3 = tangible.StringFunctions.changeCharacter(num3, len3, '\0');
		System.out.printf("%s\n",num3);
		}
	}
}

