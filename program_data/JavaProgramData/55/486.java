package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String num = new String(new char[50]);
	int answer = 0;
	int i;
	int j;
	int a;
	int b;
	int n;
	int[] an = new int[50];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		num = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}

	n = num.length();
	for (i = 0;i < n;i++)
	{
	if (num.charAt(i) > 47 && num.charAt(i) < 58)
	{
	answer = answer + (num.charAt(i) - 48) * Math.pow(a,n - i - 1);
	}
	if (num.charAt(i) > 64 && num.charAt(i) < 91)
	{
	answer = answer + (num.charAt(i) - 55) * Math.pow(a,n - i - 1);
	}
	if (num.charAt(i) > 96 && num.charAt(i) < 123)
	{
	answer = answer + (num.charAt(i) - 87) * Math.pow(a,n - i - 1);
	}
	}

	for (j = 0;;j++)
	{
	i = answer % b;
	answer = (answer - i) / b;
	if (i >= 0 && i < 10)
	{
	an[j] = i + 48;
	}
	if (i >= 10)
	{
	an[j] = i + 55;
	}
	if (answer == 0)
	{
	break;
	}

	}
	for (i = j;i >= 0;i--)
	{
	System.out.printf("%c",an[i]);
	}
	}
}

