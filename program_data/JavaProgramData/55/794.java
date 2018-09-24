package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int n;
		int digit;
		int sum;
		int[] remain = new int[1000];
		String num = new String(new char[1000]);
		char c;
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
		n = num.length();
		sum = 0;
		for (i = 0;(c = num.charAt(i)) != '\0';i++)
		{
			if (Character.isUpperCase(c) != 0)
			{
			   digit = (int)(c - 'A' + 10);
			}
			if (Character.isLowerCase(c) != 0)
			{
			   digit = (int)(c - 'a' + 10);
			}
			if (Character.isDigit(c) != 0)
			{
			   digit = (int)(c - '0');
			}
			sum += (int)(digit * Math.pow(a,n - i - 1));
		}
		if (sum == 0)
		{
			System.out.printf("%d",sum);
		}
		else
		{
		for (i = 0;sum != 0;i++)
		{
				remain[i] = sum % b;
				sum = sum / b;
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (remain[j] <= 9)
			{
				System.out.printf("%d",remain[j]);
			}
			if (remain[j] > 9)
			{
			   remain[j] = remain[j] - 10 + (int)'A';
			   System.out.printf("%c",remain[j]);
			}
		}
		System.out.print("\n");
		}
	System.in.read();
	System.in.read();
	}

}

