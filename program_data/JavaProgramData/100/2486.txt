package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		String a = new String(new char[900]);
		int[] b = new int[250];
		m = 0;
		n = 65;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}


		for (i = 0;;i++)
		{
		   n = a.charAt(i);
		   b[n] += 1;
		   if (a.charAt(i) == '\0')
		   {
			   break;
		   }
		}
		for (i = 65;i <= 90;i++)
		{
			if (b[i] > 0)
			{
					   System.out.printf("%c=%d\n",i,b[i]);
					   m = m + b[i];
			}
		}
		for (i = 97;i <= 122;i++)
		{
			{
							if (b[i] > 0)
							{
								System.out.printf("%c=%d\n",i,b[i]);
							}
						   m = m + b[i];
		}
		}
		if (m == 0)
		{
			System.out.print("No");
		}






		return 0;
	}

}

