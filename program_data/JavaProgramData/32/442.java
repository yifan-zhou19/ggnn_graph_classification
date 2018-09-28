package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		int b;
		int n;
		int j;
		int m;
		int[] jg = new int[100];
		String a1 = new String(new char[100]);
		String a2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			a1 = new Scanner(System.in).nextLine();
			a1 = new Scanner(System.in).nextLine();
			a2 = new Scanner(System.in).nextLine();
			l1 = a1.length();
			l2 = a2.length();

			 b = l1 - l2;
			for (i = l1 - 1;i > l1 - l2 - 1;i--)
			{
				if (a1.charAt(i) > a2.charAt(i - b) || a1.charAt(i) == a2.charAt(i - b))
				{
					  jg[i] = a1.charAt(i) - a2.charAt(i - b);
				}
				 else if (a1.charAt(i) < a2.charAt(i - b))
				 {
					jg[i] = a1.charAt(i) + 10 - a2.charAt(i - b);
					a1 = tangible.StringFunctions.changeCharacter(a1, i - 1, a1.charAt(i - 1) - 1);
				 }

			}

			for (i = 0;i < l1 - l2;i++)
			{
				jg[i] = a1.charAt(i) - '0';
			}

			for (i = 0;i < l1;i++)
			{
				if (jg[i] == 0)
				{
					continue;
				}
				else
				{
					for (m = i;m < l1;m++)
					{
						System.out.printf("%d",jg[m]);

					}
					break;
				}
			};
			System.out.print("\n");

		}


		return 0;
	}
}

