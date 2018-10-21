package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int a;
	   int b;
	//==========??????????????===========
	//   char ch1[10][80],ch2[10][80],max1[80],max2[80];
	//   gets(ch1[0]);   
	//   for(i=0;i<80;i++)
	//   { if(ch1[i]!='\0')
	//       gets(ch1[i]);
	//   }
	//   a=strlen(ch1);
	//   gets(ch2[0]);
	//   for(i=0;i<80;i++)
	//   {   if(ch2[i]!='\0')
	//       gets(ch2[i]);
	//   }
	//   b=strlen(ch2);
	//   strcpy(max,ch[0]);
	//======================================================
		 String ch1 = new String(new char[80]); // ????????
		 String ch2 = new String(new char[80]);
		 ch1 = new Scanner(System.in).nextLine();
		 a = ch1.length();
		 ch2 = new Scanner(System.in).nextLine();
		 b = ch2.length();
	//====????????????????????????===
		 for (i = 0;i < a;i++)
		 {
			 if (ch1.charAt(i) >= 'A' && ch1.charAt(i) <= 'Z')
			 {
				 ch1 = tangible.StringFunctions.changeCharacter(ch1, i, (ch1.charAt(i) + 32));
			 }
		 }
		 for (i = 0;i < b;i++)
		 {
			 if (ch2.charAt(i) >= 'A' && ch2.charAt(i) <= 'Z')
			 {
				 ch2 = tangible.StringFunctions.changeCharacter(ch2, i, (ch2.charAt(i) + 32));
			 }
		 }
		 if (strcmp(ch1,ch2) > 0)
		 {
			 System.out.printf("%c",'>');
		 }
		 if (strcmp(ch1,ch2) < 0)
		 {
			 System.out.printf("%c",'<');
		 }
		 if (strcmp(ch1,ch2) == 0)
		 {
			 System.out.printf("%c",'=');
		 }
	}
}

