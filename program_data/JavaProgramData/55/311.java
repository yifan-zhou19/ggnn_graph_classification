package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int[] a = new int[256];
		int i;
		for (i = '0';i <= '9';i++)
		{
			a[i] = i - '0';
		}
		for (i = 'a';i <= 'z';i++)
		{
			a[i] = i - 'a' + 10;
		}
		for (i = 'A';i <= 'Z';i++)
		{
			a[i] = i - 'A' + 10;
		}
		final String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int n;
		int m;
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		int sum = 0;
		int q;
		int j;
		q = b.length();
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			sum = sum + a[b.charAt(i)] * Math.pow(n,q - 1 - i);
		}
		if (sum == 0)
		{
		System.out.print("0");
		}
		else
		{
		for (i = 0;sum > 0;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, s.charAt(sum % m));
			sum = sum / m;
			c = tangible.StringFunctions.changeCharacter(c, i + 1, '\0');
		}
		}
		q = c.length();
		for (j = q - 1;j >= 0;j--)
		{
		System.out.printf("%c",c.charAt(j));
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
	}

}

