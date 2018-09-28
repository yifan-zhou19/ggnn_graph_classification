package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int I;
		int length;
		int flag = 0;
		int first = 0;
		int i;
		int j;
		int p = 0;
		String a = new String(new char[100000]);
		void yesorno(int Flag,int First);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }

		for (I = 1;I <= t;I++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			length = a.length();
			if (length == 1)
			{
				System.out.printf("%s\n",a);
			}

			for (i = 0;i < length;i++)
			{
				for (j = 0;j < length;j++)
				{
					if ((a.charAt(i) != a.charAt(j)) && (i != j))
					{
						p = 1;
					}
					else
					{
						if (i == j)
						{
							continue;
						}
											else
											{
							p = 0;
							break;
											}
					}
				}
				if (p == 1)
				{
					flag = 1;
					first = a.charAt(i);
					break;
				}
			}
			if (length != 1)
			{
				yesorno(flag, first);
			}
			p = 0;
			flag = 0;
			first = 0;
		}
	}
	public static void yesorno(int Flag,int First)
	{
		if (Flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%c\n",First);
		}
	}
}

