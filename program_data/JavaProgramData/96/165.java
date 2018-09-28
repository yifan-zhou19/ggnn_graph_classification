package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int l;
		int[] b = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int m;
		int n;
		String a = new String(new char[1000]);
		String c = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		if (l == 1)
		{
		System.out.printf("%d\n%d",0,a.charAt(0) - '0');
		}
		else if (l == 2)
		{
			 m = a.charAt(0) - '0';
			 n = a.charAt(1) - '0';
			 if (m * 10 + n < 13)
			 {
			 System.out.printf("%d\n%d",0,m * 10 + n);
			 }
			 else
			 {
			 System.out.printf("%d\n%d",(m * 10 + n) / 13,(m * 10 + n) % 13);
			 }
		}
		else
		{
		for (i = 0;i < l;i++)
		{
						e[i] = a.charAt(i) - '0';
		}
		if (e[0] * 10 + e[1] < 13)
		{
						   b[k] = (e[0] * 100 + e[1] * 10 + e[2]) / 13;
						   d[k] = (e[0] * 100 + e[1] * 10 + e[2]) % 13;
						   for (i = 3;i < l;i++)
						   {
										   b[k + 1] = (d[k] * 10 + e[i]) / 13;
										   d[k + 1] = (d[k] * 10 + e[i]) % 13;
										   k = k + 1;
						   }
						   for (j = 0;j <= k;j++)
						   {
											c = tangible.StringFunctions.changeCharacter(c, j, b[j] + '0');
						   }
						   c = tangible.StringFunctions.changeCharacter(c, l - 2, '\0');
						   System.out.printf("%s\n%d",c,d[k]);
		}
		else
		{
						  b[k] = (e[0] * 10 + e[1]) / 13;
						  d[k] = (e[0] * 10 + e[1]) % 13;
						  for (i = 2;i < l;i++)
						  {
										   b[k + 1] = (d[k] * 10 + e[i]) / 13;
										   d[k + 1] = (d[k] * 10 + e[i]) % 13;
										   k = k + 1;
						  }
						  for (j = 0;j <= k;j++)
						  {
											c = tangible.StringFunctions.changeCharacter(c, j, b[j] + '0');
						  }
						   c = tangible.StringFunctions.changeCharacter(c, l - 1, '\0');
						   System.out.printf("%s\n%d",c,d[k]);
		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

