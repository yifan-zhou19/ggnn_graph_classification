package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int max;
	  int p;
	 int mwj;
	  int[] shu = new int[1000];
	  char[][] zuo = new char[1000][30];
	  int[] w = new int[26];
	  for (i = 0;i < 26;i++)
	  {
		  w[i] = 0;
	  }
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  shu[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  zuo[i] = tempVar3.charAt(0);
		  }
		  for (j = 0;j < String.valueOf(zuo[i]).length();j++)
		  {
			 w[(zuo[i][j] - 65)] = w[(zuo[i][j] - 65)] + 1;
		  }
	  }
	  max = w[0];
	  p = 0;
	  for (i = 0;i < 26;i++)
	  {
		  if (w[i] > max)
		  {
			  max = w[i];
			  p = i;
		  }
	  }
	  System.out.printf("%c\n",p + 65);
	  System.out.printf("%d\n",max);
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < String.valueOf(zuo[i]).length();j++)
		  {
			  mwj = zuo[i][j];
			  if (mwj == p + 65)
			  {
				  System.out.printf("%d\n",shu[i]);
				  break;
			  }
		  }

	  }
	}




}

