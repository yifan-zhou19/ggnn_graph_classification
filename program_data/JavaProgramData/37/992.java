package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int count;
		String a = new String(new char[100001]);
		String p;
		p = a;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();

			for (j = 0; j < l; j++)
			{

				for (k = j + 1; k < l; k++)
				{

					if (*(p.Substring(j)) != '0')
					{
								   if (*(p.Substring(j)) == *(p.Substring(k)))
								   {
										*(p.Substring(k)) = '0';
										count = 1;
								   }
					}
					if (count > 0 && k == l - 1)
					{
								 *(p.Substring(j)) = '0';
								 count = 0;
					}


				}
			}
			for (j = 0; j < l; j++)
			{
				if (*(p.Substring(j)) != '0')
				{
							   System.out.printf("%c\n", *(p.Substring(j)));
							   break;
				}
				if (j == l - 1)
				{
							System.out.print("no\n");
				}
			}


		}


		return 0;
	}




}

