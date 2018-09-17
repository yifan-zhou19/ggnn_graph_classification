package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int n;
		int s;
		int i;
		int j;
		String str = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		a = 0;
		n = (int)str.length();
		for (i = 97;i < 123;i++)
		{
			s = 0;

			for (j = 0;j < n;j++)
			{
				if (str.charAt(j) == i)
				{
					a = 1;
					s++;
				}
			}
			if (s != 0)
			{
				System.out.printf("%c=%d\n",(char)i,s);
			}



		}
		if (a == 0)
		{
				System.out.print("No\n");

		}
	}


}

