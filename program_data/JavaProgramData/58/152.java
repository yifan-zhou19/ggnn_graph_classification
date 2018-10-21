package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  System.in.read();
		  for (;n > 0;n--)
		  {
		  int i = 0;
			 String str = new String(new char[88]);
		   for (i = 0;i < 88;i++)
		   {
			   str = tangible.StringFunctions.changeCharacter(str, i, 'a');
		   }
		   str = new Scanner(System.in).nextLine();
		   //scanf("%s",str);

		   for (i = 0;i < str.length();i++)
		   {
				 if ((!Character.isLetterOrDigit(str.charAt(i))) && str.charAt(i) != '_')
				 {
					 System.out.printf("%d\n",0);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					 goto hhh;
				 }
		   }
			 //printf("%c",str[0]);
			//char a=str[0]; 
			//if((str[0]<="z"&&str[0]>="a")||(str[0]<="Z"&&str[0]>="A")||str[0]=="_")
			if (Character.isLetter(str.charAt(0)) || str.charAt(0) == '_')
			{
					System.out.printf("%d\n",1);
			}
			 else
			 {
					System.out.printf("%d\n",0);
			 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				hhh:
				;
		  } /*getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar();
	      getchar();getchar();getchar();getchar();getchar();getchar();getchar(); */
	}

}

