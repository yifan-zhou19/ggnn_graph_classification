package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String c = new String(new char[100]);
		  int i = 0;
		  int j = 1;
		  int k = 0;
		  int l = 0;
		  int d;
		  int[] b = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }

		  while (a.charAt(i) != '\0')
		  {
		  if (a.charAt(i) > 'Z')
		  {
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
		  }
		  i++;
		  }
		  c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0));
		  b[0] = 1;
		  while (a.charAt(j) != '\0')
		  {
		  if (a.charAt(j) == a.charAt(j - 1))
		  {
		  b[k]++;
		  }
		  else
		  {
		  l++;
		  k++;
		  c = tangible.StringFunctions.changeCharacter(c, l, a.charAt(j));
		  b[k] = 1;
		  }
		  j++;
		  }
		  for (d = 0;d <= k;d++)
		  {
		  System.out.printf("(%c,%d)",c.charAt(d),b[d]);
		  }
	}
}

