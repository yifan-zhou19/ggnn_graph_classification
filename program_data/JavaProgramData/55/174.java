package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] zhuan = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int a;
		int b;
		String c = new String(new char[64]);
		String r = new String(new char[64]);
		int i;
		int k;
		int sum = 0;
		int q = 0;
		int[] w = new int[64];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;c.charAt(i);i++)
		{
			if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
			{
			k = c.charAt(i) - '0';
			}
		else if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
		{
			k = c.charAt(i) - 'A' + 10;
		}
		else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
		{
			k = c.charAt(i) - 'a' + 10;
		}
		sum = sum * a + k;
		}
		if (sum == 0)
		{
			System.out.print("0\n");
		}
		if (sum != 0)
		{
			while (sum > 0)
			{
			w[q] = sum % b;
		sum = sum / b;
		q++;
			} //*
		for (i = 0;i < q;i++)
		{
			r = tangible.StringFunctions.changeCharacter(r, q - 1 - i, zhuan[w[i]]);
		}
		for (i = 0;i < q;i++)
		{
			System.out.printf("%c",r.charAt(i));
		}
		}

		return 0;
	}

}

