void function(int,int);

int main()
{
   char[][] s = new char[20][100];
   int i;
   int j;
   int a;
   int k;
   String tempVar = ConsoleInput.scanfRead();
   if (tempVar != null)
   {
	   a = Integer.parseInt(tempVar);
   }

   for (i = 0;i < a;i++)
   {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[i] = tempVar2.charAt(0);
	  }
   }

   for (i = 0;i < a;i++)
   {
	   k = 0;
	   if (s[i][0] <= '9' && s[i][0] >= '0')
	   {
		   System.out.print("no\n");
		   continue;
	   }
	   for (j = 0;j < String.valueOf(s[i]).length();j++)
	   {
		   if ((((s[i][j] <= '9' && s[i][j] >= '0') || (s[i][j] <= 'Z' && s[i][j] >= 'A') || (s[i][j] <= 'z' && s[i][j] >= 'a') || (s[i][j] == '_'))) == 0)
		   {
			   System.out.print("no\n");
			   k = 1;
			   break;
		   }
	   }
	   if (k == 0)
	   {
		   System.out.print("yes\n");
	   }
   }

   return 0;

}

