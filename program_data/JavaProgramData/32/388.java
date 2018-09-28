package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i = 0;
	 int j = 0;
	 int c = 0;
	 int l;
	 int k = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String[][] ppp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 ppp = (String)malloc(n * sizeof(String));
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  ppp[i] = (String)malloc(2 * sizeof(String));
	  for (j = 0;j < 2;j++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   ppp[i][j] = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < 2;j++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   ppp[i][j] = tempVar2.charAt(0);
	   }
	   l = String.valueOf(ppp[i][j]).length();
	   for (k = 0;k <= l;k++) //???
	   {
		ppp[i][j][100 - k] = ppp[i][j][l - k];
	   }
	   for (k = 0;k < 100 - l;k++)
	   {
		ppp[i][j][k] = '0';
	   }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (k = 99;k >= 1;k--)
	  {
	   //ppp[i][0][k-1] = ppp[i][0][k-1]-1;
			 c = ppp[i][0][k] - ppp[i][1][k];
	   //printf("%d\n" ,c);
	   if (c >= 0)
	   {
		ppp[i][0][k] = c + '0';
	   }
	   else
	   {
		ppp[i][0][k] = c + '0' + 10;
		ppp[i][0][k - 1]--;
	   }

	  }
	  for (k = 0;k < 100;k++)
	  {
	   if (ppp[i][0][k] > '0')
	   {
		c = k;
		break;
	   }
	  }
	  for (k = c;k < 100;k++)
	  {
	   System.out.printf("%c",ppp[i][0][k]); //?0?
	  }
	  System.out.print("\n");
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = 0;j < 2;j++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	   free(ppp[i][j]);
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(ppp[i]);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(ppp);
	}


}

