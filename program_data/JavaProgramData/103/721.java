public class letterCount
{
	public char c;
	public int count;
}

package <missing>;

public class GlobalMembers
{
		public static String str = new String(new char[MAXLENGTH]);
		public static letterCount[] lc = tangible.Arrays.initializeWithDefaultletterCountInstances(MAXLENGTH); //?????
		//??
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		fgets(str, MAXLENGTH, stdin);

		//???????????
//C++ TO JAVA CONVERTER TODO TASK: The following method format was not recognized, possibly due to an unrecognized macro:
		for (i = 0; i < MAXLENGTH; i++)
		{
			if (str.charAt(i) == '\n')
			{
				break;
			}
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}

		//???????
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		j = 0; //????????
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		i = 0; //?????

		public static lc[j].c = str.charAt(0);
		public static lc[j].count = 1;
//C++ TO JAVA CONVERTER TODO TASK: The following method format was not recognized, possibly due to an unrecognized macro:
		while (true)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				lc[j].count++;
				i++;
			}
			else
			{
				if (str.charAt(i + 1) == '\n')
				{
					break;
				}

				j++;
				lc[j].c = str.charAt(i + 1);
				lc[j].count = 1;
				i++;
			}
		}

		//??
//C++ TO JAVA CONVERTER TODO TASK: The following method format was not recognized, possibly due to an unrecognized macro:
		for (int i = 0; i <= j; i++)
		{
			System.out.printf("(%c,%d)", lc[i].c, lc[i].count);
		}
//C++ TO JAVA CONVERTER TODO TASK: The following statement was not recognized, possibly due to an unrecognized macro:
		printf("\n");
		public static return 0 ;
}
}

