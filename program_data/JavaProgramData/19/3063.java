package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String juzi = new String(new char[9999]);
		String danci1 = new String(new char[101]);
		String danci2 = new String(new char[101]);
		int i;
		int j = 0;
		int k;
		int l;
		int length1;
		int length2;
		int count = 0;
		juzi = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			danci1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			danci2 = tempVar2.charAt(0);
		}
		for (i = 0;i < juzi.length();i++)
		{
			if (i == 0 || juzi.charAt(i - 1) == ' ')
			{
				for (j = 0;j < danci1.length();j++)
				{
					if (*(juzi.Substring(i) + j) == *(danci1.Substring(j)))
					{
						count++;
					}
					else
					{
						count = 0;
						break;
					}
				}
			}
			if (count != 0)
			{
				System.out.printf("%s",danci2);
				i += danci1.length() - 1;
				count = 0;
			}
			else
			{
				System.out.printf("%c",juzi.charAt(i));
			}
		}
		return 0;
	}

}

