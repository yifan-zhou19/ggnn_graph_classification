package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int a = 0;
		int[] b = new int[1000];
		String str = new String(new char[1000]);
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Integer.parseInt(tempVar5);
		}
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				a = a * n + (str.charAt(i) - '0');
			}
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				a = a * n + (str.charAt(i) - 'a' + 10);
			}
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				a = a * n + (str.charAt(i) - 'A' + 10);
			}
		}
			for (i = 1;;i++)
			{

			b[i] = (a % (int)Math.pow(m,i)) / (int)Math.pow(m,i - 1);
			a = a - a % (int)Math.pow(m,i);
			if (a == 0)
			{
				break;
			}
			}
		for (j = i;j >= 1;j--)
		{
			if (b[j] >= 0 && b[j] < 10)
			{
				System.out.printf("%c",b[j] + '0');
			}
			else
			{
				System.out.printf("%c",b[j] - 10 + 'A');
			}
		}
	}

}

