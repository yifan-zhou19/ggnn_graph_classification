package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int l;
		int i;
		int j;
		int k = 0;
		int[] d = new int[255];
		String c = new String(new char[255]);
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				d[i] = c.charAt(i) - '0';
			}
			else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				d[i] = c.charAt(i) - 'a' + 10;
			}
			else
			{
				d[i] = c.charAt(i) - 'A' + 10;
			}
		//	printf("%d ",d[i]);
		}
		for (j = 0;j < l;j++)
		{
			num += d[j] * Math.pow(a,i - 1);
			i--;
		//	printf("%ld ",num);
		}
	//	printf("%d ",num);
		if (num == 0)
		{
			System.out.print("0\n");
		}
		else
		{
		while (num > 0)
		{
			d[k] = num % b;
			if (d[k] >= 0 && d[k] <= 9)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, d[k] + '0');
			}
			else if (d[k] >= 10 && d[k] <= 'z'-'a' + 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, d[k] - 10 + 'A');
			}
			num = num / b;
			k++;
		}
		k--;
		while (k > 0)
		{
			System.out.printf("%c",c.charAt(k));
			k--;
		}
		System.out.printf("%c\n",c.charAt(k));
		}
		return 0;
	}
}

