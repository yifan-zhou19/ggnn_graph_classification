package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] wordbuff = new char[50][20];
	 char ch;
	 String target = new String(new char[20]);
	 String replace = new String(new char[20]);
	 int i;
	 int j;
	 for (i = 0;i < 50;i++)
	 {
	  for (j = 0;j < 20;j++)
	  {
	   wordbuff[i][j] = '\0';
	  }
	 }

	 i = 0;
	 j = 0;
	 while (true)
	 {
	  ch = System.in.read();
	  if (ch != '\n' && ch != ' ')
	  {
	   wordbuff[i][j] = ch;
	   j++;
	  }
	  else
	  {
	   i++;
	   j = 0;
	  }
	  if (ch == '\n')
	  {
		  break;
	  }
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 target = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead("\n");
	 if (tempVar2 != null)
	 {
		 replace = tempVar2.charAt(0);
	 }
	 int n;
	 for (n = 0; n < i;n++)
	 {
	  if (!strcmp(wordbuff[n],target))
	  {
	   wordbuff[n] = replace;
	  }
	 }
	 for (n = 0;n < i;n++)
	 {
	  if (n == 0)
	  {
		  System.out.printf("%s",wordbuff[n]);
	  }
	  else
	  {
		  System.out.printf(" %s",wordbuff[n]);
	  }
	 }
	 return 0;
	}

}

