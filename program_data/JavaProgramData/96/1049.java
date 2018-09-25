package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[100];
		int j = 2;
		int i;
		int e;
		int[] c = new int[100];
		int p;
		String a = new String(new char[100]);


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}

		p = a.length();
		if (p == 1)
		{
			System.out.print("0\n");
		System.out.printf("%d",a.charAt(0) - '0');
		}
		else
		{
		b[0] = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';

		while (a.charAt(j) != 0)
		{
		b[j - 1] = a.charAt(j) - '0';

		j++;
		}
		j -= 2;

		for (i = 0;i < j;i++)
		{

		c[i] = b[i] / 13;
		e = b[i] % 13;
		b[i + 1] += e * 10;

		}
		c[j] = b[j] / 13;
		e = b[j] % 13;

		if (j == 0)
		{
		System.out.printf("%d\n",c[0]);
		}
		else
		{
			 if (c[0] != 0)
			 {
		System.out.printf("%d",c[0]);
			 }
		i = 1;
		while (i < j)
		{
		System.out.printf("%d",c[i]);
		i++;
		}

		System.out.printf("%d\n",c[j]);
		}

		System.out.printf("%d",e);
		}

	}
}

