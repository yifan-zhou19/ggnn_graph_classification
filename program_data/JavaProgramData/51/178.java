package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;
		String a = new String(new char[1000]);
		char[][] b = new char[1000][5];
		String c = new String(new char[5]);
		int[] num = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			num[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			for (j = i;j <= i + n - 1;j++)
			{

				if (a.charAt(j) == '\0')
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop;
				}
				b[k][j - i] = a.charAt(j);
			}
			k++;
			b[k - 1][n] = '\0';
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		;

		//printf("%d\n",k);

		//puts(b[1]);
		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
			  if (strcmp(b[i],b[j]) == 0)
			  {
				  num[i]++;
			  }
			}
		}

			for (i = k - 2;i > 0;i--)
			{
				for (j = 0;j < i;j++)
				{
					if (num[j] < num[j + 1])
					{
						c = b[j];
						b[j] = b[j + 1];
						b[j + 1] = c;
						m = num[j];
						num[j] = num[j + 1];
						num[j + 1] = m;
					}
				}
			}
	if (num[0] == 0)
	{
	System.out.print("NO");
	}
	else
	{

				System.out.printf("%d\n",num[0] + 1);
		System.out.println(b[0]);
	 for (i = 1;;i++)
	 {
		if (num[i] == num[0])
		{
			System.out.println(b[i]);
		}
		else
		{
			break;
		}
	 }

	}

	}
}

