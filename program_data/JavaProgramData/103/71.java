package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[1000]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  int l;
	  int i;
	  int[] b = new int[1000];
	  int j;
	  l = a.length();
	  for (i = 0;i < l;i++)
	  {
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
		}
	  }
	  for (i = 0;i < 1000;i++)
	  {
	  b[i] = 0;
	  }
	  for (i = 0;i < l;i++)
	  {
		 for (j = i + 1;j < l;j++)
		 {
			if (a.charAt(j) == a.charAt(i))
			{
			  b[i]++;
			}
			else
			{
				break;
			}
		 }
		 b[i]++;
		 i = j - 1;
	  }
	  for (i = 0;i < 1000;i++)
	  {
		if (b[i] != 0)
		{
		System.out.printf("(%c,%d)",a.charAt(i),b[i]);
		}
	  }
	  System.in.read();
	  System.in.read();
	}

}

