package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String voids = new String(new char[101]);
		String a = new String(new char[101]);
		String str = new String(new char[102]);
		String vstr = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int lena;
		int lenb;
		int lenv;
		vstr = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		lena = 0;
		lenb = 0;
		lenv = 0;

		for (i = 0;i < 101;i++)
		{
			voids = voids.substring(0, i);
		}

		str = tangible.StringFunctions.changeCharacter(str, 0, 32);
		for (i = 1;i < 102;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, vstr.charAt(i - 1));
		}
		/*for(i=0;str[i]!=0;i++)
		{
			printf("%c",str[i]);
		}*/
		//printf("\n");

		/*for(i=0;str[i]!=0;i++)
		{
			printf("%d ",str[i]);
		}*/
		//printf("\n");





		for (i = 0;a.charAt(i) != 0;i++)
		{
			lena++;
		}

		for (i = 0;b.charAt(i) != 0;i++)
		{
			lenb++;
		}

		//printf("%d %d\n", lena,lenb);




		for (i = 0;i < 101 && str.charAt(i) != 0;)
		{
			if (str.charAt(i) == 32)
			{
				int j;
				int k;
				k = 1;
				for (j = 1;j < lena + 1;j++)
				{
					if (str.charAt(j + i) != a.charAt(j - 1))
					{
						k = 0;
						break;
					}
					if (str.charAt(j + i) == 0)
					{
						k = 0;
						break;
					}
					if (str.charAt(j + i) == 32)
					{
						k = 0;
						break;
					}
				}

				if (k == 1)
				{
					int p;
					voids = tangible.StringFunctions.changeCharacter(voids, lenv, 32);

					for (p = 1;p < lenb + 1;p++)
					{
						voids = tangible.StringFunctions.changeCharacter(voids, lenv + p, b.charAt(p - 1));
					}
					lenv += (lenb + 1);
					i += (lena + 1);

				}
				//printf("%d",k);

				if (k == 0)
				{
					voids = tangible.StringFunctions.changeCharacter(voids, lenv, str.charAt(i));
					i++;
					lenv++;
				}
			}
			else
			{
				voids = tangible.StringFunctions.changeCharacter(voids, lenv, str.charAt(i));
				i++;
				lenv++;
			}
		}
		//printf("\n");

		if (voids.charAt(0) == 32)
		{
			for (i = 0;i < 100;i++)
			{
				voids = tangible.StringFunctions.changeCharacter(voids, i, voids.charAt(i + 1));
			}
		}




		for (i = 0;voids.charAt(i) != 0;i++)
		{
			System.out.printf("%c",voids.charAt(i));
		}
	}


}

