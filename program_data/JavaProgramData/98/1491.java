package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int n;
		int k;
		int sum = 0;
		int m = 0;
		char useless;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			useless = tempVar2.charAt(0);
		}

		//??
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;;j++)
			{
			  String tempVar3 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar3 != null)
			  {
				  str[i][j] = tempVar3.charAt(0);
			  }
			  if (str[i][j] == ' ')
			  {
				str[i][j] = '\0';
				break;
			  }
			}
		}
		str[n - 1] = new Scanner(System.in).nextLine();

	//	for(i=0;i<n;i++)
	//		puts(str[i]);


		for (i = 0;;i++)
		{
			m = String.valueOf(str[i]).length();
			sum = sum + m;

			if (sum <= 80)
			{
				if (sum < 80)
				{
					System.out.printf("%s",str[i]);
					if ((sum + 1 + String.valueOf(str[i + 1]).length() <= 80) && i < n - 1)
					{
						System.out.print(" ");
					}
					sum = sum + 1;
				}

				else
				{
					System.out.printf("%s",str[i]);
				}
			}

			else
			{
				if (sum + 1 > 80)
				{
					System.out.print("\n");
				}
				else
				{
			//	for(j=sum+1;j<=80;j++) printf(" ");
				System.out.print("\n");
				}
				sum = 0;
				i = i - 1;
			}
			if (i == n - 1)
			{
				break;
			}
		}


		return 0;
	}
}

