package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		String p;
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int k = 0;
		int e;
		p = s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Integer.parseInt(tempVar);
		}
		for (j = 0;j <= e;j++)
		{
			s = new Scanner(System.in).nextLine();
			k = s.length();

			for (i = 0;i < k;i++)
			{
				n = 0;
				p = s;
				if ((i == 0) && !(*(p.Substring(i)) >= 'A' && *(p.Substring(i)) <= 'Z' || *(p.Substring(i)) >= 97 && *(p.Substring(i)) <= 122 || *(p.Substring(i)) == 95))
				{
					n = 1;
				}

				if (i != 0 && (*(p.Substring(i)) < 65 && *(p.Substring(i))>57 || *(p.Substring(i)) < 48 || *(p.Substring(i))>90 && *(p.Substring(i)) < 97 || *(p.Substring(i))>122) && *(p.Substring(i)) != 95)
				{
					n = 1;
				}

				if (n == 1)
				{
					System.out.print("0\n");
					break;
				}

				else if (n == 0 && i == k - 1)
				{
					System.out.print("1\n");
					break;
				}
			}
		}


	}

}

