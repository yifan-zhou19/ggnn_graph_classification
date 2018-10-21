package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		String p = new String(new char[22]);
		int j;
		int error;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
			j = 0;
			error = 0;
			do
			{
				if (j == 0)
				{
					if (p.charAt(j) < 'a' || p.charAt(j) > 'z')
					{
						if (p.charAt(j) < 'A' || p.charAt(j) > 'Z')
						{
							if (p.charAt(j) != '_')
							{
								System.out.print("no\n");
								error = 1;
								break;
							}
						}
					}
				}


				if (p.charAt(j) < 'a' || p.charAt(j) > 'z')
				{
					//printf("a%c\n",p[j]);
					if (p.charAt(j) < 'A' || p.charAt(j) > 'Z')
					{
						//printf("A%c\n",p[j]);
						if (p.charAt(j) < '0' || p.charAt(j) > '9')
						{
							if (p.charAt(j) != '_')
							{
								System.out.print("no\n");
								error = 1;
								break;
							}
						}
					}
				}
				j++;
			}while (p.charAt(j) != '\0');
			if (error == 0)
			{
				System.out.print("yes\n");
			}
			i++;
		}while (i < n);
		return 0;
	}



}

