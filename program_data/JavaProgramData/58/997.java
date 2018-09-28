package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[81]);
		int n;
		int i;
		int j;
		int temp = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)

		{
			s = new Scanner(System.in).nextLine();


			if (s.length() == 1)
			{
				if (s.charAt(0) == '_' || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))
				{
					System.out.print("1\n");
				}
				else
				{
					System.out.print("0\n");
				}
			}
			if (s.length() > 1)
			{
				if ((s.charAt(0) == '_') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))
				{
					for (j = 1;j < s.length();j++)
					{
						if (s.charAt(j) <= '9' && s.charAt(j) >= '0')
						{
							temp++;
						}
						if (s.charAt(j) == '_')
						{
							temp++;
						}
						if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
						{
							temp++;
						}
						if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
						{
							temp++;
						}

						/*if(s[j+1]==' ')
							temp--;*/
					}

					if (temp == (s.length() - 1))
					{
						System.out.print("1\n");
					}
				}
				if (temp != (s.length() - 1))
				{
					System.out.print("0\n");
				}
				temp = 0;

			/*for(k=0;k<strlen(s);k++)
			{
				if(s[k]==' ')
					printf("0\n");
				else;
			}*/
			}
		}
	}

}

