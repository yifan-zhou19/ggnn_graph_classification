package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int max1;
		int min1;
		int k;
		int x;
		int m;
		String a = new String(new char[N]);
		String max = new String(new char[U]);
		String min = new String(new char[U]);
		for (m = 0;m < N;m++)
		{
			a = tangible.StringFunctions.changeCharacter(a, m, '\0');
		}
		for (m = 0;m < U;m++)
		{
			max = tangible.StringFunctions.changeCharacter(max, m, '\0');
		}
		for (m = 0;m < U;m++)
		{
			min = tangible.StringFunctions.changeCharacter(min, m, '\0');
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;;)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else
			{
			k = 0;
				for (j = i;j < N;j++)
				{
				  if (a.charAt(j) == ' ' || a.charAt(j) == ',' || a.charAt(j) == '\0')
				  {
					  break;
				  }
				  else
				  {
					  k++;
				  }
				}
				 //printf("%d\n",k);
				 if (i == 0)
				 {
					max1 = min1 = k;
					for (x = 0;x < j;x++)
					{
						max = tangible.StringFunctions.changeCharacter(max, x, min[x] = a.charAt(x));
					}
				 }

				   else
				   {
						if (k > max1)
						{
							max1 = k;
							for (x = i;x < j;x++)
							{

								max = tangible.StringFunctions.changeCharacter(max, x - i, a.charAt(x));

							}

						}
						else if (k < min1 && k != 0)
						{
								for (m = 0;m < U;m++)
								{
								min = tangible.StringFunctions.changeCharacter(min, m, '\0');
								}
							min1 = k;
							for (x = 1;x < j;x++)
							{

								min = tangible.StringFunctions.changeCharacter(min, x - i, a.charAt(x));
							}


						}

				   }

			}
			i = j + 1;
		}
		System.out.println(max);
		System.out.println(min);
		return 0;
	}
}

