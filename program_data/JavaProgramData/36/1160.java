package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int k;
	  int i;
	  int j;
	  String p = new String(new char[100]);
	  String q = new String(new char[100]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  q = tempVar2.charAt(0);
	  }
	  a = p.length();
	  b = q.length();
	  if (a == b)
	  {
		for (i = 0;i < a;i++)
		{
		  k = 1;
		  for (j = 0;j < a - i;j++)
		  {
			if (p.charAt(i) == q.charAt(j))
			{
			  k = 0;
			  for (c = j;c < a - i;c++)
			  {
			  q = tangible.StringFunctions.changeCharacter(q, c, q.charAt(c + 1));
			  }
			  break;
			}
		  }
		  if (k == 1)
		  {
		  break;
		  }
		}
		if (k == 1)
		{
		System.out.print("NO");
		}
		if (k == 0)
		{
		System.out.print("YES");
		}
	  }
	  else
	  {
		System.out.print("NO");
	  }

	}
}

