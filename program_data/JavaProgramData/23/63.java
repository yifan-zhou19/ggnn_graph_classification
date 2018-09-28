package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int n;
	//=============??????????????===========
	//   char ch[100];
	//   gets(ch);
	//   n=strlen(ch);
	//   for(i=n-1;i>=0;i--)
	//   {  
	//       printf("%c",ch[i]);
	//   }
	//====================================================
		 char[][] ch = new char[100][100]; //??????
		 n = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 ch[0] = tempVar.charAt(0);
		 }
		 for (i = 1;i < 100;i++)
		 {
			 if (System.in.read() != '\n')
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 ch[i] = tempVar2.charAt(0);
				 }
				 n = n + 1;
			 }
			  else
			  {
				  break;
			  }
		 }

		 for (i = n;i >= 1;i--)
		 {
			 System.out.printf("%s ",ch[i]);
		 }
		 System.out.printf("%s",ch[0]);
	}

}

