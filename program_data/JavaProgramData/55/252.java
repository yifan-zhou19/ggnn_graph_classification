package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int n;
		int l;
		int t = 1;
		int i;
		int j;
		int g;
		int[] re = new int[100];
		int k = 0;
		int sum = 0;
		String num = new String(new char[100]);
		char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = num.length();
		for (i = 0;i < l;i++)
		{
			if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
			{
				num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(i) - 32);
			}
		}
		for (i = l - 1;i >= 0;i--)
		{
			for (j = 0;j < a;j++)
			{
			if (c[j] == num.charAt(i))
			{
					sum = sum + t * j;
					t = t * a;
			}
			}
		}
				while (sum >= b)
				{
					g = sum % b;
					re[k++] = c[g];
					sum = sum / b;
				}
				re[k] = c[sum];

			for (i = k;i >= 0;i--)
			{
				System.out.printf("%c",re[i]);
			}
			System.out.print("\n");
	}
}

