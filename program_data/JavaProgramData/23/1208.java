package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  String s = new String(new char[100]); //????????????//
		  char[][] data = new char[200][100];
		  char c;
		  int k = 0;
		  int h = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  data[k++] = s;
		  while ((c = System.in.read()) != '\n')
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  s = tempVar2.charAt(0);
			  }
			  data[k++] = s;
		  }
		  for (h = k - 1;h >= 0;h--)
		  {
			  if (h == 0)
			  {
				  System.out.printf("%s\n",data[0]);
			  }
			  else
			  {
				  System.out.printf("%s ",data[h]);
			  }
		  }
	}


}

