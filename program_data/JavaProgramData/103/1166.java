package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  int i;
		  int j;
		  int k = 0;
		  int l;
		  int tem = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();

		  for (i = 0;i < l;i++)
		  {
		  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		  {
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
		  }
		  }
		  if (l == 1)
		  {
		  System.out.printf("(%c,1)",a.charAt(0));
		  }
		  else
		  {
		  do
		  {
						  tem = 1;
						  for (j = k + 1;j <= l;j++)
						  {
											if (a.charAt(k) != a.charAt(j))
											{
											 System.out.printf("(%c,%d)",a.charAt(k),tem);
											 k = j;
											 break;
											}
											else
											{
											tem++;
											}
						  }
		  }while (k < l);
		  }
	}









}

