package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int t;
		String comma = new String(new char[300]);
		for (i = 0,j = 1;comma.charAt(j - 1) != '\n';i++,j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				comma = tangible.StringFunctions.changeCharacter(comma, j, tempVar2);
			}
		}
		if (i - 1 == 0)
		{
			System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto stop;
		}

		n = i;

		for (j = 1;j < n;j++)
		{
				for (i = 0;i < n - j;i++)
				{
						if (a[i] > a[i + 1])
						{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
						}
				}
		}

				for (i = n - 2;i >= 0;i--)
				{
					if (a[i] != a[n - 1])
					{
						System.out.printf("%d",a[i]);
					break;
					}
				}


					if (a[0] == a[n - 1])
					{
						System.out.print("No");
					}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	stop:
	;

	}
}

