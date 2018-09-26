package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int f;
		int b;
		int d = 0;
		//int f=1;
		int[] c = new int[300];
		int[] e = new int[300];
		f = a.length();
		for (int i = 0;i <= f - 1;i++)
		{
				if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
				{
						  for (int j = i + 1;j <= f - 2;j++)
						  {
								  a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						  }
								  f--;
								  i--;
				}

		}
	  //  printf("%s",a);
		 b = f;
		for (int i = 0;i <= b - 1;i++)
		{
			   if (a.charAt(i) == ' ')
			   {
						  c[d] = i;
						  d++;
			   }
		}
		d--;
		if (d < 0)
		{
				System.out.printf("%d",f);
		}
		else
		{
			e[0] = c[0];
		for (int i = 1;i <= d;i++)
		{
				e[i] = c[i] - c[i - 1] - 1;
		}
		e[d + 1] = b - c[d] - 1;
		for (int i = 0;i <= d;i++)
		{
				System.out.printf("%d,",e[i]);
		}
		System.out.printf("%d",e[d + 1]);
		}
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		return 0;
	}

}

