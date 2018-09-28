package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int l;
		int i;
		int j;
		int[] b = new int[65535];
		int t = 0;
		int k = 1;
		String a = new String(new char[65535]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			   if ((a.charAt(i) <= '9') && (a.charAt(i) >= '0'))
			   {
				   b[i] = a.charAt(i) - '0';
			   }
			   if ((a.charAt(i) <= 'z') && (a.charAt(i) >= 'a'))
			   {
				   b[i] = a.charAt(i) - 'a' + 10;
			   }
			   if ((a.charAt(i) <= 'Z') && (a.charAt(i) >= 'A'))
			   {
				   b[i] = a.charAt(i) - 'A' + 10;
			   }
		}
		for (i = 0;i < l;i++)
		{
				t = t + b[i] * Math.pow(m,l - i - 1);
		}
		if (t == 0)
		{
			System.out.printf("%d",t);
		}
		j = 0;
		while (t != 0)
		{
				b[j] = t % n;
				t = t / n;
				j++;
		}
		for (i = 0;i < j;i++)
		{
				if (b[i] <= 9)
				{
					a = tangible.StringFunctions.changeCharacter(a, j - 1 - i, '0' + b[i]);
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j - 1 - i, 'A' + b[i] - 10);
				}
		}
		a = tangible.StringFunctions.changeCharacter(a, j, '\0');
		System.out.printf("%s",a);
		System.in.read();
		System.in.read();
	}

}

