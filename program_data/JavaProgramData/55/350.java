package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a1;
		int b1;
		int temp = 0;
		int[] numtemp = new int[10];
		String num1 = new String(new char[10]);
		String num2 = new String(new char[10]);
		char c;
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b1 = Integer.parseInt(tempVar3);
		}
		while (num1.charAt(i) != '\0')
		{
			if (num1.charAt(i) >= 97 && num1.charAt(i) <= 122)
			{
				num1.charAt(i) -= 32;
			}
			if (num1.charAt(i) >= 65 && num1.charAt(i) <= 90)
			{
				numtemp[i] = num1.charAt(i) - 55;
			}
			else
			{
				numtemp[i] = num1.charAt(i) - 48;
			}
			i += 1;
		}
		i -= 1;
		for (j = 0;j <= i;j++)
		{
			temp += numtemp[j] * power(a1,i - j);
		}
		i = 0;
		j = 0;
		while (power(b1,i) < temp)
		{
			i++;
		}
		j = i - 1;
		for (k = 0;k < i;k++)
		{
			n = temp / power(b1,j);
			if (n >= 10)
			{
				c = (char)(n + 55);
			}
			else
			{
				c = (char)(n + 48);
			}
			temp -= power(b1,j) * n;
			j--;
			num2 = tangible.StringFunctions.changeCharacter(num2, k, c);
			n = 0;
		}
		num2 = tangible.StringFunctions.changeCharacter(num2, k, '\0');
		if (k != 0)
		{
			System.out.printf("%s\n",num2);
		}
		else
		{
			System.out.print("0\n");
		}
	}
}

