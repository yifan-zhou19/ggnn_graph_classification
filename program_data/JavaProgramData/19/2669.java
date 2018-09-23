package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] word = new char[100][100];
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   int i = 0;
	   char tmp;

	   while (scanf("%s",word[i]) != EOF)
	   {
		   i++;
		   String tempVar = ConsoleInput.scanfRead(null, 1);
		   if (tempVar != null)
		   {
			   tmp = tempVar.charAt(0);
		   }
		   if (tmp == '\n')
		   {
			   break;
		   }
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b = tempVar3.charAt(0);
	   }
	   int j = 0;
	   if (strcmp(word[0],a) != 0)
	   {
		   System.out.printf("%s",word[0]);
	   }
	   else
	   {
		   System.out.printf("%s",b);
	   }
	   for (j = 1;j < i;j++)
	   {
			if (strcmp(word[j],a) != 0)
			{
		   System.out.printf(" %s",word[j]);
			}
	   else
	   {
		   System.out.printf(" %s",b);
	   }

	   }
		return 0;
	}

}

