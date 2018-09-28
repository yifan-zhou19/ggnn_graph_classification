package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int l1;
		  int l2;
		  int l;
		  int m;
		  int i;
		  int k;
		  int g;
		  int f;
		  String str1 = new String(new char[250]);
		  String str2 = new String(new char[250]);
		  String str3 = new String(new char[252]);
		  String str4 = new String(new char[251]);
		  str1 = new Scanner(System.in).nextLine();
		  str2 = new Scanner(System.in).nextLine();

		  l1 = str1.length();

		  l2 = str2.length();
		  if (l1 == 1 && l2 == 1 && str1.charAt(0) == '0' && str2.charAt(0) == '0')
		  {
			 System.out.printf("%s",str1);
		  }
		  else
		  {
		//  printf("%d %d",l1,l2);
		  if (l1 > l2)
		  {

			l = l1;
			m = l1 - l2;

					 for (i = m;i <= l - 1;i++)
					 {
									  str4 = tangible.StringFunctions.changeCharacter(str4, i, str2.charAt(i - m));
					 }
					 for (i = 0;i < m;i++)
					 {
								   str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');

					 }
					 // printf("%s %s",str4,str2);
					 for (i = m;i <= l - 1;i++)
					 {
					 str2 = tangible.StringFunctions.changeCharacter(str2, i, str4.charAt(i));
					 }
					 str2 = tangible.StringFunctions.changeCharacter(str2, l, '\0');

				  //   printf("%s",str2);

				  //  printf("%s",str2);

		  }

		  else
		  {
				   l = l2;
				   m = l2 - l1;

					 for (i = m;i <= l - 1;i++)
					 {
									  str4 = tangible.StringFunctions.changeCharacter(str4, i, str1.charAt(i - m));
					 }
					 for (i = 0;i < m;i++)
					 {
								   str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');

					 }
					 for (i = m;i <= l - 1;i++)
					 {
					 str1 = tangible.StringFunctions.changeCharacter(str1, i, str4.charAt(i));
					 }

					 str1 = tangible.StringFunctions.changeCharacter(str1, l, '\0');

			   //    printf("%s",str1);
		  }
			g = 0;
			//printf("%d",l);
			for (i = l - 1;i != -1;i = i - 1)
			{ //printf("%d",l);


		  //printf("%d",i);       
							 if (str1.charAt(i) + str2.charAt(i) + g - 48 > '9')
							 {
										str3 = tangible.StringFunctions.changeCharacter(str3, i + 1, g + str1.charAt(i) + str2.charAt(i) - 58);
										g = 1;
										//printf("%c %c\n",str1[i],str1[i]);     
								 //printf("%c",str3[i+1]) ;                  
							 }
								else
								{
									str3 = tangible.StringFunctions.changeCharacter(str3, i + 1, str1.charAt(i) + str2.charAt(i) + g - 48);
								g = 0;
								}
			}
		  str3 = tangible.StringFunctions.changeCharacter(str3, l + 1, '\0');
		  k = 0;

		 if (g == 1)
		 {
		  str3 = tangible.StringFunctions.changeCharacter(str3, 0, '1');
		 }
		 if (g == 0)
		 {
		 for (i = 0;i <= l;i++)
		 {
		 str3 = tangible.StringFunctions.changeCharacter(str3, i, str3.charAt(i + 1));
		 }
		 }
		for (i = 0;;i++)
		{
			if (str3.charAt(i) != '0')
			{
			break;
			}
			k = k + 1;

		}
			  //printf("%d",k); 
			for (i = 0;i <= l;i++)
			{
			   str3 = tangible.StringFunctions.changeCharacter(str3, i, str3.charAt(i + k));
			 //  printf("%c",str3[i]);
			}
			   //printf("%c",str3[0]);

	   System.out.printf("%s\n",str3);



		  }
	}










}

