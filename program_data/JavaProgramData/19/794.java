package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  char[][] zfc = new char[100][100];
	  int i;
	  int j;
	  int len;
	  int k = 1;
	  int[] wz = new int[100];
	  s = new Scanner(System.in).nextLine();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  len = s.length();
	  wz[0] = 0 - 1;
	  for (i = 0; i < len; i++)
	  {
		  if (s.charAt(i) == ' ')
		  {
			  wz[k] = i;
			  k++;
		  }
	  }
	  wz[k] = len;
	  for (i = 0;i < k;i++)
	  {
		  for (j = wz[i] + 1;j < wz[i + 1];j++)
		  {
		  zfc[i][j - wz[i] - 1] = s.charAt(j);
		  }
		  zfc[i][j - wz[i] - 1] = '\0';
	  }
	  if (strcmp(zfc[0],a) != 0)
	  {
			  System.out.printf("%s",zfc[0]);

	  }
		  else
		  {
			  System.out.printf("%s",b);
		  }

	  for (i = 1;i < k;i++)
	  {
		  if (strcmp(zfc[i],a) != 0)
		  {
			  System.out.printf(" %s",zfc[i]);

		  }
		  else
		  {
			  System.out.printf(" %s",b);
		  }
	  }





	  return 0;
	}


}

