package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int num;
	int i = 1;
	int j = 1;
	int k = 1;
	int count = 0;
	int sum = 0;
	int sum1;
	String n = new String(new char[100]);
	for (k = 0;k < 100;k++)
	{
		n = tangible.StringFunctions.changeCharacter(n, k, '\0');
	}
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (count = 0;count < 100;count++)
	{
		if (n.charAt(count) == '\0')
		{
		num = count;
	break;
		}
	}
		 int[] shu = new int[num];
	for (i = 0;i < num;i++)
	{
		shu[i] = n.charAt(i);
	if (shu[i] < 58)
	{
	shu[i] = shu[i] - 48;
	}
	else if (shu[i] < 91)
	{
	shu[i] = shu[i] - 55;
	}
	else
	{
	shu[i] = shu[i] - 87;
	}
	}
	for (i = 0;i < num;i++)
	{
					  sum = sum + shu[i] * (int)Math.pow((double)a,(double)(num - i - 1));
	}
					   sum1 = sum;
	for (i = 1;i < 100;i++)
	{
		sum1 = sum1 / b;
	if (sum1 == 0)
	{
		break;
	}
	}
	int[] shu1 = new int[i];
	for (j = 0;j < i;j++)
	{
		shu1[j] = sum % b;
	sum = sum / b;
	}
	String m = new String(new char[i]);
	for (j = 0;j < i;j++)
	{
		if (shu1[i - j - 1] < 10)
		{
	m = tangible.StringFunctions.changeCharacter(m, j, shu1[i - j - 1] + 48);
		}
	else
	{
	m = tangible.StringFunctions.changeCharacter(m, j, shu1[i - j - 1] + 55);
	}
	System.out.print(m.charAt(j));
	}
	return 0;
	}

}

