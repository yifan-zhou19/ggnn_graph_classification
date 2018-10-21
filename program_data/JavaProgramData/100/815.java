package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		String str = new String(new char[300]);
		String stemp = new String(new char[300]);
		int i;
		int j;
		int[] itemp = new int[300];
		int count;
		char c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(stemp,0,300);
		j = 0;
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) //???????
			{


			 stemp = tangible.StringFunctions.changeCharacter(stemp, j, str.charAt(i));
			 j++;

			}

		}
		if (j == 0)
		{
			System.out.print("No");
		}
		//??stemp??????????????
	   for (i = 0;i < stemp.length();i++)
	   {
		   itemp[i] = 0;
	   }

	   //???stemp??????

	   for (i = 1;i <= stemp.length();i++)
	   {
		   for (j = 0;j < stemp.length() - i;j++)
		   {
			   if (stemp.charAt(j) > stemp.charAt(j + 1))
			   {
				 c = stemp.charAt(j + 1);
				 stemp = tangible.StringFunctions.changeCharacter(stemp, j + 1, stemp.charAt(j));
				 stemp = tangible.StringFunctions.changeCharacter(stemp, j, c);

			   }

		   }
	   }

	   for (i = 0;i < stemp.length();i++)
	   {
		   count = 1;
		   if (itemp[i] == 1)
		   {
			   continue;
		   }
			for (j = i + 1;j < stemp.length();j++)
			{
				 if (itemp[j] == 1)
				 {
					 continue;
				 }

				 if (stemp.charAt(j) == stemp.charAt(i))
				 {
					 itemp[j] = 1;
					 count++;
				 }

			}

		  System.out.printf("%c=%d\n",stemp.charAt(i),count);
	   }




















	}
}

