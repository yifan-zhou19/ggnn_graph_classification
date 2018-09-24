package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int d;
		int length;
		String c = new String(new char[20]);
		int[] n = new int[20];
		String result = new String(new char[200]);
		int i;
		int k;
		int j;
		int temp1 = 0;

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

		for (i = 0;c.charAt(i) != 0;i++)
		{
			if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
			{
				n[i] = c.charAt(i) - 'a' + 10;
			}
			if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
			{
				n[i] = c.charAt(i) - 'A' + 10;
			}
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
				n[i] = c.charAt(i) - '0';
			}
		}

		length = i;
		d = 0;
		for (k = 0;k < length;k++)
		{
			d = d * a + n[k];
		}

		for (i = 0;d != 0;i++)
		{
			temp1 = d % b;
			d = d / b;
			if (temp1 >= 10)
			{
				temp1 = temp1 - 10 + 'A';
			}
			else
			{
				temp1 = temp1 + '0';
			}
			result = tangible.StringFunctions.changeCharacter(result, i, temp1);
		}
		result = result.substring(0, i);
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",result.charAt(j));
		}
		if (i == 0)
		{
			System.out.print("0");
		}
	}

}

