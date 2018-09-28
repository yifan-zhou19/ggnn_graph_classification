package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[][] r = new int[100][100];
		int i;
		int j;
		int t = 0;
		int l1;
		int l2;
		String c = new String(new char[100]);


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (true)

		{
		if (System.in.read() == '\n')
		{
			t++;
		}


		//a
		for (i = 0;i < 100;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		}

		for (i = 0;(c[i] = System.in.read()) != '\n';i++)
		{
			;
		}

		l1 = c.length() - 1;

		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}

		for (i = 0;i < l1;i++)
		{
			a[l1 - 1 - i] = c.charAt(i) - 48;
		}



		//b
		for (i = 0;i < 100;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		}

		for (i = 0;(c[i] = System.in.read()) != '\n';i++)
		{
			;
		}

		l2 = c.length() - 1;

		for (i = 0;i < 100;i++)
		{
			b[i] = 0;
		}

		for (i = 0;i < l2;i++)
		{
			b[l2 - 1 - i] = c.charAt(i) - 48;
		}





	  for (i = 0;i < l1;i++)
	  {
			  if (a[i] >= b[i])
			  {
				  a[i] = a[i] - b[i]; //??????????????a[]
			  }
			  else if (a[i] < b[i]) //??????
			  {
					a[i] = a[i] + 10 - b[i];

					for (j = i + 1;j < l1;j++)
					{
							if (a[j] != 0) //????0??1??????
							{
								  a[j]--; //??
								  break; //????
							}
							  else if (a[j] == 0) //????0??9??????????
							  {
								a[j] = 9;
							  }
					}
			  }

	  }





	  for (i = 0;i < l1;i++)
	  {
	  r[t][i] = a[i];
	  }

	  if (t == n)
	  {
		  break;
	  }



		}

	  for (t = 1;t <= n;t++)
	  {
		  for (j = l1 - 1;j >= 0;j--)
		  {
			if (r[t][j] != 0)
			{
				break;
			}
		  }


		  for (i = j;i >= 0;i--)
		  {
			  System.out.printf("%d",r[t][i]);
		  }
		System.out.print("\n");
	  }






	}


}

