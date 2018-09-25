package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		char[][] a =
		{
			{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}


	   for (i = 0;a[0][i] != '\0';i++)

	   {
			   System.out.printf("%c",a[0][i]);
			   k++;

	   }

		for (j = 1;j < n;j++)

		{
			if ((int)String.valueOf(a[j]).length() <= 80 - k - 1)

			{
			   System.out.print(" ");
			   k++;
			   for (i = 0;a[j][i] != '\0';i++)

			   {
			   System.out.printf("%c",a[j][i]);
			   k++;

			   }
			}




			else
			{
				   System.out.print("\n");
				   k = 0;
				   for (i = 0;a[j][i] != '\0';i++)
				   {
					   System.out.printf("%c",a[j][i]);
						   k++;
				   }

			}
		}

	}

}

