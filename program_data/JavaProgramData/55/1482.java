package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int mizhi = new int(int input1,int input2);
		int a;
		int b;
		int temp;
		int temp1 = 0;
		int temp2;
		int temp3;
		int n;
		int i;
		int j;
		int k = 0;
		String str = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				temp2 = str.charAt(i) - 55;
			}
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				temp2 = str.charAt(i) - 87;
			}
			else if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				temp2 = str.charAt(i) - 48;
			}
			temp1 = temp1 + temp2 * mizhi(a, n - 1 - i);
		}
		temp = temp1;
		for (j = 0;;j++)
		{
			if (temp < b)
			{
				break;
			}
			else
			{
				temp = temp / b;
				k++;
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (temp1 >= b)
			{
				if (temp1 / mizhi(b, k - i) <= 9)
				{
			System.out.printf("%ld",temp1 / mizhi(b, k - i));
			temp1 = temp1 % mizhi(b, k - i);
				}
				else
				{
				System.out.printf("%c",55 + temp1 / mizhi(b, k - i));
			temp1 = temp1 % mizhi(b, k - i);
				}
			}
			else if (temp1 < b && k - i != 0)
			{
				System.out.print("0");
			}
			else
			{
				if (temp1 <= 9)
				{
			System.out.printf("%ld",temp1);
				}
				else
				{
				System.out.printf("%c",55 + temp1);
				}
				break;
			}
		}
	}

	public static int mizhi(int input1,int input2)
	{
		int z = 1;
		int k = 1;
		if (input2 == 0)
		{
			return (1);
		}
		else
		{
		do
		{
			z = z * input1;
			k++;
		}while (k <= input2);
		}
		return (z);
	}
}

