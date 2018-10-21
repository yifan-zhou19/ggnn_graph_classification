package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		char[][] shuzu = new char[6][10];
		String e = new String(new char[10]);
		for (i = 0;i < 5;i++)
		{
			shuzu[i] = new Scanner(System.in).nextLine();
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m < 5 && m >= 0 && n < 5 && n >= 0)
		{
		   e = shuzu[n];
		   shuzu[n] = shuzu[m];
		   shuzu[m] = e;
		   for (i = 0;i < 5;i++)
		   {
			 System.out.println(shuzu[i]);
		   }
		}
		else
		{
		   System.out.print("error");
		}

		return 0;
	}

}

