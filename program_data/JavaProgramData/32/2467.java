package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  String c = new String(new char[100]);
	  String f = new String(new char[100]);
	  String e = new String(new char[100]);
	  int i;
	  int m;
	  int k;
	  int n;
	  int[] d = new int[100];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (n > 0)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  m = a.length();
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = tempVar3.charAt(0);
	  }
	  k = b.length();
	  for (i = 0;i < m;i++)
	  {
	  f = tangible.StringFunctions.changeCharacter(f, i, a.charAt(m - 1 - i));
	  }

	  for (i = 0;i < k;i++)
	  {
	  e = tangible.StringFunctions.changeCharacter(e, i, b.charAt(k - 1 - i));
	  }
	  for (i = k;i < m;i++)
	  {
	  e = tangible.StringFunctions.changeCharacter(e, i, '0');
	  }
	  for (i = 0;i < m;i++)
	  {
	  d[i] = f.charAt(i) - e.charAt(i);
	  }
	  for (i = 0;i < m;i++)
	  {
	  if (d[i] < 0)
	  {
	  d[i] = d[i] + 10;
	  d[i + 1] = d[i + 1] - 1;
	  }
	  }
	  for (i = 0;i < m;i++)
	  {
	  c = tangible.StringFunctions.changeCharacter(c, i, d[i] + '0');
	  }



	  int num = 0;
	  for (i = m - 1;i >= 0;i--)
	  {
		  if (num != 0)
		  {
		  System.out.printf("%c",c.charAt(i));
		  continue;
		  }
	   if (c.charAt(i) != '0')
	   {
		  System.out.printf("%c",c.charAt(i));
	  num = 1;
	   }
	  }
	  System.out.print("\n");
	  n--;
	  }

	}

}

