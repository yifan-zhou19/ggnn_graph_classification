package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int max = -2;
		int k = 0;
		int cida = -1;
		int j = 0;
		final String c = " ";
		do
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
		  }
		  i++;
		}while (c.charAt(i - 1) != '\n');
		k = i;

			if (k == 1)
			{
				 System.out.print("No\n");
			}
	else
	{
			for (i = 0;i <= k - 1;i++)
			{
						if (a[i] > max)
						{
						max = a[i];
						}
			}


		for (j = 0;j <= k - 1;j++)
		{
						 if (a[j] == max)
						 {
						a[j] = 0;
						 }
		}
		for (i = 0;i <= k - 1;i++)
		{
						if (a[i] > cida)
						{
						cida = a[i];
						}
		}





			  if (cida == 0)
			  {
				System.out.print("No\n");
			  }
			  else
			  {
				  System.out.printf("%d\n",cida);
			  }
	}

	}
}

